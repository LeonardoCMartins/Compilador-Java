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
        String extra = "";
        if (type.equals("int")) {
            extra = " <poke>";
        } else if (type.equals("float")) {
            extra = " candy";
        }
        System.out.println(prefix + "VAR DECL: " + type + extra + " " + idName);
    }
}