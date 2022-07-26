package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.ch2.LinkListPrint.Node;
import org.junit.Test;

public class LinkListPrintTest {

    @Test
    public void testPrintFromEnd(){

        LinkListPrint linkListPrint = new LinkListPrint();
        Node node1 = linkListPrint.new  Node("a",null);

        Node node2 = linkListPrint.new  Node("b",null);
        node1.setNext(node2);

        Node node3 = linkListPrint.new  Node("c",null);
        node2.setNext(node3);

        linkListPrint.printFromEnd(node1);

//        Assert.assertArrayEquals(res, ReplaceBlank.replace(source,' ' ,newCharArr));
    }

    @Test
    public void testPrintFromEndWithStack(){

        LinkListPrint linkListPrint = new LinkListPrint();
        Node node1 = linkListPrint.new  Node("a",null);

        Node node2 = linkListPrint.new  Node("b",null);
        node1.setNext(node2);

        Node node3 = linkListPrint.new  Node("c",null);
        node2.setNext(node3);

        linkListPrint.printFromEndWithStack(node1);

    }
}
