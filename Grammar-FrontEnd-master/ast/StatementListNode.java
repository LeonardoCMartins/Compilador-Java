package ast;

import java.util.ArrayList;
import java.util.List;

public class StatementListNode extends Node {
    private final List<Node> statements;

    public StatementListNode() {
        this.statements = new ArrayList<>();
    }

    public StatementListNode(Node initialStmt) {
        this();
        if (initialStmt != null) {
            this.statements.add(initialStmt);
        }
    }

    public void add(Node stmt) {
        this.statements.add(stmt);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "BLOCK");
        for (Node stmt : statements) {
            stmt.print(prefix + "| ");
        }
    }
}