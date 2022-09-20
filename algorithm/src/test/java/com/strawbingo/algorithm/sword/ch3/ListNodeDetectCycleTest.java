package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题23：链表中环的入口点给定一个链表，返回链表开始入环的第一个节点。
 * 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。
 * 如果链表无环，则返回 null。如果一个链表中包含环，如何找出环的入口节点？
 */
public class ListNodeDetectCycleTest {

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

    private void setupListNodeLoop(){
        this.head = new ListNode(4);

        ListNode node5 = new ListNode(5);
        head.setNext(node5);
        ListNode node1 = new ListNode(1);
        node5.setNext(node1);
        ListNode node9 = new ListNode(9);
        node1.setNext(node9);

        node9.setNext(node5);

    }


    @Test
    public void testGetEntryPoint(){
        ListNodeDetectCycle listNodeDetectCycle = new ListNodeDetectCycle();
        setupListNode();
        ListNode node = listNodeDetectCycle.getEntryPoint(head);
        Assert.assertNull(node);

        setupListNodeLoop();
        node = listNodeDetectCycle.getEntryPoint(head);
        Assert.assertEquals(5, node.getVal());

        this.head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.setNext(node2);
        node2.setNext(head);

        node = listNodeDetectCycle.getEntryPoint(head);
        Assert.assertEquals(1, node.getVal());
    }

}
