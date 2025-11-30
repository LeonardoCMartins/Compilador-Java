package ast;

public class VarDeclNode extends Node {
    public final String type;
    public final String idName;

    public VarDeclNode(String type, String idName) {
        this.type = type;
        this.idName = idName;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "VAR DECL: " + type + " " + idName);
    }
}