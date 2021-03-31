package com.example.javacoding.dataStructure.graph;

import javax.swing.*;
import java.util.Vector;

// 邻接表
public class SparseGraph implements Graph{
    int n;

    int m;

    boolean isDirected;

    private Vector<Integer>[] g;

    @Override
    public int V() {
        return n;
    }

    @Override
    public int E() {
        return m;
    }

    @Override
    public void addEdge(int n,int w) {

    }

    @Override
    public boolean hasEdge(int v, int w) {
        return false;
    }

    @Override
    public Iterable<Integer> adj(int v) {
        return g[v];
    }
}
