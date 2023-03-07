parser grammar TestParser;
options { tokenVocab=TestLexer; }

program
    : stat EOF
    | def EOF
    ;

stat: ID '=' expr ';'
    | expr ';'
    ;

def : ID '(' ID (',' ID)* ')' '{' stat* '}' ;

expr: ID
    | INT
    | func
    | 'not' expr
    | expr AND expr
    | expr 'or' expr
    ;

func : ID '(' expr (',' expr)* ')' ;