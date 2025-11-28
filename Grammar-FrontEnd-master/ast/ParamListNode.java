package ast;

import java.util.ArrayList;
import java.util.List;

public class ParamListNode extends Node {
    private final List<VarDeclNode> parameters;

    public ParamListNode() {
        this.parameters = new ArrayList<>();
    }

    public ParamListNode(String type, String idName) {
        this();
        this.parameters.add(new VarDeclNode(type, idName));
    }
    
    public void add(String type, String idName) {
        this.parameters.add(new VarDeclNode(type, idName));
    }

    @Override
    public void print(String prefix) {
        if (parameters.isEmpty()) {
            System.out.println(prefix + "PARAMS: (None)");
            return;
        }
        System.out.println(prefix + "PARAMS:");
        for (VarDeclNode param : parameters) {
            param.print(prefix + "  |");
        }
    }
}