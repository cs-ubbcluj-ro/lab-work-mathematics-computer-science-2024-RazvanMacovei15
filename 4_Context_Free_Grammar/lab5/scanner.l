%{
#include <stdio.h>
#include "y.tab.h"
%}

%%
"class"               { return CLASS; }
"public"              { return PUBLIC; }
"static"              { return STATIC; }
"void"                { return VOID; }
"main"                { return MAIN; }
"String"              { return STRING; }
"Scanner"             { return SCANNER; }
"System.out.println"   { return SYSTEM_OUT_PRINTLN; }
"new"                 { return NEW; }
"if"                  { return IF; }
"else"                { return ELSE; }
"while"               { return WHILE; }
"for"                 { return FOR; }
"int"                 { return INT; }
"float"               { return FLOAT; }
"boolean"             { return BOOLEAN; }
"="                   { return ASSIGN; }
";"                   { return SEMICOLON; }
","                   { return COMMA; }
"!="                  { return NEQ; }
"=="                  { return EQ; }
"<"                   { return LT; }
">"                   { return GT; }
"<="                  { return LE; }
">="                  { return GE; }
"+"                   { return PLUS; }
"-"                   { return MINUS; }
"*"                   { return MUL; }
"/"                   { return DIV; }
"("                   { return LPAREN; }
")"                   { return RPAREN; }
"{"                   { return LBRACE; }
"}"                   { return RBRACE; }
"["                   { return LBRACKET; }
"]"                   { return RBRACKET; }

[A-Za-z][A-Za-z0-9]*  { yylval.str = strdup(yytext); return ID; }
[0-9]+                { yylval.num = atoi(yytext); return CONST; }

[ \t\r\n]+            ;  // Ignore whitespace
.                     { printf("Unexpected character: %c\\n", *yytext); }

%%
int yywrap() {
    return 1;
}