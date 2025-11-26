import java.io.FileReader;
import java.io.InputStreamReader;

import ast.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //InputStreamReader reader = new InputStreamReader(System.in); 
        FileReader reader = new FileReader("input.txt");
        scanner s = new scanner(reader);
        parser p = new parser(s);
        Node ast = (Node)p.parse().value;
        ast.print("");
    }
}
