package ast;

public class VarInitNode extends Node {
    private String type;
    private String id;
    private Node expression; 

    public VarInitNode(String type, String id, Node expression) {
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public Node getExpression() {
        return expression;
    }
    
    @Override
    public void print(String prefix) {
        System.out.println(prefix + "VarInitNode");
        System.out.println(prefix + "  Tipo: " + type);
        System.out.println(prefix + "  ID: " + id);
        //System.out.print(prefix + "  Expressão de Inicialização: ");
        expression.print(prefix + "  ");
    }

    @Override
    public String toString() {
        return "VarInitNode(Type: " + type + ", ID: " + id + ", InitExpr: " + expression + ")";
    }
}