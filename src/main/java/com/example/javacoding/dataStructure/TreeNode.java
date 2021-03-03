package com.example.javacoding.dataStructure;

import sun.reflect.generics.tree.Tree;

import java.util.Vector;

public class TreeNode {
    public TreeNode left, right;

    public int val;

    public TreeNode(int val) {
        this.val = val;
    }

    /*
    * 遍历
    * 前序遍历: 根-左-右
    * 中序遍历：左-根-右
    * 后序遍历：左-右-根
    * */
    public void preTraverse(TreeNode node) {
        if(node != null) {
            System.out.println(node.val);
            preTraverse(node.left);
            preTraverse(node.right);
        }else {
            System.out.println("#");
        }
    }

    public void nonRecPreTraverse(TreeNode node) {
    }

    public void inTraverse(TreeNode node) {
        if(node != null) {
            inTraverse(node.left);
            System.out.println(node.val);
            inTraverse(node.right);
        }
    }

    public void nonRecInTraverse(TreeNode node) {
    }

    public void postTraverse(TreeNode node) {
        Vector<String> ss = new Vector<>();
        if(node != null) {
            postTraverse(node.left);
            postTraverse(node.right);
            System.out.println(node.val);
        }
    }

    public void nonRecPostTraverse(TreeNode node) {
    }

    //DFS depth （迭代）
    public void dfs(TreeNode node) {
        if(node != null) {
            System.out.println(node.val);
            preTraverse(node.left);
            preTraverse(node.right);
        }else{
            System.out.println("#");
        }
    }

    //BFS depth
    public void bfs(TreeNode node) {

    }

    //zigzag depth
    public void zig(TreeNode node) {

    }

    //左右翻转 树
    public void invert(TreeNode node) {
        if(node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = node.left;

        invert(node.left);
        invert(node.right);
    }

    //获取最大值
    public int getMax(TreeNode node) {
        if(node == null) {
            return Integer.MIN_VALUE;
        }else {
            int left = getMax(node.left);
            int right = getMax(node.right);

            return Math.max(Math.max(left,right),node.val);
        }
    }

    //获取最大深度
    public int getMaxDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }else{
            int left = getMaxDepth(node.left);
            int right = getMaxDepth(node.right);
            return Math.max(left,right)+1;
        }
    }

    //获取最小深度
    public int getMinDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }else{
            int left = getMinDepth(node.left);
            int right = getMinDepth(node.right);

            if(left == 0){
                return right + 1;
            }else if(right == 0) {
                return left + 1;
            }else {
                return Math.min(left,right) + 1;
            }
        }
    }

    // 是否是平衡树
    public Boolean isBalanced(TreeNode node) {
        return true;
    }

}
