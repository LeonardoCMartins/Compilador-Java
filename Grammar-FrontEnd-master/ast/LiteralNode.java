package ast;

public class LiteralNode extends Node {
    public final Object value;

    public LiteralNode(Integer value) {
        this.value = value;
    }

    public LiteralNode(Float value) {
        this.value = value;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "LITERAL: " + value);
    }
}