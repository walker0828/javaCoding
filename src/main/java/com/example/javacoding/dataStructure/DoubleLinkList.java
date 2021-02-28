package com.example.javacoding.dataStructure;

// 双向连接
public class DoubleLinkList {
    public Node head;
    public Node current;

    public void add(int data) {
        if(data == null)
    }

    public int getLength(Node head) {
        if(head == null) {
            return 0;
        }
        int i = 0;
        current = head;
        while(current.next != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    public boolean isEmpty() {
        return head
    }

    class Node {
        public int data;
        public Node next;
        public Node pre;

        public Node(int data) {
            this.data = data;
        }
    }
}