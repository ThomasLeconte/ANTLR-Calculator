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
    ;

expression returns [ String code ]
    : a = expression op = ( '/' | '*' ) b = expression 
                                                        {if($op.text.equals("/")){
                                                            $code = $a.code + $b.code + "DIV\n"; 
                                                        }else{ 
                                                            $code = $a.code + $b.code + "MUL\n";}
                                                        }
    | c = expression op = ( '+' | '-' ) d = expression 
                                                        {if($op.text.equals("+")){
                                                            $code = $c.code + $d.code + "ADD\n"; 
                                                        }else{ 
                                                            $code = $c.code + $d.code + "SUB\n";}
                                                        }
    | '(' e = expression ')' {$code = $e.code;}
    | f = ENTIER {$code = "PUSHI " + $f.text +"\n";}
    ;

decl returns [ String code ] 
    :
        TYPE IDENTIFIANT finInstruction
        {
            //System.out.println("TYPE : "+$TYPE.text + " IDENTIFIANT "+$IDENTIFIANT.text);
            $code = "FREE "+AdresseType.getSize($TYPE.text)+"\n";
            tableSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }
    ; 

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {
            //tableSymboles.putVar($IDENTIFIANT.text, "int"); //RETOURNE Erreur : Variable "x" de type int déjà définie
            AdresseType at = tableSymboles.getAdresseType($IDENTIFIANT.text);
            System.out.println("Variable trouvée (de type "+ at.type +" et de valeur "+$expression.code+") !");
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