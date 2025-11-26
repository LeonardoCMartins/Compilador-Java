package ast;

// Representa uma expressão binária (ex: 5 + x)
public class BinaryOpNode extends Node {
    public final Node left;
    public final String operator;
    public final Node right;

    public BinaryOpNode(Node left, String operator, Node right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "BINARY OP: " + operator);
        left.print(prefix + "  |"); // Imprime o filho esquerdo com mais indentação
        right.print(prefix + "  |"); // Imprime o filho direito com mais indentação
    }
}