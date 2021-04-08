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
        afterRotate(node, child);
    }

    protected void afterRotate(Node<E> node, Node<E> child) {

    }

    protected void rotateRight(Node<E> node) {
        Node<E> child = node.left;
        // rotate right
        node.left = child.right;
        child.right = node;
        afterRotate(node, child);
    }


    protected void rotate(Node<E> r, Node<E> a, Node<E> b, Node<E> c, Node<E> d, Node<E> e, Node<E> f, Node<E> g) {

    }
}
