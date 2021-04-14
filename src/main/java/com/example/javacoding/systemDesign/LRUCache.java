package com.example.javacoding.systemDesign;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class Node {
        int key;
        int value;
        Node previous;
        Node next;
        public Node(){};
        public Node(int _key,int _value){
            key = _key;
            value = _value;
        }
    }
    private int size;
    private int capacity;
    private Map<Integer,Node> nodeMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = nodeMap.get(key);
        if(node == null) {
            return -1;
        }
        moveToHead();
        return node.value;
    }

    public void put(int key, int value) {

    }

    void moveToHead() {

    }

}
