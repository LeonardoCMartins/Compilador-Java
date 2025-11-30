package ast;

public class PrintNode extends Node {
    public Node expression;

    public PrintNode(Node expression) {
        this.expression = expression;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Print (pokedex)");
        if (expression != null) {
            expression.print(indent + "  ");
        }
    }
}