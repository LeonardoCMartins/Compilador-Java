import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup

WHITESPACE = [ \t\n\r]+
DIGIT = [0-9]+
LETTER = [a-zA-Z]
ID = ({LETTER}|_)({LETTER}|{DIGIT}|_)*
STRING_LIT = \"[^\"\n]*\"

%%

{WHITESPACE}       { /* */ }
"//".* { /* */ }
"/*"([^*]|\*+[^*/])*\*+"/" { /* */ }
"#" [^\n]* { /* */ }

"poke"             { System.out.println("<POKE (INT)>"); return new Symbol(sym.KW_INT); }
"candy"            { System.out.println("<CAND (FLOAT)>"); return new Symbol(sym.KW_FLOAT); }
"MEW"              { System.out.println("<MEW (IF)>"); return new Symbol(sym.KW_IF); }
"MEWTWO"           { System.out.println("<MEWTWO (ELSE)>"); return new Symbol(sym.KW_ELSE); }
"CHARMANDER"       { System.out.println("<CHARMANDER (WHILE)>"); return new Symbol(sym.KW_WHILE); }
"SQUIRTLE"         { System.out.println("<SQUIRTLE (FOR)>"); return new Symbol(sym.KW_FOR); }
"ARCEUS"           { System.out.println("<ARCEUS (FUNC)>"); return new Symbol(sym.KW_FUNC); }
"BULBASAUR"        { System.out.println("<BULBASAUR (RETURN)>"); return new Symbol(sym.KW_RETURN); }
"pokedex"          { System.out.println("<POKEDEX (PRINT)>"); return new Symbol(sym.KW_PRINT); }
"PIKACHU"          { System.out.println("<PIKACHU (STRING)>"); return new Symbol(sym.KW_STRING);}

"+"                { System.out.println("<PLUS>"); return new Symbol(sym.PLUS); }
"-"                { System.out.println("<MINUS>"); return new Symbol(sym.MINUS); }
"*"                { System.out.println("<TIMES>"); return new Symbol(sym.TIMES); }
"/"                { System.out.println("<SLASH>"); return new Symbol(sym.SLASH); }

"=="               { System.out.println("<EQ>"); return new Symbol(sym.EQ); }
"!="               { System.out.println("<NEQ>"); return new Symbol(sym.NEQ); }
"<="               { System.out.println("<LTE>"); return new Symbol(sym.LTE); }
">="               { System.out.println("<GTE>"); return new Symbol(sym.GTE); }
"<"                { System.out.println("<LT>"); return new Symbol(sym.LT); }
">"                { System.out.println("<GT>"); return new Symbol(sym.GT); }

"="                { System.out.println("<ASSIGN>"); return new Symbol(sym.ASSIGN); } 
"("                { System.out.println("<LPAREN>"); return new Symbol(sym.LPAREN); }
")"                { System.out.println("<RPAREN>"); return new Symbol(sym.RPAREN); }
"{"                { System.out.println("<LBRACE>"); return new Symbol(sym.LBRACE); }
"}"                { System.out.println("RBRACE>"); return new Symbol(sym.RBRACE); }
","                { System.out.println("<COMMA>"); return new Symbol(sym.COMMA); }
";"                { System.out.println("<SEMI>"); return new Symbol(sym.SEMI); }

{DIGIT}+           { System.out.println("<INT:" + yytext() + ">"); return new Symbol(sym.NUMBER, Integer.parseInt(yytext())); }
{STRING_LIT}       { System.out.println("<PIKACHU (STRING)" + yytext() + ">"); String s = yytext(); return new Symbol(sym.STRING_LIT, s.substring(1, s.length()-1)); }
{ID}               { System.out.println("<ID:" + yytext() + ">"); return new Symbol(sym.ID, yytext()); }

<<EOF>>            { return new Symbol(sym.EOF); }

.                  { System.err.println("Illegal char: " + yytext()); }