import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup
%line
%column

WHITESPACE = [ \t\n\r]+
DIGIT = [0-9]+

%%

<YYINITIAL> {
    {WHITESPACE}  { /**/ }
    ";"           { return new Symbol(sym.SEMI); }
    "+"           { return new Symbol(sym.PLUS); }
    "-"           { return new Symbol(sym.MINUS); }
    "*"           { return new Symbol(sym.TIMES); }
    "/"           { return new Symbol(sym.SLASH); }
    "("           { return new Symbol(sym.LPAREN); }
    ")"           { return new Symbol(sym.RPAREN); }
    "{"           { return new Symbol(sym.LBRACE); }
    "}"           { return new Symbol(sym.RBRACE); }
    "neymar"      { return new Symbol(sym.IF); }
    {DIGIT}       { return new Symbol(sym.NUMBER, Integer.parseInt(yytext())); }
    .             { System.err.println("Illegal character: " + yytext()); }
}