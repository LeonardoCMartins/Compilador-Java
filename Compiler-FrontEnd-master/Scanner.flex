
%%

%class scanner
%standalone
%unicode
%line
%column

WHITESPACE = [ \t\n\r]+
LETTER     = [a-zA-Z]
DIGIT      = [0-9]
ID_START   = {LETTER} | "_"
ID_CONT    = {LETTER} | {DIGIT} | "_"
INT        = {DIGIT}+
FLOAT      = {DIGIT}+ "." {DIGIT}+
COMMENT_SL = "//"[^\n]*
COMMENT_ML = "/*" (.|[\r\n])*? "*/"

%%

<YYINITIAL> {

    {WHITESPACE} { /* */ }

    {COMMENT_SL} { System.out.println("<COMMENT_SL>");}
    {COMMENT_ML} { System.out.println("<COMMENT_ML>");}

    ";" { System.out.println("<SEMI>"); }
    "," { System.out.println("<COMMA>"); }
    "{" { System.out.println("<LBRACE>"); }
    "}" { System.out.println("<RBRACE>"); }
    "(" { System.out.println("<LPAREN>"); }
    ")" { System.out.println("<RPAREN>"); }

    "==" { System.out.println("<EQ>");  }
    "!=" { System.out.println("<NE>"); }
    "<=" { System.out.println("<LE>"); }
    ">=" { System.out.println("<GE>"); }
    "<"  { System.out.println("<LT>");  }
    ">"  { System.out.println("<GT>"); }
    "++" { System.out.println("<OP_INC>"); }
    "--" { System.out.println("<OP_DEC>"); }
    "+=" { System.out.println("<OP_PLUS_ASSIGN>"); }
    "-=" { System.out.println("<OP_MINUS_ASSIGN>"); }
    "+"  { System.out.println("<PLUS>");  }
    "-"  { System.out.println("<MINUS>");  }
    "*"  { System.out.println("<TIMES>");  }
    "/"  { System.out.println("<SLASH>");  }
    "="  { System.out.println("<ASSIGN>"); }
    "!"  { System.out.println("<OP_NOT>"); }

    "if"     { System.out.println("<KW_IF>"); }
    "else"   { System.out.println("<KW_ELSE>"); }
    "while"  { System.out.println("<KW_WHILE>"); }
    "return" { System.out.println("<KW_RETURN>"); }
    "for"    { System.out.println("<KW_FOR>"); }
    "int"    { System.out.println("<KW_INT>"); }
    "float"  { System.out.println("<KW_FLOAT>"); }
    "void"   { System.out.println("<KW_VOID>"); }

    {ID_START}{ID_CONT}* { System.out.println("<ID:" + yytext() + ">"); }

    {FLOAT} { System.out.println("<FLOAT:" + yytext() + ">"); }

    {INT} { System.out.println("<INT:" + yytext() + ">"); }

    . { System.out.println("<ILLEGAL:" + yytext() + ">"); }
}
