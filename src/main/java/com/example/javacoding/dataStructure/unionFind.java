package com.example.javacoding.dataStructure;

import java.util.HashMap;
import java.util.List;

public class unionFind {
    public static class Node<V> {
        V value;
        Node(V v) {
            value = v;
        }
    }

    public static class UnionSet<V> {
        // 记录样本到样本代表点关系
        HashMap<V,Node<V>> nodes;
        // 记录某节点到父亲节点关系
        HashMap<Node<V>,Node<V>> parents;
        // 记录当前节点连通数
        HashMap<Node<V>,Integer> sizeMap;
        public UnionSet(List<V> values) {
            for(V cur : values) {
                Node<V> node = new Node<>(cur);
                nodes.put(cur,node);
                parents.put(node,node);
                sizeMap.put(node,1);
            }
        }

        public Node<V> findFather(Node<V> cur) {
            return cur;
        }

        public boolean isSameSet(Node<V> A, Node<V> B) {
            return false;
        }

        public void union(V a,V b) {

        }
    }
}
