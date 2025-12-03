package ast;

public class LiteralNode extends Node {
    public final Object value; 

    public LiteralNode(Integer value) {
        this.value = value;
    }

    public LiteralNode(Float value) {
        this.value = value;
    }
    
    public LiteralNode(String value) {
        this.value = value;
    }

    @Override
    public void print(String prefix) {
        String type = "Unknown";
        if (value instanceof Integer) {
            type = "Integer <POKE>";
        } else if (value instanceof String) {
            type = "String <PIKACHU>";
        } else if (value instanceof Float) {
            type = "Float <CANDY>";
        }
        
        System.out.println(prefix + "LITERAL (" + type + "): " + value);
    }
}