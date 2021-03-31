package com.example.javacoding.dataStructure.graph;

public interface Graph {
    public int V();

    public int E();

    public void addEdge(int n,int w);

    boolean hasEdge(int v,int w);

    public Iterable<Integer> adj(int v);
}
