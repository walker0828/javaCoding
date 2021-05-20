package com.example.javacoding.dataStructure.tree;

import com.example.javacoding.dataStructure.tree.BinaryTreeInfo;

import java.awt.*;
import java.util.Comparator;
import java.util.Objects;

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
           afterAdd(root);
           return;
        }

        Node<E> parent = root, cur = root;
        int compare = 0;
        while(cur != null) {
            parent = cur;
//            compare = compare();
        }

        // 配置 父节点
//        Node<E> node = createNode();
        if(compare > 0) {

        }else{

        }

        size++;
        afterAdd(node(element));
    }

    public void remove(E element) {
        remove(node(element));
    }

    private void remove(Node<E> node) {

    }

    // 查找 树中的node节点
    public Node node(E element) {
        Node<E> node = root;
        while(node != null){
            int compare = compare(element,root.element);
            if(compare == 0) {
                return node;
            }else if(compare > 0) {
                node = node.right;
            }else if(compare < 0) {
                node = node.left;
            }
        }
        return null;
    }

    protected Node<E> createNode(E element,Node<E> parent) {
        return new Node<>(element,parent);
    }

    private void notNullCheck(E element) {
        if(isNull(element)) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    protected void afterAdd(Node<E> node) {

    }

    protected void afterRemove(Node<E> node, Node<E> replacement) {

    }

    private int compare(E insert,E current) {
        if(comparator != null) {
            return Objects.compare(insert,current,comparator);
        }
        return 1;
//        return ((Comparator<E>) insert).compareTo(current);
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

    protected static class Node<E> {
        E element;

        Node<E> parent;
        Node<E> left;
        Node<E> right;

        public Node(E element,Node<E> parent) {
            this(element);
            this.parent = parent;
        }

        public Node(E element) {
            this.element = element;
        }

        boolean isLeftChildOf(Node node) {
            return this == node.left;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }
}
