package ast;

public class WhileNode extends Node {
    public final Node condition;
    public final Node body;

    public WhileNode(Node condition, Node body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "WHILE <CHARMANDER>");
        System.out.println(prefix + "|-- COND:");
        condition.print(prefix + "|   | ");
        
        System.out.println(prefix + "|-- BODY:");
        body.print(prefix + "|   | ");
    }
}