package com.example.javacoding.dataStructure;

import javax.management.ListenerNotFoundException;

public class LinkNode {
    public LinkNode next;
    public int data;

    LinkNode(int val) {
        this.data = val;
        this.next = null;
    }

    //删除节点
    public void deleteNode(LinkNode node) {
        if(node.next == null) {
            node = null;
            return;
        }

    }

    //增加节点
    public void addNode(LinkNode node) {
        if(node.next == null) {
            node = null;
            return;
        }

    }

    // 翻转链表
    public LinkNode reverse(LinkNode node) {
        return new LinkNode(1);
    }

    // 中间元素


    // 判断是否是循环列表


    // 合并两个已排序链表

    // 链表排序

    // 删除倒数 第N个节点

    // 两个链表是否相交


}