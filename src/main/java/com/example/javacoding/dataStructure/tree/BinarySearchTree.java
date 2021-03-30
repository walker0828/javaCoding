package com.example.javacoding.dataStructure.tree;

import com.example.javacoding.dataStructure.Node;
import com.example.javacoding.dataStructure.tree.BinaryTreeInfo;

import java.awt.*;
import java.util.Comparator;

import static java.util.Objects.isNull;

// 二叉搜索树
public class BinarySearchTree<E> implements BinaryTreeInfo {

    protected Node<E> root;

    private int size;

    protected Comparator<E> comparator;

    public BinarySearchTree () {

    }

    public BinarySearchTree (Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public void add(E element) {
        notNullCheck(element);
        if(root == null) {
           root = createNode(element,null);
           size++;
           return;
        }


    }


    protected Node<E> createNode(E element,Node<E> parent) {
        return new Node<>(element,parent);
    }

    private void notNullCheck(E element) {
        if(isNull(element)) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    @Override
    public Object root() {
        return null;
    }

    @Override
    public Object left(Object left) {
        return null;
    }

    @Override
    public Object right(Object right) {
        return null;
    }

    @Override
    public Object string(Object node) {
        return null;
    }
}
