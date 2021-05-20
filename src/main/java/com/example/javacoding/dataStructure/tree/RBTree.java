package com.example.javacoding.dataStructure.tree;

import java.util.Comparator;

public class RBTree<E> extends BBST<E> {
    private static boolean RED   = false;
    private static boolean BLACK = true;

    public RBTree() {};
    public RBTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }


    @Override
    protected void afterAdd(Node<E> node) {

    }

    @Override
    protected void afterRemove(Node<E> node,Node<E> replacement) {

    }

    private boolean hasRedChild(RBNode<E> rbNode) {
        return rbNode != null
    }

    private RBNode<E> redden(Node<E> node) {
        return color(node,RED);
    }

    private RBNode<E> darken(Node<E> node) {
        return color(node,BLACK);
    }

    private RBNode<E> color(BinarySearchTree.Node<E> node, boolean color) {

    }

    private boolean isRed() {
        return false;
    }

    private boolean isBlack() {
        return false;
    }

    private class RBNode<E> extends BinarySearchTree.Node<E> {
        boolean color = RED;

        RBNode(E element, BinarySearchTree.Node<E> parent) {
            super(element, parent);
        }

        @Override
        public String toString() {
            return "";
        }
    }
}
