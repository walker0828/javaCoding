package com.example.javacoding.dataStructure;

public class stack {
    private String[] items;
    // 栈 元素多少
    private int count;
    // 栈 的 大小
    private int n;

    public boolean push (String item) {
        items[items.length+1] = item;
        return true;
    }

    public boolean pop () {
        return true;
    }


}