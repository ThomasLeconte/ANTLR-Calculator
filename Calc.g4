grammar Calc;

@members { private TableSymboles tableSymboles = new TableSymboles(); }

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
		    $code= $assignation.code;
        }
    ;

expression returns [ String code ]
    : a = expression op = ( '/' | '*' ) b = expression 
        {if($op.text.equals("/")){
            $code = $a.code + $b.code + "DIV\n"; 
        }else{ 
            $code = $a.code + $b.code + "MUL\n";
        }}
    | c = expression op = ( '+' | '-' ) d = expression 
        {if($op.text.equals("+")){
            $code = $c.code + $d.code + "ADD\n"; 
        }else{ 
            $code = $c.code + $d.code + "SUB\n";
        }}
    | '(' e = expression ')' {$code = $e.code;}
    | IDENTIFIANT
        {
            AdresseType var = tableSymboles.getAdresseType($IDENTIFIANT.text);
            $code = "PUSHG "+var.adresse+"\n";
        }
    | f = ENTIER
        {
            $code = "PUSHI " + $f.text +"\n";
        }
    | write
        {
            $code = $write.code;
        }
    | read
        {
            $code = $read.code;
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

finInstruction : ( NEWLINE | ';' )+ ;

// lexer
NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

TYPE : 'int' | 'float' ;

IDENTIFIANT : ('a'..'z')+ ;

UNMATCH : . -> skip ;