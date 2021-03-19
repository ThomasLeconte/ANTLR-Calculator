grammar Calc;

@members {
            private TablesSymboles tableSymboles = new TablesSymboles();
            private int _cur_label = 1;
            /** générateur de nom d'étiquettes pour les boucles */
            private String getNewLabel() { return "B" +(_cur_label++); }
            private boolean isLocalAdress(AdresseType at){
                if(at.adresse >= 0){
                    return false;
                }else{
                    return true;
                }
            }
            // ...
        }

start : 
        calcul EOF;


calcul returns [ String code ] 
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur 
@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*        
        { $code += "  JUMP Main\n"; }
        NEWLINE*
        
        (fonction { $code += $fonction.code; })* 
        NEWLINE*
        
        { $code += "LABEL Main\n"; }
        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; } 
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
    | decl finInstruction
        { 
		    $code = $decl.code;
        }
    | assignation finInstruction
        { 
		    $code = $assignation.code;
        }
    | write finInstruction
        {
            $code = $write.code;
        }
    | read finInstruction
        {
            $code = $read.code;
        }
    | boucle 
        {
            $code = $boucle.code;
        }
    | bloc finInstruction
        {
            $code = $bloc.code;
        }
    | ifCondition 
        {
            $code = $ifCondition.code;
        }
    | RETURN expression finInstruction    
        {
            $code = "PUSHI 0\n";
            $code += $expression.code;
            tableSymboles.putVar("ReturnValue", "int"); //On sauvegarde la variable
            AdresseType at = tableSymboles.getAdresseType("ReturnValue");
            $code += "STOREL "+at.adresse+"\n";
            $code += "RETURN\n";
            $code += "RETURN\n";
        }
    ;


fonction returns [ String code ]
@init{ $code = new String(); }
@after { tableSymboles.dropTableLocale(); }
    : TYPE
        {
            $code += "PUSHI 0\n";
        }
        IDENTIFIANT '('  params ? ')'
        {
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            
            tableSymboles.newTableLocale();
            $code += "LABEL "+$IDENTIFIANT.text+"\n";
            //On déclare la fonction pour pouvoir jump dessus plus tard
            tableSymboles.newFunction($IDENTIFIANT.text, $TYPE.text);
        }
        bloc 
        {
            $code += $bloc.code;
            if(isLocalAdress(at)){
                $code += "STOREL "+at.adresse+"\n";
            }else{
                $code += "STOREG "+at.adresse+"\n";
            }
        }
    ;

params
    : TYPE IDENTIFIANT
        {
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); //On sauvegarde la variable
        }  
        ( ',' TYPE IDENTIFIANT
            {
                tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); //On sauvegarde la variable
                // code java gérant une variable locale (argi)
            } 
        )*
    ;

// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null) 
args returns [ String code, int size] 
@init{ $code = new String(); $size = 0; }
    : ( expression 
    { 
        $code += $expression.code;
    }
    ( ',' expression 
    { 
        $code += $expression.code;
    } 
    )*
      )? 
    ;

bloc returns[ String code ]
@init{ $code = new String(); }
    : '{' NEWLINE? (instruction { $code += $instruction.code; })* '}' NEWLINE*
    ;

expression returns [ String code, String type ]
@init{ $code = new String(); $type = new String(); }
    : a = expression op = ( '/' | '*' ) b = expression 
        {
            if($op.text.equals("/")){
                $code = $a.code + $b.code + "DIV\n"; 
            }else{ 
                $code = $a.code + $b.code + "MUL\n";
            }
        }
    | c = expression op = ( '+' | '-' ) d = expression 
        {
            if($op.text.equals("+")){
                $code = $c.code + $d.code + "ADD\n"; 
            }else{ 
                $code = $c.code + $d.code + "SUB\n";
            }
        }
    | '(' e = expression ')' {$code = $e.code;}
    | IDENTIFIANT
        {
            AdresseType var = tableSymboles.getAdresseType($IDENTIFIANT.text);
            if(var.type == "float"){
                $type = "float";
            }
            System.out.println($type);
            if(isLocalAdress(var)){
                $code = "PUSHL "+var.adresse+"\n";
            }else{
                $code = "PUSHG "+var.adresse+"\n";
            }
        }
    | ENTIER
        {
            $code = "PUSHI " + $ENTIER.text +"\n";
        }
    | '-' ENTIER
        {
            $code = "PUSHI 0\n";
            $code += "PUSHI "+$ENTIER.text+"\n";
            $code += "SUB\n";
        }
    | FLOAT
        {
            $type = "float";
            $code = "PUSHF "+$FLOAT.text+"\n";
        }
    | IDENTIFIANT '(' args ')'                  // appel de fonction  
        {
            $code = $args.code;
            String var = tableSymboles.getFunction($IDENTIFIANT.text); //retourne le type de la fonction
            $code += "CALL "+$IDENTIFIANT.text+"\n";
        }
    ;

decl returns [ String code ]
    : TYPE IDENTIFIANT finInstruction
        {
            if($TYPE.text == "int"){
                $code = "PUSHI 0\n";
            }else{
                $code = "PUSHI 0\n";
                $code = "PUSHI 0\n";
            }
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }

    | TYPE IDENTIFIANT '=' expression finInstruction
        {
            if($TYPE.text == "int"){
                $code = "PUSHI 0\n";
            }else{
                $code = "PUSHI 0\n";
                $code = "PUSHI 0\n";
            }
            $code += $expression.code; //PUSHI x
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); //On sauvegarde la variable
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            if(isLocalAdress(at)){
                $code += "STOREL "+at.adresse+"\n";
            }else{
                $code += "STOREG "+at.adresse+"\n";
            }
        }
    ; 

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text); //On récupère l'@ de la variable X
            $code = $expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
            if(isLocalAdress(at)){
                $code += "STOREL "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
            }else{
                $code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
            }

        }
    | IDENTIFIANT operator = ( '++'| '--' )
        {
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            if(isLocalAdress(at)){
                $code = "PUSHL "+at.adresse+"\n";
            }else{
                $code = "PUSHG "+at.adresse+"\n";
            }
            $code = "PUSHG "+at.adresse+"\n";
            if($operator.text.equals("++")){
                $code += "PUSHI 1\n";
                $code += "ADD\n";
            }else{
                $code += "PUSHI 1\n";
                $code += "SUB\n";
            }
            if(isLocalAdress(at)){
                $code += "STOREL "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
            }else{
                $code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
            }
        }
    ;

operateur returns [String code]
    : '>'  { $code = "SUP\n"; }
    | '>=' { $code = "SUPEQ\n"; }
    | '<' { $code = "INF\n"; }
    | '<=' { $code = "INFEQ\n"; }
    | '==' { $code = "EQUAL\n"; }
    | '!=' { $code = "NEQ\n"; }
    ;

logique returns [String code]
    : '&&' { $code = "&&"; }
    | '||' { $code = "||"; }
    ;

condition returns [String code]
    : ('true')  
        {
            $code = "PUSHI 1\n";
        }
    | ('false')
        {
            $code = "PUSHI 0\n";
        }
    | a = expression operateur b = expression
        {
            String boucle1 = getNewLabel();
            String exit = getNewLabel();
            $code = $a.code;
            $code += $b.code;
            $code += $operateur.code;
            $code += "JUMPF "+boucle1+"\n";
            $code += "PUSHI 1\n";
            $code += "JUMP "+exit+"\n";
            $code += "LABEL "+ boucle1 + "\n";
            $code += "PUSHI 0\n";
            $code += "LABEL "+exit+"\n";

        }
    | c = condition logique d = condition
        {
            String boucle1 = getNewLabel();
            String exit = getNewLabel();

            if($logique.code.equals("&&")){
                $code = $c.code; //le code c renvoie en dernier 1 ou 0
                $code += "PUSHI 1\n";
                $code += "EQUAL\n";
                $code += "JUMPF "+boucle1+"\n";
                $code += $d.code;
                $code += "PUSHI 1\n";
                $code += "EQUAL\n";
                $code += "JUMPF "+boucle1+"\n";
                $code += "PUSHI 1\n";
                $code += "JUMP "+exit+"\n"; 
            }else{ //OPERATEUR ||
                String or = getNewLabel();
                
                //on test le premier
                $code = $c.code;
                $code += "PUSHI 1\n";
                $code += "EQUAL\n";
                $code += "JUMPF "+or+"\n"; //Si c'est faux on test la deuxième condition
                $code += "PUSHI 1\n"; //Sinon on s'arrête là et on renvoie 1
                $code += "JUMP "+exit+"\n";

                //on test le second
                $code += "LABEL "+or+"\n";
                $code += $d.code;
                $code += "PUSHI 1\n";
                $code += "EQUAL\n"; //si c'est vrai on renvoie 1
                $code += "JUMPF "+boucle1+"\n"; //sinon on renvoie 0
                $code += "PUSHI 1\n";
                $code += "JUMP "+exit+"\n"; 
            }
            $code += "LABEL "+ boucle1 + "\n";
            $code += "PUSHI 0\n"; //false
            $code += "LABEL "+exit+"\n";
        }
    | '!' condition
        {
            String boucle1 = getNewLabel();
            String exit = getNewLabel();

            $code = $condition.code;
            $code += "PUSHI 0\n"; //On test si la négation de condition est égale à 0 (false)
            $code += "EQUAL \n";
            $code += "JUMPF "+boucle1+"\n";
            $code += "PUSHI 1\n";
            $code += "JUMP "+exit+"\n";
            $code += "LABEL "+ boucle1 + "\n";
            $code += "PUSHI 0\n"; //false
            $code += "LABEL "+exit+"\n";
        }
    | '(' condition ')' { $code = $condition.code; }
    ;

boucle returns [ String code ] 
    : 'while' '(' condition ')' a = instruction
        {
            String boucle1 = getNewLabel();
            String boucle2 = getNewLabel();
            
            $code = "LABEL " + boucle1 + "\n";
            $code += $condition.code;
            $code += "JUMPF "+ boucle2 + "\n";
            $code += $a.code;
            $code += "JUMP "+ boucle1 + "\n";
            $code += "LABEL "+ boucle2 + "\n";
        }
        |'repeat' d = instruction 'until' '(' e = condition ')'
        {
            String debutRepeat = getNewLabel();
            String finBoucle = getNewLabel();

            $code =  "LABEL " + debutRepeat + "\n";
            $code += $d.code;
            $code += $e.code;
            $code += "JUMPF "+ debutRepeat + "\n";
            $code += "JUMP "+ finBoucle + "\n";
            $code += "LABEL "+ finBoucle + "\n";
        }
        |'for' '(' c= assignation ';' condition ';' b=assignation ')' instruction
        {
            String debutFor = getNewLabel();
            String exit = getNewLabel();

            $code = $c.code;
            $code += "LABEL " + debutFor + "\n";
            $code += $condition.code;
            $code += "JUMPF "+ exit + "\n";
            $code += $instruction.code;
            $code += $b.code;
            $code += "JUMP "+ debutFor + "\n";
            $code += "LABEL "+ exit + "\n";
        }
    ;

ifCondition returns [ String code ]
    : 'if' '(' condition ')' a = instruction 'else' b = instruction
        {
            String elseArea = getNewLabel();
            String exit = getNewLabel();

            $code = $condition.code;
            $code += "JUMPF "+elseArea + "\n";
            $code += $a.code;
            $code += "JUMP "+exit+"\n";
            $code += "LABEL "+elseArea + "\n";
            $code += $b.code;
            $code += "JUMP "+exit+"\n"; 
            $code += "LABEL "+exit+"\n";
        }
    | 'if' '(' condition ')' a = instruction
        {
            String exit = getNewLabel();

            $code = $condition.code;
            $code += "JUMPF "+exit + "\n";
            $code += $a.code;
            $code += "JUMP "+exit+"\n";
            $code += "LABEL "+exit+"\n";
        }
    ;

write returns [ String code ] 
    : 'write' '(' expression ')'
        {
            $code = $expression.code;
            if($expression.type == "float"){
                $code += "WRITEF\n";
                $code += "POP \n";
                $code += "POP \n"; //2 pop si c'est un float  
            }else{
                $code += "WRITE\n";
                $code += "POP \n";
            }
        }
    ;

read returns [ String code ]
    : 'read' '(' IDENTIFIANT ')'
        {
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            if(at.type == "float"){
                $code = "READF\n";
            }else{
                $code = "READ\n";
            }
            if(at.adresse >= 0){
                $code += "STOREG " + at.adresse + "\n";
            }else{
                $code += "STOREL " + at.adresse + "\n";
            }
        }
    ;

finInstruction : ( NEWLINE | ';' )+ ;

COMMENT: '/*'~[\r\n]*'*/';
// lexer
NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

RETURN: 'return';

ENTIER: ('0' ..'9')+;

FLOAT : ENTIER+'.'ENTIER* ;

TYPE : 'int' | 'float' ;

IDENTIFIANT : ('a'..'z')+ ;

UNMATCH : . -> skip ;

