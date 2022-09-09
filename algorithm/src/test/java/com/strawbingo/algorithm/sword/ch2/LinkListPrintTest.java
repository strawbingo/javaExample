package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.ch2.LinkListPrint.Node;
import org.junit.Assert;
import org.junit.Test;


/**
 * 题6：从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class LinkListPrintTest {

    @Test
    public void testPrintFromEnd(){

        LinkListPrint linkListPrint = new LinkListPrint();
        Node node1 = setup();

        linkListPrint.printFromEnd(node1);

//        Assert.assertArrayEquals(res, ReplaceBlank.replace(source,' ' ,newCharArr));
    }

    @Test
    public void testPrintFromEndWithStack(){

        LinkListPrint linkListPrint = new LinkListPrint();
        Node node1 = setup();

        linkListPrint.printFromEndWithStack(node1);

    }

    private Node setup(){
        Node node1 = new  Node(1,null);

        Node node2 = new  Node(2,null);
        node1.setNext(node2);

        Node node3 = new  Node(3,null);
        node2.setNext(node3);

        return node1;
    }

    @Test
    public void testReversePrint(){
        LinkListPrint linkListPrint = new LinkListPrint();
        Node node1 = setup();
        int[] expect = {3,2,1};
        Assert.assertArrayEquals(expect,linkListPrint.reversePrint(node1));
    }
}
