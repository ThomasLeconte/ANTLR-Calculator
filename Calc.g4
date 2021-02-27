grammar Calc;

@members {
            private TableSymboles tableSymboles = new TableSymboles(); 
            private int _cur_label = 1;
            /** générateur de nom d'étiquettes pour les boucles */
            private String getNewLabel() { return "B" +(_cur_label++); }
            // ...
        }

start : 
        calcul EOF;


calcul returns [ String code ] 
@init{ $code = new String(); }   // On initialise code, pour ensuite l'utiliser comme accumulateur

@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*  //Nouveau code      
        
        NEWLINE*
        
        (instruction { $code += $instruction.code; })*

        { $code += "HALT\n"; } 
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
    | assignation finInstruction
        { 
		    $code = $assignation.code;
        }
    ;

expression returns [ String code ]
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
            $code = "PUSHG "+var.adresse+"\n";
        }
    | ENTIER
        {
            $code = "PUSHI " + $ENTIER.text +"\n";
        }
    | '-' f = ENTIER
        {
            $code = "PUSHI 0\n";
            $code += "PUSHI "+$f.text+"\n";
            $code += "SUB\n";
        }
    | write
        {
            $code = $write.code;
        }
    | read
        {
            $code = $read.code;
        }
    | boucle
        {
            $code = $boucle.code;
        }
    | bloc
        {
            $code = $bloc.code;
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
            $code = $a.code;
            $code += $b.code;
            $code += $operateur.code;
        }
    | c = condition logique d = condition 
        {
            String condition2 = getNewLabel();
            String fin = getNewLabel();
            AdresseType test1 = tableSymboles.getAdresseType("test1"); 
            AdresseType test2 = tableSymboles.getAdresseType("test2");//on initialise les variables test à faux de base
            $code = "PUSHI 1"; 
            $code += "STOREG "+test1.adresse+"\n";
            $code = "PUSHI 2"; 
            $code += "STOREG "+test2.adresse+"\n";
            $code += $c.code;
            if($logique.code.equals("&&")){
                $code += "JUMPF "+fin+"\n"; // si c'est faux, on va direct à la fin
                $code += $d.code;
                $code += "JUMPF "+fin+"\n"; 
                $code += "PUSHI 1" + "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
                $code += "STOREG "+test2.adresse+"\n";               
            }else if($logique.code.equals("||")){
                $code += "JUMPF "+condition2+"\n";
                $code += "PUSHI 2"+ "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
                $code += "STOREG "+test1.adresse+"\n"; 
                $code += "JUMP " +fin+"\n";//si le premier est vrai, on va direct faire le test
                $code += "LABEL " + condition2 + "\n";
                $code += $d.code;
                $code += "JUMPF "+fin+"\n";
                $code += "PUSHI 1" + "\n"; //si c'est vrai, on fait en sorte que le test de fin return true
                $code += "STOREG "+test2.adresse+"\n"; 
                $code += "JUMP " +fin+"\n";
            }else{
                // pour "!"
                //...
            }
            $code += "LABEL " + fin + "\n";
            $code += "PUSHG " + test1.adresse + "\n";
            $code += "PUSHG " + test2.adresse + "\n";
            $code += $code += "EQUAL\n";
        }
    ;

boucle returns [ String code ] 
    : 'while(' condition ')' a = instruction
        {
            String boucle1 = getNewLabel();
            String boucle2 = getNewLabel();
            
                $code = "LABEL " + boucle1 + "\n";
                $code += $condition.code;
                $code += "JUMPF "+ boucle2 + "\n";            
                $code += $a.code;
                $code += "JUMP "+ boucle1 + "\n";
                $code += "LABEL "+ boucle2 + "\n";
                $code += "WRITE \n";
                $code += "POP \n";
            
        }
    ;

decl returns [ String code ]
    : TYPE IDENTIFIANT finInstruction
        {
            $code = "PUSHI 0\n";
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }

    | TYPE IDENTIFIANT '=' expression finInstruction
        {
            $code = "PUSHI 0\n";
            $code += $expression.code; //PUSHI x
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); //On sauvegarde la variable
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            $code += "STOREG "+at.adresse+"\n";
        }
    ; 

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text); //On récupère l'@ de la variable X
            $code = $expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
            $code += "STOREG "+at.adresse+"\n"; //On stocke la valeur d'expression à l'@ de X
        }
    ;

bloc returns[ String code ]
    : '{' NEWLINE instruction* NEWLINE* '}'
        {
            $code = $instruction.code;
        }
    ;

write returns [ String code ] 
    : 'write(' expression ')'
        {
            $code = $expression.code;
            $code += "WRITE\n";
        }
    ;

read returns [ String code ]
    : 'read(' expression ')'
        {
            $code = $expression.code;
        }
    ;

finInstruction : ( NEWLINE | ';' )+ ;

// lexer
NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER: ('0' ..'9')+;

FLOAT : ENTIER+'.'ENTIER+ ;

TYPE : 'int' | 'float' ;

IDENTIFIANT : ('a'..'z')+ ;

UNMATCH : . -> skip ;