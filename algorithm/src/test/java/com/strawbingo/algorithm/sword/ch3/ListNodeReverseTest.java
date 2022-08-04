package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ListNodeReverseTest {

    ListNode head;

    private void setupListNode() {
        this.head = new ListNode(1);

        ListNode node2 = new ListNode(2);
        head.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4 = new ListNode(4);
        node3.setNext(node4);

        node4.setNext(new ListNode(5));

    }

    /**
     * 题24：反转链表
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
     */
    @Test
    public void testReverseList() {

        ListNodeReverse listNodeReverse = new ListNodeReverse();
        setupListNode();
        ListNode node =  listNodeReverse.reverseList(head);
        Assert.assertEquals(5,node.getVal());

    }

    /**
     * 题24：反转链表
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
     */
    @Test
    public void testReverseLisRecursion() {

        ListNodeReverse listNodeReverse = new ListNodeReverse();
        setupListNode();
        ListNode node =  listNodeReverse.reverseListRecursion(head);
        Assert.assertEquals(5,node.getVal());

    }
}
