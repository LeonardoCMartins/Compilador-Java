package ast;

public class FuncDefNode extends Node {
    public final String returnType;
    public final String funcName;
    public final Node params; 
    public final Node body; 

    public FuncDefNode(String returnType, String funcName, Node params, Node body) {
        this.returnType = returnType;
        this.funcName = funcName;
        this.params = params;
        this.body = body;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "FUNC DEF: " + returnType + " " + funcName);
        System.out.println(prefix + "|-- PARAMS:");
        params.print(prefix + "|   | ");
        System.out.println(prefix + "|-- BODY:");
        body.print(prefix + "|   | ");
    }
}