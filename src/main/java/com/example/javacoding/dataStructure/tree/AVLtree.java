package com.example.javacoding.dataStructure.tree;

public class AVLtree<E> extends BBST{
    @Override
    protected void afterAdd(Node node) {
        while((node = node.parent) == null) {
            if(((AVLNode)node).isBalanced()){
                updateHeight(node);
            }else{
                rebalance(node);
                break;
            }
        }
    }

    @Override
    protected void afterRemove(Node node, Node replacement) {
        while((node = node.parent) == null) {
            if(isBalanced(node)) {

            }
        }
    }

    private void rebalance2(Node<E> node) {

    }

    private void rebalance(Node<E> node) {
        AVLNode grand = (AVLNode) node;


    }

    protected boolean isBalanced(Node<E> node) {
        return ((AVLNode)node).isBalanced();
    }

    @Override
    protected void rotate(Node r, Node a, Node b, Node c, Node d, Node e, Node f, Node g) {
        super.rotate(r, a, b, c, d, e, f, g);
        ((AVLNode) b).updateHeight();
        ((AVLNode) f).updateHeight();
        ((AVLNode) d).updateHeight();
    }

    private void updateHeight(Node<E> node) {
        ((AVLNode) node).updateHeight();
    }

    protected static class AVLNode extends Node {
        int height = 1;
        public AVLNode(Object element, Node parent) {
            super(element, parent);
        }

        int getLeftHeight() {
            return left == null ? 0 : ((AVLNode) left).height;
        }

        int getRightHeight() {
            return right == null ? 0 : ((AVLNode) right).height;
        }

        int balanceFactor() {
            int r = getRightHeight();
            int l = getLeftHeight();
            return Math.abs(r - l);
        }

        void updateHeight() {
            int r = getRightHeight();
            int l = getLeftHeight();
            height = 1 + Math.max(r, l);
        }

        boolean isBalanced() {
            return balanceFactor() <= 1;
        }
    }


}
