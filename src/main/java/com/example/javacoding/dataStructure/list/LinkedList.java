package com.example.javacoding.dataStructure.list;

public class LinkedList<E> extends AbstractList<E>{
    public Node<E> head;

    public LinkedList() {
        head = new Node(null,null);
    }

    @Override
    public void add(E e) {

    }

    @Override
    public void insert(int index, E e) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * 单链表反转
     */

    /**
     * 链表中环的检测
     */

    /**
     * 有序链表 链表合并
     */

    /**
     * 删除链表倒数第n个节点
     */

    /**
     * 求链表的中间结点
     */

    private static class Node<E> {
        E       val;
        Node<E> next;

        public Node() {
        }

        public Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }
}
