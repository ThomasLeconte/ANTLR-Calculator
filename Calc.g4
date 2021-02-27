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

        NEWLINE*

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
            String boucle1 = getNewLabel();
            $code = $a.code;
            $code += $b.code;
            $code += $operateur.code;
            $code += "JUMPF "+boucle1+"\n";
            $code += "PUSHI 1\n";
            $code += "LABEL "+ boucle1 + "\n";
            $code += "PUSHI 0\n";
        }
    | c = condition logique d = condition
        {
            String boucle1 = getNewLabel();
            String exit = getNewLabel();

            //Declaration des deux variables de test, initialisées à 0
            $code = "PUSHI 0\n"; //reservation
            $code += "PUSHI 0\n"; //False par défaut
            tableSymboles.putVar("test1", "int"); //On sauvegarde la variable
            AdresseType at = tableSymboles.getAdresseType("test1");
            $code += "STOREG "+at.adresse+"\n";

            $code += "PUSHI 0\n"; //reservation
            $code += "PUSHI 0\n"; //False par défaut
            tableSymboles.putVar("test2", "int"); //On sauvegarde la variable
            AdresseType at2 = tableSymboles.getAdresseType("test2");
            $code += "STOREG "+at2.adresse+"\n";

            if($logique.code.equals("&&")){
                $code += $c.code; //le code c renvoie en dernier 1 ou 0
                $code += "STOREG "+at.adresse+"\n"; //on stocke le résultat de la première condition dans test1
                $code += $d.code; //le code d renvoie en dernier 1 ou 0
                $code += "STOREG "+at2.adresse+"\n"; //on stocke le résultat de la deuxième condition dans test2
                $code += "PUSHG "+at.adresse+"\n"; //on envoie test1 en haut de la pile
                $code += "PUSHI 1\n";
                $code += "EQUAL\n"; //si test1 == 1 on va tester test2
                $code += "JUMPF "+boucle1+"\n"; //Sinon on s'arrête là et on renvoie false (PUSHI 0)
                $code += "PUSHG "+at2.adresse+"\n"; //on envoie test2 en haut de la pile
                $code += "PUSHI 1\n";
                $code += "EQUAL\n"; //si test2 == 1 on renvoie true donc 1 car test1 et test2 sont égals à 1
                $code += "JUMPF "+boucle1+"\n"; //Sinon on renvoie false (PUSHI 0)
                $code += "PUSHI 1\n";
                $code += "JUMP "+exit+"\n"; 
                $code += "LABEL "+ boucle1 + "\n";
                $code += "PUSHI 0\n"; //false
                $code += "LABEL "+exit+"\n";
            }else if($logique.code.equals("||")){
                // ...
            }else{
                // !
                // ...
            }
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