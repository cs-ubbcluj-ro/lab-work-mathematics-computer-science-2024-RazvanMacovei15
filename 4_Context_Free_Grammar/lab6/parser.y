%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

extern int yylineno;  // Declare yylineno from Lex


// Declare functions used in the Yacc file
int yylex();
void yyerror(const char *s);

%}

%union {
    int num;
    char *str;
}

%token <str> ID
%token <num> CONST
%token CLASS PUBLIC STATIC VOID MAIN STRING SCANNER SYSTEM_OUT_PRINTLN NEW IF ELSE WHILE FOR INT FLOAT BOOLEAN
%token ASSIGN SEMICOLON COMMA NEQ EQ LT GT LE GE PLUS MINUS MUL DIV
%token LPAREN RPAREN LBRACE RBRACE LBRACKET RBRACKET

%left ELSE
%nonassoc LOWER_THAN_ELSE
%left '+' '-'
%left '*' '/'
%left EQ NEQ LT GT LE GE

%%

program: class_header { printf("Program syntactic correct\n"); }
       ;

class_header: CLASS ID LBRACE
            | CLASS ID LBRACE main_method RBRACE
            ;


main_method: PUBLIC STATIC VOID MAIN LPAREN STRING LBRACKET RBRACKET ID RPAREN LBRACE declaration_list statement_list RBRACE
           ;

declaration_list: declaration
                | declaration declaration_list
                ;

declaration: data_type ID ASSIGN expression SEMICOLON
           | data_type ID SEMICOLON
           ;

data_type: INT
         | FLOAT
         | BOOLEAN
         | STRING
         ;

statement_list: statement
              | statement statement_list
              ;

statement: assignment
         | input_statement
         | output_statement
         | conditional_statement
         | loop_statement
         | method_call
         ;

assignment: ID ASSIGN expression SEMICOLON
          ;

input_statement: SCANNER ID ASSIGN NEW SCANNER LPAREN SYSTEM_OUT_PRINTLN RPAREN SEMICOLON
               | ID ASSIGN ID '.' "next" data_type LPAREN RPAREN SEMICOLON
               ;

output_statement: SYSTEM_OUT_PRINTLN LPAREN expression RPAREN SEMICOLON
                ;

conditional_statement: IF LPAREN condition RPAREN LBRACE statement_list RBRACE
                     | IF LPAREN condition RPAREN LBRACE statement_list RBRACE ELSE LBRACE statement_list RBRACE
                     ;

loop_statement: WHILE LPAREN condition RPAREN LBRACE statement_list RBRACE
              | FOR LPAREN assignment condition SEMICOLON assignment RPAREN LBRACE statement_list RBRACE
              ;

method_call: ID LPAREN parameter_list RPAREN SEMICOLON
           ;

parameter_list: expression
              | expression COMMA parameter_list
              | /* empty */
              ;

condition: expression relational_operator expression
         ;

expression: ID
          | CONST
          | expression arithmetic_operator expression
          | LPAREN expression RPAREN
          ;

arithmetic_operator: PLUS
                   | MINUS
                   | MUL
                   | DIV
                   ;

relational_operator: EQ
                   | NEQ
                   | LT
                   | GT
                   | LE
                   | GE
                   ;

%%

void yyerror(const char *s) {
    fprintf(stderr, "Error: %s at line %d\n", s, yylineno-1);
}


int main() {
    return yyparse();
}
