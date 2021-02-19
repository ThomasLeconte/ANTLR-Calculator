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

        { $code += "  HALT\n"; } 
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
    | assignation finInstruction
        { 
		$code="";
        }
    | write finInstruction
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
    | IDENTIFIANT {
                    AdresseType var = tableSymboles.getAdresseType($IDENTIFIANT.text);
                    $code = "PUSHG "+var.adresse+"\n";

                  }
    | f = ENTIER {$code = "PUSHI " + $f.text +"\n";}
    ;

decl returns [ String code ]
    : TYPE IDENTIFIANT finInstruction
        {
            $code = "PUSHI 0\n";
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }

    | TYPE IDENTIFIANT '=' expression finInstruction
        {
            $code = $expression.code; //PUSHI x
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text); //On sauvegarde la variable
        }
    ; 

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            System.out.println("Variable trouvée (de type "+ at.type +" et de valeur "+$expression.code+") !");
            $code = $expression.code; //PUSHI x (qui peut aussi être le code de l'expression)
            $code += "STOREG "+at.adresse; //ON enregistre l'expression dans X
        }
    ;

write returns [ String code ] 
    :
        'write(' var = expression ')'
        {
            $code += "PUSHG 0\n";
            $code += "WRITE\n";
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