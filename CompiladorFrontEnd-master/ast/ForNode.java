package ast;

public class ForNode extends Node {
    public Node initialization;
    public Node condition;
    public Node increment;
    public Node body;

    public ForNode(Node init, Node cond, Node inc, Node body) {
        this.initialization = init;
        this.condition = cond;
        this.increment = inc;
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "For (SQUIRTLE)");
        
        System.out.println(indent + "  [Init]:");
        if (initialization != null) initialization.print(indent + "    ");
        
        System.out.println(indent + "  [Cond]:");
        if (condition != null) condition.print(indent + "    ");
        
        System.out.println(indent + "  [Inc]:");
        if (increment != null) increment.print(indent + "    ");
        
        System.out.println(indent + "  [Body]:");
        if (body != null) body.print(indent + "    ");
    }
}