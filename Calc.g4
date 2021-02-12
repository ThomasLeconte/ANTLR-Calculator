grammar Calc;

start : 
        calcul EOF;
calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
    : 
        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
   | finInstruction
        {
            $code="";
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
    | f = ENTIER {$code = "PUSHI " + $f.text +"\n";}
    ;

finInstruction : ( NEWLINE | ';' )+ ;

// lexer
NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

UNMATCH : . -> skip ;