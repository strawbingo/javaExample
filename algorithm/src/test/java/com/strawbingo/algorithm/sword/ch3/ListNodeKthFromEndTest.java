package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ListNodeKthFromEndTest {

    ListNode head;
    private void setupListNode(){
        this.head = new ListNode(4);

        ListNode node5 = new ListNode(5);
        head.setNext(node5);
        ListNode node1 = new ListNode(1);
        node5.setNext(node1);
        ListNode node9 = new ListNode(9);
        node1.setNext(node9);

    }

    /**
     * 题22：链表中倒数第K个节点
     * 输入一个链表，输出该链表中倒数第k个节点。
     * 为了复合大多数人的习惯，本题从1开始计数，即链表尾节点是倒数第一个节点。
     * 例1、2、3、4、5、6，倒数第3个节点为4节点
     * 堆栈
     */
    @Test
    public void testGetKthFromEnd(){
        ListNodeKthFromEnd listNodeKthFromEnd = new ListNodeKthFromEnd();
        setupListNode();

        ListNode node = listNodeKthFromEnd.getKthFromEnd(head, 1);
        Assert.assertEquals(9,node.getVal());

        node = listNodeKthFromEnd.getKthFromEnd(head, 4);
        Assert.assertEquals(4,node.getVal());

        node = listNodeKthFromEnd.getKthFromEnd(head, 5);
        Assert.assertNull(node);
    }

    /**
     * 题22：链表中倒数第K个节点
     * 输入一个链表，输出该链表中倒数第k个节点。
     * 为了复合大多数人的习惯，本题从1开始计数，即链表尾节点是倒数第一个节点。
     * 例1、2、3、4、5、6，倒数第3个节点为4节点
     * 快慢指针法
     */
    @Test
    public void testGetKthFromEndFastSlowPoint(){
        ListNodeKthFromEnd listNodeKthFromEnd = new ListNodeKthFromEnd();
        setupListNode();

        ListNode node = listNodeKthFromEnd.getKthFromEndFastSlowPoint(head, 1);
        Assert.assertEquals(9,node.getVal());

        node = listNodeKthFromEnd.getKthFromEndFastSlowPoint(head, 4);
        Assert.assertEquals(4,node.getVal());

        node = listNodeKthFromEnd.getKthFromEndFastSlowPoint(head, 5);
        Assert.assertNull(node);
    }

}
