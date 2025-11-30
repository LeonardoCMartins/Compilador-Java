import java.io.FileInputStream;
import java.io.InputStreamReader;

import ast.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(
            new FileInputStream("input.txt"), 
            "UTF8"
        ); 
        
        scanner s = new scanner(reader);
        parser p = new parser(s);
        
        Node ast = (Node)p.parse().value; 
        
        System.out.println("--- AST Gerada com Sucesso ---");
        ast.print(""); 
    }
}