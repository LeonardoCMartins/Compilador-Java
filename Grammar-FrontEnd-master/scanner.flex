import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup

WHITESPACE = [ \t\n\r]+
DIGIT = [0-9]+
ID = [a-zA-Z][a-zA-Z0-9]*

%%

{WHITESPACE}    { /**/ }

"+"             { return new Symbol(sym.PLUS); }
"-"             { return new Symbol(sym.MINUS); }
"*"             { return new Symbol(sym.TIMES); }
"/"             { return new Symbol(sym.SLASH); }
"("             { return new Symbol(sym.LPAREN); }
")"             { return new Symbol(sym.RPAREN); }
";"             { return new Symbol(sym.SEMI); }
<<EOF>> { return new Symbol(sym.EOF); }
{DIGIT}+        { return new Symbol(sym.NUMBER, Integer.parseInt(yytext())); }
{ID}            { return new Symbol(sym.ID, yytext()); }

.               { System.err.println("Illegal character: " + yytext()); }
