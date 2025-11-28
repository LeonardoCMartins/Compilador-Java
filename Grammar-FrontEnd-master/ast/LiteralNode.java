package ast;

public class LiteralNode extends Node {
    public final Integer value;

    public LiteralNode(Integer value) {
        this.value = value;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "LITERAL: " + value);
    }
}