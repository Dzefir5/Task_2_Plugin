grammar Counter;

kotlinFile
    : (declaration | statement )* EOF
    ;
classDeclaration
    :   KOTLIN_CLASS IDENTIFIER ('(' (declaration(','declaration)*)? ')')?  (':' kotlinType '('(expression(','expression)*)?')')? classBody?
    ;


classBody
    : '{' (declaration)* '}'
    ;

declaration
    : classDeclaration
    | funDeclaration
    | valDeclaration
    | varDeclaration
    ;
block
    : '{' (declaration | statement)* '}'
    ;
funDeclaration
    :  KOTLIN_FUN IDENTIFIER '(' (parameter(','parameter)*)?  ')' (':'kotlinType)? block
    ;
valDeclaration
    :  KOTLIN_VAL IDENTIFIER (':' kotlinType)? ('=' expression)?
    ;
varDeclaration
    :  KOTLIN_VAR IDENTIFIER (':' kotlinType)? ('=' expression)?
    ;

expressionStatement
    :  expression ';'
    ;
returnStatement
    :  RETURN expression ';'
    ;

statement
    :  expressionStatement
    |  returnStatement
    ;
kotlinType
    : KOTLIN_TYPE
    | IDENTIFIER
    ;
parameter
    : IDENTIFIER ':' kotlinType ('=' expression)?
    ;
expression
    :  IDENTIFIER
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;
PACKAGES
    : 'package' ~[\n]* -> skip
    ;



KOTLIN_CLASS
    : 'class'
    ;
KOTLIN_FUN
   : 'fun'
   ;
KOTLIN_VAL
   : 'val'
   ;
KOTLIN_VAR
   : 'var'
   ;
KOTLIN_INTERFACE_IDENTIFIER
    :'interface'
    ;
KOTLIN_TYPE
    : 'Int'
    | 'Double'
    | 'String'
    | 'Unit'
    ;
STRING_LITERALS
    : '"' .*?  '"'
    ;
RETURN
    : 'return'
    ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* ;
WS : [ \t\r\n]+ -> skip;

