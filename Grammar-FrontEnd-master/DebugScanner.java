import java.io.FileInputStream;
import java.io.InputStreamReader;
import java_cup.runtime.*;

public class DebugScanner {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando teste do Scanner...");
        
        InputStreamReader reader = new InputStreamReader(
            new FileInputStream("input.txt"), 
            "UTF8"
        ); 
        scanner s = new scanner(reader);
        
        // Loop para ler os primeiros tokens
        Symbol token;
        int count = 0;
        
        do {
            token = s.next_token();
            if (token.sym == 0) { // O sym.EOF é 0, mas o scanner não está importado aqui
                 System.out.println("Token [" + count + "]: EOF");
                 break;
            }
            
            // Imprime o tipo do token e o valor (se houver)
            // Nota: Você pode precisar do arquivo 'sym.java' para mapear o número 'sym' para o nome do token.
            System.out.println("Token [" + count + "]: sym=" + token.sym + ", value=" + token.value + ", text=" + s.yytext());

            if (count == 0) {
                 // Pare após o primeiro token para ver o que ele é
                 // O primeiro token DEVE ser o KW_FUNC (cujo número sym está em 'sym.java')
                 break; 
            }
            count++;

        } while (token != null);
        
        System.out.println("Teste do Scanner Concluído.");
    }
}