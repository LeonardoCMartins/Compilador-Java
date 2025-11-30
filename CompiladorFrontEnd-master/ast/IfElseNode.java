package ast;

public class IfElseNode extends Node {
    public final Node condition;
    public final Node thenBlock; 
    public final Node elseBlock; 

    public IfElseNode(Node condition, Node thenBlock, Node elseBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "IF");
        System.out.println(prefix + "|-- COND:");
        condition.print(prefix + "|   | ");
        
        System.out.println(prefix + "|-- THEN:");
        thenBlock.print(prefix + "|   | ");

        if (elseBlock != null) {
            System.out.println(prefix + "|-- ELSE:");
            elseBlock.print(prefix + "|   | ");
        }
    }
}