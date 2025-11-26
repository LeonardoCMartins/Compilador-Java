package ast;

// Representa um identificador (ex: uma variável 'x')
public class IdentifierNode extends Node {
    public final String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "ID: " + name);
    }
}