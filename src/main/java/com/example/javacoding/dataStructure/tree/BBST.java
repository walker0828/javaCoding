package com.example.javacoding.dataStructure.tree;

import java.util.Comparator;

public class BBST<E> extends BinarySearchTree<E> {
    public BBST() {

    }

    public BBST(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    protected void rotateLeft(Node<E> node) {
        Node<E> child =node.right;
        node.right = child.left;
        child.left = node;
        afterRotate(node,child);
    }

    protected void rotateRight(Node<E> node) {
        Node<E> child = node.right;

        afterRotate(node,child);
    }

    protected void afterRotate(Node<E> node,Node<E> child) {

    }

    protected void rotate() {

    }

}
