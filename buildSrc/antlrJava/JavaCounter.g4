grammar JavaCounter;

javaFile
    : (declaration | statement )* EOF
    ;
classDeclaration
    :
    JAVA_ACCESS_MODIFIERS?
    JAVA_CLASS
    IDENTIFIER
    ('(' (declaration(','declaration)*)? ')')?  (':' javaType'('(expression(','expression)*)?')')? classBody?
    ;
classBody
    : '{' (declaration)* '}'
    ;

declaration
    : classDeclaration
    | functionDeclaration
    | variableDeclaration
    ;
block
    : '{' (declaration | statement)* '}'
    ;
functionDeclaration
    :
    JAVA_ACCESS_MODIFIERS?
    JAVA_FUNCTION_MODIFIERS?
    javaType
    IDENTIFIER
    '(' (parameter(','parameter)*)?  ')' (':'javaType)?
    block
    ;
variableDeclaration
    :  JAVA_TYPE IDENTIFIER ('=' expression)? ';'
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
javaType
    : JAVA_TYPE
    | IDENTIFIER
    ;
parameter
    : javaType IDENTIFIER ('=' expression)?
    ;
expression
    :  VALUE
    |  IDENTIFIER
    |  STRING_LITERALS
    |  expression '(' (expression)* ')'
    |  expression'.'expression
    |  expression OPERATOR expression
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



JAVA_CLASS
    : 'class'
    | 'final class'
    | 'static class'
    | 'abstract class'
    ;
JAVA_ACCESS_MODIFIERS
    : 'public'
    | 'private'
    | 'default'
    | 'protected'
    ;
JAVA_FUNCTION_MODIFIERS
   : 'final'
   | 'static'
   | 'abstarct'
   | 'synchronized'
   | 'volatile'
   ;
JAVA_TYPE
    : 'int'
    | 'double'
    | 'String'
    | 'void'
    ;
STRING_LITERALS
    : '"' .*?  '"'
    ;
RETURN
    : 'return'
    ;
OPERATOR
    : '+'
    | '-'
    | '*'
    | '='
    ;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;
VALUE : [a-zA-Z_0-9]+ ;
WS : [ \t\r\n]+ -> skip;

