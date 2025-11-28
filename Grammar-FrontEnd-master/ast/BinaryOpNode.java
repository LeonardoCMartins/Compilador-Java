package ast;

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
        left.print(prefix + "  |"); 
        right.print(prefix + "  |"); 
    }
}