package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;
import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题52：两个链表的第一个公共节点
 * 输入如两个链表，找出它们的第一个公共节点
 */
public class ListNodeIntersectionNodeTest {



    @Test
    public void testGetIntersectionNode(){
        ListNodeIntersectionNode listNodeIntersectionNode = new ListNodeIntersectionNode();
        ListNode headA = new ListNode(4);
        ListNode nodeA1 = new ListNode(1);
        headA.setNext(nodeA1);

        ListNode headB = new ListNode(5);
        ListNode nodeB0 = new ListNode(0);
        headB.setNext(nodeB0);
        ListNode nodeB1 = new ListNode(1);
        nodeB0.setNext(nodeB1);

        ListNode node8 = new ListNode(8);
        nodeA1.setNext(node8);
        nodeB1.setNext(node8);

        ListNode node4 = new ListNode(4);
        node8.setNext(node4);
        ListNode node5 = new ListNode(5);
        node4.setNext(node5);


        ListNode interNode = listNodeIntersectionNode.getIntersectionNode(headA,headB);
        Assert.assertEquals(8,interNode.getVal());


        interNode = listNodeIntersectionNode.getIntersectionNode2(headA,headB);
        Assert.assertEquals(8,interNode.getVal());
    }
}
