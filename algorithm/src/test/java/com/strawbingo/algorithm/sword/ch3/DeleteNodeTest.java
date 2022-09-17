package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题18：删除链表的节点
 */
public class DeleteNodeTest {

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
     * 在O(1)时间内删除链表节点。给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间内删除该节点
     * 4 5 1 9
     */
    @Test
    public void testDeleteNode() {
        DeleteNode deleteNode = new DeleteNode();
        head = new ListNode(4);
        head = deleteNode.deleteNode(head,4);
        Assert.assertNull(head);


        head = null;
        setupListNode();
        head = deleteNode.deleteNode(head,1);
        Assert.assertEquals(4, head.getVal());
        Assert.assertEquals(5, head.getNext().getVal());
        Assert.assertEquals(9, head.getNext().getNext().getVal());


//        while(head != null) {
//            System.out.println(head.getVal());
//            head = head.getNext();
//        }

        head = null;
        setupListNode();
        head = deleteNode.deleteNode(head,4);
        Assert.assertEquals(5, head.getVal());

        head = null;
        setupListNode();
        head = deleteNode.deleteNode(head,5);

        Assert.assertEquals(4, head.getVal());
        Assert.assertEquals(1, head.getNext().getVal());
        Assert.assertEquals(9, head.getNext().getNext().getVal());


        head = null;
        setupListNode();
        head = deleteNode.deleteNode(head,9);
        Assert.assertEquals(4, head.getVal());
        Assert.assertEquals(5, head.getNext().getVal());
        Assert.assertEquals(1, head.getNext().getNext().getVal());
        Assert.assertNull( head.getNext().getNext().getNext());

    }

    private void setupDupListNode(){
        this.head = new ListNode(4);

        ListNode node5 = new ListNode(5);
        head.setNext(node5);
        ListNode node5d = new ListNode(5);
        node5.setNext(node5d);
        ListNode node1 = new ListNode(1);
        node5.setNext(node1);
        ListNode node9 = new ListNode(9);
        node1.setNext(node9);
        ListNode node9d = new ListNode(9);
        node9.setNext(node9d);

    }

    /**
     * 删除链表中重复的节点。在一个排序的链表中，如何删除重复的节点？
     */
    @Test
    public void testDeleteDuplicateNode() {
        DeleteNode deleteNode = new DeleteNode();
        setupDupListNode();
        head = deleteNode.deleteDuplicateNode(head);

        Assert.assertEquals(4, head.getVal());
        Assert.assertEquals(5, head.getNext().getVal());
        Assert.assertEquals(1, head.getNext().getNext().getVal());
        Assert.assertEquals(9, head.getNext().getNext().getNext().getVal());
        Assert.assertNull( head.getNext().getNext().getNext().getNext());

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(2);
        head.next = node2;
        node2.next= node3;
        node3.next = node4;
        node4.next = node5;
        deleteNode.deleteDuplicateNode(head);
        Assert.assertEquals(2,head.next.val);
    }
}
