import java.io.FileInputStream;
import java.io.InputStreamReader;
// import java.io.FileReader; // Não precisamos mais do FileReader

import ast.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Altere a leitura do arquivo para usar InputStreamReader e especificar a codificação (UTF-8)
        // Isso resolve problemas com BOM ou caracteres invisíveis que causam falha imediata.
        InputStreamReader reader = new InputStreamReader(
            new FileInputStream("input.txt"), 
            "UTF8" // ou "UTF-8"
        ); 
        
        scanner s = new scanner(reader);
        parser p = new parser(s);
        
        // Se a análise for bem-sucedida, o AST será construído
        Node ast = (Node)p.parse().value; 
        
        System.out.println("--- AST Gerada com Sucesso ---");
        ast.print(""); // Imprime a árvore (assumindo que o método print funciona)
    }
}