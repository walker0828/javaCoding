package com.example.javacoding.dataStructure;

public class LinkList {
    public Node head;
    public Node current;

    public void add(int data) {
        if(data == null){
            return;
        }

        Node node = new Node(data);
        current.next = node;

    }

    public int getLength(Node head) {
        if(head == null) {
            return 0;
        }

    }

    public Node getPosition(int index) {

    }

    public Node getMiddleNode() {

    }

    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}