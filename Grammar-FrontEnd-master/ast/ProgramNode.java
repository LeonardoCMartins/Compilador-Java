package ast;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    private final List<Node> declarations;

    public ProgramNode() {
        this.declarations = new ArrayList<>();
    }
    
    public ProgramNode(Node initialDecl) {
        this();
        if (initialDecl != null) {
            this.declarations.add(initialDecl);
        }
    }

    public void add(Node decl) {
        this.declarations.add(decl);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "PROGRAM");
        for (Node decl : declarations) {
            decl.print(prefix + "| ");
        }
    }
}