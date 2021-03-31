package com.example.javacoding.dataStructure.graph;

import java.util.Vector;

// 临接矩阵
public class DenseGraph implements Graph {
    // 节点数
    private int n;
    // 边数
    private  int m;
    // 是否有向图
    private boolean isDirected;
    // 具体数据
    private boolean[][] g;

    public DenseGraph(int n,boolean directed) {
        this.n = n;
        this.m = 0;
        this.isDirected = directed;
        g = new boolean[n][n];
    }

    //返回节点个数
    public int V() {
        return n;
    }

    // 返回边
    public int E() {
        return m;
    }

    // 增加一个边
    public void addEdge(int n,int w) {
        if(hasEdge(n,w)) {
            return;
        }
        if(!isDirected){
            g[n][w] = true;
        }
        m++;
    }

    public Iterable<Integer> adj(int v) {
        Vector<Integer> adjV = new Vector<Integer>();
        for (int i = 0; i< n; i++){
            if(g[v][i]){
                adjV.add(i);
            }
        }
        return adjV;
    }

    // 验证v->w是否有边
    public boolean hasEdge(int v, int w) {
        return g[v][w];
    }

}
