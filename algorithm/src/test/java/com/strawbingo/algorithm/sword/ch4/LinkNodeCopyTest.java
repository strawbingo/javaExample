package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题35：复杂链表的复制
 * 请实现函数ComplexListNode*Clone（ComplexListNode*pHead），复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个m_pNext指针指向下一个节点，还有一个m_pSilbling指针指向链表中的任意节点或者nullptr
 */
public class LinkNodeCopyTest {

    //[[7,null],[13,0],[11,4],[10,2],[1,0]]
    @Test
    public void testCopyRandomList(){
        Node head = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);

        head.next = node13;
        node13.next = node11;
        node13.random= head;

        node11.next = node10;
        node11.random = node1;

        node10.next = node1;
        node10.random = node11;

        node1.random = head;


        LinkNodeCopy linkNodeCopy = new LinkNodeCopy();

        Node newHead = linkNodeCopy.copyRandomList(head);
        Assert.assertEquals(7, newHead.val);
        Assert.assertEquals(7, newHead.next.random.val);


    }
}
