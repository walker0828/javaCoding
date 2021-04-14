package com.example.javacoding.systemDesign;

import java.util.LinkedList;

public class MyHashSet {
    // 取质数，减少hash碰撞
    private static final int BASE = 769;
    private LinkedList[] data;

    /** Initialize your data structure here. */
    public MyHashSet() {
        data = new LinkedList[BASE];
        for(int i=0; i< BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {

    }

    public void remove(int key) {

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return false;
    }
}
