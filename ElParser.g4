parser grammar ElParser;

// Import the lexer tokens
options {
  tokenVocab = ElScanner;
}

program :       singleCommand;
command :       singleCommand (PyCOMA singleCommand)* ;
singleCommand : ID  (ASSIGN expression | PIZQ expression PDER)
                | IF expression THEN singleCommand ELSE singleCommand
                | WHILE expression DO singleCommand
                | LET declaration IN singleCommand
                | BEGIN command END
                ;
declaration  :  singleDeclaration (PyCOMA singleDeclaration)* ;
singleDeclaration :
                CONST ID VIR expression
    	        | VAR ID DOSPUN typeDenoter
    	        ;
typeDenoter :   ID;
expression :    primaryExpression (operator primaryExpression)* ;
primaryExpression :
                NUM
                | ID
                | PIZQ expression PDER
                ;
operator :      SUM | SUB | MUL | DIV ;



