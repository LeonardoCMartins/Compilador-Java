package ast;

public class AssignmentNode extends Node {
    public final String idName;
    public final Node expression;

    public AssignmentNode(String idName, Node expression) {
        this.idName = idName;
        this.expression = expression;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "ASSIGN: " + idName);
        expression.print(prefix + "| ");
    }
}