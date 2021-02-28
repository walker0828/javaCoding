package com.example.javacoding.dataStructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TreeNodeTest {

    @Resource
    public TreeNode treeNode;

    @Test
    public void test () {
        TreeNode header = new TreeNode(0);
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(2);
        header.left = left1;
        header.right = right1;
        TreeNode left11 = new TreeNode(3);
        TreeNode left12 = new TreeNode(4);
        left1.left = left11;
        left1.right = left12;
        TreeNode left21 = new TreeNode(5);
        TreeNode left22 = new TreeNode(6);
        right1.left = left21;
        right1.right = left22;

        treeNode.inTraverse(header);
    }
}
