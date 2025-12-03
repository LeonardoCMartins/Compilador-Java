package ast;

public class FuncCallNode extends Node {
    public final String funcName;
    public final Node args; 

    public FuncCallNode(String funcName, Node args) {
        this.funcName = funcName;
        this.args = args;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "FUNC <ARCEUS> CALL: " + funcName);
        System.out.println(prefix + "|-- ARGS:");
        args.print(prefix + "|   | ");
    }
}