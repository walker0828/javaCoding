package com.example.javacoding.dataStructure;

public class stack {
    public Node head;

    public Node current;

    public void push(int data) {
        if(current == null) {
            head = new Node(data);
            current = head;
        }else{
            Node preNode = current;
            current = node;
            current.pre = preNode;
        }
    }

    public Node pop() {
        if(current == null) {
            return null;
        }
        Node node = current;
        current = current.pre;
        return node;
    }

    public class Node {
        public int data = new int();
        Node pre = new Node();

        public Node(int data) {
            this.data = data;
        }
    }
}