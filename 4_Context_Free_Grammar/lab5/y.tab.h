/* A Bison parser, made by GNU Bison 2.3.  */

/* Skeleton interface for Bison's Yacc-like parsers in C

   Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor,
   Boston, MA 02110-1301, USA.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     ID = 258,
     CONST = 259,
     CLASS = 260,
     PUBLIC = 261,
     STATIC = 262,
     VOID = 263,
     MAIN = 264,
     STRING = 265,
     SCANNER = 266,
     SYSTEM_OUT_PRINTLN = 267,
     NEW = 268,
     IF = 269,
     ELSE = 270,
     WHILE = 271,
     FOR = 272,
     INT = 273,
     FLOAT = 274,
     BOOLEAN = 275,
     ASSIGN = 276,
     SEMICOLON = 277,
     COMMA = 278,
     NEQ = 279,
     EQ = 280,
     LT = 281,
     GT = 282,
     LE = 283,
     GE = 284,
     PLUS = 285,
     MINUS = 286,
     MUL = 287,
     DIV = 288,
     LPAREN = 289,
     RPAREN = 290,
     LBRACE = 291,
     RBRACE = 292,
     LBRACKET = 293,
     RBRACKET = 294,
     LOWER_THAN_ELSE = 295
   };
#endif
/* Tokens.  */
#define ID 258
#define CONST 259
#define CLASS 260
#define PUBLIC 261
#define STATIC 262
#define VOID 263
#define MAIN 264
#define STRING 265
#define SCANNER 266
#define SYSTEM_OUT_PRINTLN 267
#define NEW 268
#define IF 269
#define ELSE 270
#define WHILE 271
#define FOR 272
#define INT 273
#define FLOAT 274
#define BOOLEAN 275
#define ASSIGN 276
#define SEMICOLON 277
#define COMMA 278
#define NEQ 279
#define EQ 280
#define LT 281
#define GT 282
#define LE 283
#define GE 284
#define PLUS 285
#define MINUS 286
#define MUL 287
#define DIV 288
#define LPAREN 289
#define RPAREN 290
#define LBRACE 291
#define RBRACE 292
#define LBRACKET 293
#define RBRACKET 294
#define LOWER_THAN_ELSE 295




#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
#line 12 "parser.y"
{
    int num;
    char *str;
}
/* Line 1529 of yacc.c.  */
#line 134 "y.tab.h"
	YYSTYPE;
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
# define YYSTYPE_IS_TRIVIAL 1
#endif

extern YYSTYPE yylval;

