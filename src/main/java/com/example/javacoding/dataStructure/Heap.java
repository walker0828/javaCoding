package com.example.javacoding.dataStructure;

public class Heap {
    private int[] items = new int[];
    private int count;
    private int n;

    public Heap(int capacity) {
        this.items = new int[n];
        this.count = 0;
        this.n = capacity;
    }

    public void insert(int data) {
        if(count >= n) {
            return;
        }
        if()
    }

    // 实现一个小顶堆
    public void buildMinHeap(int[] items) {
        for(int i = (items.length)/2 -1 ; i>= 0 ; i--) {
            heapifyMinHeap(i);
        }
    }

    private void heapifyMinHeap(int i) {
        int l = left(i);
        int r = right(i);

        int smallest = i;
        if(l< items.length && data[l] < data[i]) {
            smallest = l;
        }

        if(r< items.length && data[r] < data[i]) {
            smallest = l;
        }
    }

    // 实现一个大顶堆
    public void buildMaxHeap() {

    }

    private void heapifyMaxHeap(int i) {

    }

    // 实现优先级队列
    public void priorityQueue() {

    }
}