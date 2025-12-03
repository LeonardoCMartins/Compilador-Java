package ast;

public class ReturnNode extends Node {
    public final Node expression;

    public ReturnNode(Node expression) {
        this.expression = expression;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "RETURN <BULBASAUR>");
        expression.print(prefix + "| ");
    }
}