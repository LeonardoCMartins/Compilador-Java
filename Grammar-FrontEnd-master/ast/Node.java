package ast;

public abstract class Node {
    // Método para imprimir a árvore (usando 'prefix' para indentação)
    public abstract void print(String prefix);

    // Opcional: Método para avaliar/executar o nó
    // public abstract Object evaluate();
}