grammar gramm;

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INTEGER : 'INTEGER';
REAL : 'REAL';
BOOLEAN : 'BOOLEAN';
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
WHILE : 'WHILE';
DO : 'DO';
BEGIN : 'BEGIN';
END : 'END';
RETURN : 'RETURN';
MODULE : 'MODULE';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMI : ';';
ASSIGN : ':=';
LPAREN : '(';
RPAREN : ')';
ADDOP : ('+' | '-');
MULOP : ('*' | '/');
RELOP : ('=' | '<' | '<=' | '>' | '>=' | '<>');



module : MODULE identifier SEMI declaration BEGIN statement END identifier DOT;
declaration : variable_declaration*;
variable_declaration : 'VAR' identifier (COMMA identifier)* COLON type SEMI;
type : INTEGER | REAL | BOOLEAN;
statement : IF expression THEN statement (ELSE statement)?
          | WHILE expression DO statement
          | identifier ASSIGN expression
          | BEGIN statement* END
          | identifier LPAREN (expression (COMMA expression)*)? RPAREN
          | RETURN expression;
expression : simple_expression (RELOP simple_expression)?;
simple_expression : term (ADDOP term)*;
term : factor (MULOP factor)*;
factor : identifier | INTEGER | LPAREN expression RPAREN;


identifier : ID;

    
WS : [ \t\r\n]+ -> skip;
