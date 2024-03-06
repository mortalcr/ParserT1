lexer grammar ElScanner;

//símbolos
PyCOMA  : ';' ;
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
COMA    : ',';

//palabras reservadas
IF      : 'if' ;
WHILE   : 'while' ;
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';

ID : ('_'|) LETTER (LETTER|DIGIT|'_')* ;
NUM : DIGIT+ ;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;

//elementos omitidos
LINE_COMMENT:   '//' ~[\r\n]* -> skip ;
WS  :   [ \t\n\r]+ -> skip ;