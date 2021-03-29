package com.example.javacoding.dataStructure;

public class Heap {
    private int[] items = new int[]{};
    private int count;
    private int n;

    public Heap(int capacity) {
        this.items = new int[n];
        this.count = 0;
        this.n = capacity;
    }

    public int getSize() {
        return items.length;
    }

    public boolean isEmpty() {
        return items.length == 0? true : false;
    }

    public int[] insert(int data) {
        if(count>=n) return items;
        items[count++] = data;
        return siftUp(items.length-1);
    }

    public int[] removeMin() {
        swap(0, items.length - 1);
        siftDown(0);
        count--;
        return items;
    }

    private int[] siftUp(int index) {
        while(index >0 && items[index] > items[getParent(index)]) {
            swap(items[index],items[getParent(index)]);
            index = getParent(index);
        }
        return items;
    }

    private int[] siftDown(int index) {
        return null;
    }

    private int getParent(int index) {
        return (index-1)/2;
    }

    private int getLeftChild(int index) {
        return index*2 + 1;
    }

    private int getRightChild(int index) {
        return index * 2 + 2;
    }

    private void swap(int x, int y) {
        if(x < 0 || x >= n || y < 0 || y >= n)
            throw new IllegalArgumentException("illegal arguments");
        int tmp = x;
        x = y;
        y = tmp;
    }
}