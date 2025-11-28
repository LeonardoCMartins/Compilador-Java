import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup

WHITESPACE = [ \t\n\r]+
DIGIT = [0-9]
LETTER = [a-zA-Z]
ID = {LETTER}({LETTER}|{DIGIT})*

%%

{WHITESPACE}       { /* ignora */ }

"//".*             { /* comentário linha */ }
"/*"([^*]|\*+[^*/])*\*+"/"   { /* comentário bloco */ }

"func"             {return new Symbol(sym.KW_FUNC);}
"int"              {return new Symbol(sym.KW_INT);}
"float"            {return new Symbol(sym.KW_FLOAT);}
"if"               {return new Symbol(sym.KW_IF);}
"else"             {return new Symbol(sym.KW_ELSE);}
"while"            {return new Symbol(sym.KW_WHILE);}
"return"           {return new Symbol(sym.KW_RETURN);}

"+"                {return new Symbol(sym.PLUS);}
"-"                {return new Symbol(sym.MINUS);}
"*"                {return new Symbol(sym.TIMES);}
"/"                {return new Symbol(sym.SLASH);}

"=="               {return new Symbol(sym.EQ);}
"!="               {return new Symbol(sym.NEQ);}
"<="               {return new Symbol(sym.LTE);}
">="               {return new Symbol(sym.GTE);}
"<"                {return new Symbol(sym.LT);}
">"                {return new Symbol(sym.GT);}

"="                {return new Symbol(sym.ASSIGN);}
"("                {return new Symbol(sym.LPAREN);}
")"                {return new Symbol(sym.RPAREN);}
"{"                {return new Symbol(sym.LBRACE);}
"}"                {return new Symbol(sym.RBRACE);}
","                {return new Symbol(sym.COMMA);}
";"                {return new Symbol(sym.SEMI);}

{DIGIT}+           {return new Symbol(sym.NUMBER, Integer.parseInt(yytext()));}
{ID}               {return new Symbol(sym.ID,yytext());}

<<EOF>>            {return new Symbol(sym.EOF);}

.                  {System.err.println("Illegal char: " + yytext());}
