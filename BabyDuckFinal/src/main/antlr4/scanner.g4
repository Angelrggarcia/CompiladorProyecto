grammar scanner;

PROGRAM: 'program';
FUNC: 'func';
VAR: 'var';
INT: 'int';
FLOAT: 'float';
VOID: 'void';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
PRINT: 'print';
RETURN: 'return';
END: 'end';

/* Tokens para literales y operadores */
CTE_INT: [0-9]+;
CTE_FLOAT: [0-9]+ '.' [0-9]+;
CTE_STRING: '"' (~["\\] | '\\' .)* '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;

/* Ignorar */
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;

/* Reglas del Parser (usando tokens definidos) */
programa: PROGRAM ID ';' funcs 'main' body END ';';

funcs: func*;
func: FUNC type ID '(' params? ')' body;

params: param (',' param)*;
param: type ID;

body: '{' vars statements '}';
vars: (varDecl)*;
varDecl: VAR type idList ';';
idList: ID (',' ID)*;

statements: statement+;
statement: assign | condition | cycle | print | funcCall ';' | returnStat ';';

assign: ID '=' expression ';';
condition: IF '(' expression ')' body (ELSE body)?;
cycle: WHILE '(' expression ')' DO body;
print: PRINT '(' printArgs ')' ';';
funcCall: ID '(' argList? ')';
returnStat: RETURN expression;

expression: exp (relOp exp)?;
exp: term (addOp term)*;
term: factor (mulOp factor)*;
factor: ID | CTE_INT | CTE_FLOAT | '(' expression ')' | funcCall | unaryOp factor;

relOp: '>' | '<' | '!=' | '==' | '>=' | '<=';
addOp: '+' | '-';
mulOp: '*' | '/';
unaryOp: '+' | '-';
type: INT | FLOAT | VOID;

printArgs: printArg (',' printArg)*;
printArg: expression | CTE_STRING;
argList: expression (',' expression)*;