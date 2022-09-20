package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题25：合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public class ListNodeMergeTest {

    /**
     * 迭代
     */
    @Test
    public void testMergeTwoLists(){
        ListNodeMerge listNodeMerge = new ListNodeMerge();
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA4 = new ListNode(4);
        nodeA1.setNext(nodeA2);
        nodeA2.setNext(nodeA4);

        ListNode nodeB1 = new ListNode(1);
        ListNode nodeB3 = new ListNode(3);
        ListNode nodeB4 = new ListNode(4);
        nodeB1.setNext(nodeB3);
        nodeB3.setNext(nodeB4);

        ListNode node = listNodeMerge.mergeTwoLists(nodeA1,nodeB1);
        Assert.assertEquals(3,node.getNext().getNext().getNext().getVal());

        node = listNodeMerge.mergeTwoLists(null,new ListNode(0));
        Assert.assertEquals(0,node.getVal());

    }

    /**
     * 递归
     */
    @Test
    public void testMergeTwoListsRecursion(){
        ListNodeMerge listNodeMerge = new ListNodeMerge();
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA4 = new ListNode(4);
        nodeA1.setNext(nodeA2);
        nodeA2.setNext(nodeA4);

        ListNode nodeB1 = new ListNode(1);
        ListNode nodeB3 = new ListNode(3);
        ListNode nodeB4 = new ListNode(4);
        nodeB1.setNext(nodeB3);
        nodeB3.setNext(nodeB4);

        ListNode node = listNodeMerge.mergeTwoListsRecursion(nodeA1,nodeB1);
        Assert.assertEquals(3,node.getNext().getNext().getNext().getVal());

        node = listNodeMerge.mergeTwoListsRecursion(null,new ListNode(0));
        Assert.assertEquals(0,node.getVal());

    }
}
