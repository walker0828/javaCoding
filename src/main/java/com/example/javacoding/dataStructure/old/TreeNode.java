package com.example.javacoding.dataStructure.old;

public class TreeNode {
    private int key = 0;
    private String data = null;
    private TreeNode leftChild = null;
    private TreeNode rightChild = null;

    private TreeNode root=null;

    public TreeNode() {}

    public TreeNode(int key, String data) {
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

//    /*
//    * 计算二叉树的高度
//    * */
//    public int height(TreeNode subTree) {
//        if(subTree == null) {
//            return 0;
//        }else{
//            int i = height(subTree.leftChild);
//            int j = height(subTree.rightChild);
//            return (i < j) ? (j+1) : (i+1);
//        }
//    }
//
//    public int size(TreeNode subTree) {
//        if (subTree == null) {
//            return 0;
//        }else{
//            return 1+size(subTree.leftChild) + size(subTree.rightChild);
//        }
//    }
//
//    public void destroy(TreeNode treeNode) {
//        if(treeNode != null) {
//            destroy(treeNode.leftChild);
//            destroy(treeNode.rightChild);
//            treeNode = null;
//        }
//    }
//
//    public TreeNode parent(TreeNode element) {
//
//    }
//
//    public TreeNode parent(TreeNode treeNode, TreeNode element) {
//
//    }
//
//    public void traverse(TreeNode treeNode) {
//        System.out.println("key:" + subTree.key + "--name:" + subTree.data);;
//        traverse(subTree.leftChild);
//        traverse(subTree.rightChild);
//    }
//
//    public TreeNode getRoot() {
//        return root;
//    }
//
//    // 前序遍历
//    public void preOrder(TreeNode treeNode) {
//        if(treeNode != null) {
//            visited(treeNode);
//            preOrder(treeNode);
//            preOrder(treeNode);
//        }
//    }
//
//    // 中序遍历
//    public void inOrder(TreeNode treeNode) {
//        if(treeNode != null) {
//            inOrder(treeNode.leftChild);
//            visited(treeNode);
//            inOrder(treeNode.rightChild);
//        }
//    }
//
//    // 后序遍历
//    public void postOrder(TreeNode treeNode) {
//        if(treeNode != null) {
//            postOrder(treeNode);
//            postOrder(treeNode);
//            visited(treeNode);
//        }
//    }
//
//    // 前序遍历(非遍历版)
//    private void nonRecPreOrder(TreeNode p) {
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode treeNode = p;
//        while(node != null || stack.size() >0) {
//            while(node != null) {
//                visited(node);
//                stack.push(treeNode);
//                node = treeNode.leftChild;
//            }
//            while(stack > 0) {
//                node = stack.pop();
//                visited(node);
//                node = treeNode.rightChild;
//            }
//        }
//    }
//
//    // 中序遍历(非遍历版)
//    private void nonRecInOrder(TreeNode p) {
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode treeNode = p;
//        while(node != null || stack.size() >0) {
//            while(node!=null) {
//                node = treeNode.leftChild;
//                visited(node);
//                stack.push()
//            }
//            while(stack > 0) {
//
//            }
//        }
//    }
//
//    // 后序遍历(非遍历版)
//    private void nonRecPostOrder(TreeNode p) {
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode treeNode = p;
//
//    }
//
//    private void visited(TreeNode treeNode) {
//        if(treeNode != null) {
//            System.io.println("TreeNode key" + treeNode.get + )
//        }
//    }
//
//    // 实现深度优先搜索
//    public List<int> dfs(TreeNode treeNode) {
//        preOrder(treeNode);
//        inOrder(treeNode);
//        postOrder(treeNode);
//
//    }
//
//    // 实现广度优先搜索
//    public List<int> bfs(TreeNode treeNode) {
//
//    }
//
//    // 插入
//    public void insert(String value) {
//
//    }
//
//    // 搜索
}