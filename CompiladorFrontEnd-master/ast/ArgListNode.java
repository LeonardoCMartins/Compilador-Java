package ast;

import java.util.ArrayList;
import java.util.List;

public class ArgListNode extends Node {
    private final List<Node> arguments;

    public ArgListNode() {
        this.arguments = new ArrayList<>();
    }
    
    public ArgListNode(Node initialExpr) {
        this();
        if (initialExpr != null) {
            this.arguments.add(initialExpr);
        }
    }

    public void add(Node expr) {
        this.arguments.add(expr);
    }

    @Override
    public void print(String prefix) {
        if (arguments.isEmpty()) {
            System.out.println(prefix + "ARGS: (None)");
            return;
        }
        System.out.println(prefix + "ARGS:");
        for (Node arg : arguments) {
            arg.print(prefix + "  |");
        }
    }
}