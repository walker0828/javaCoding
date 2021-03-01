package com.example.javacoding.dataStructure;

import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
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

    public void inTraverse(TreeNode node) {
        if(node != null) {
            inTraverse(node.left);
            System.out.println(node.val);
            inTraverse(node.right);
        }
    }

    public void postTraverse(TreeNode node) {
        Vector<String> ss = new Vector<>();
        if(node != null) {
            postTraverse(node.left);
            postTraverse(node.right);
            System.out.println(node.val);
        }
    }

    //DFS depth
    public void dfs(TreeNode node) {

    }

    //BFS depth
    public void bfs(TreeNode node) {

    }

    //zigzag depth
    public void zig(TreeNode node) {

    }
}
