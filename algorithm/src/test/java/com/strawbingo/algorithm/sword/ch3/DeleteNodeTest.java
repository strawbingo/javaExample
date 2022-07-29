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
    public void deleteNode() {
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
}
