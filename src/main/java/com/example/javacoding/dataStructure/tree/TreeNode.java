package com.example.javacoding.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/***
 *
 * 二叉树
 */

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

    public List<Integer> nonRecPreTraverse(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
            return resultList;
        }
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode tempNode = stack.pop();
            resultList.add(tempNode.val);
            stack.push(root.right);
            stack.push(root.left);
        }
        return resultList;
    }

    public void inTraverse(TreeNode node) {
        if(node != null) {
            inTraverse(node.left);
            System.out.println(node.val);
            inTraverse(node.right);
        }
    }

    public List<Integer> nonRecInTraverse(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> treeNodes = new Stack<>();
        if(root == null) return resultList;
        treeNodes.push(root);
        if(!treeNodes.isEmpty()) {
//            TreeNode treeTemp = treeNodes.pop();
//            treeNodes.push(treeTemp.right);
//            resultList.add(treeTemp.val);
//            treeNodes.push(treeTemp.left);
        }
        return resultList;
    }

    public void postTraverse(TreeNode node) {
        Vector<String> ss = new Vector<>();
        if(node != null) {
            postTraverse(node.left);
            postTraverse(node.right);
            System.out.println(node.val);
        }
    }

    public List<Integer> nonRecPostTraverse(TreeNode node) {
        return null;
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

    //BFS depth (迭代)
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
