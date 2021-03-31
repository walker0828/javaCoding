package com.example.javacoding.dataStructure.tree;

import com.example.javacoding.dataStructure.Node;

import java.util.Comparator;

public class BBST<E> extends BinarySearchTree<E> {
    public BBST() {

    }

    public BBST(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    protected void rotateLeft(Node<E> node) {
//        Node<E> child =node.right;
    }


}
