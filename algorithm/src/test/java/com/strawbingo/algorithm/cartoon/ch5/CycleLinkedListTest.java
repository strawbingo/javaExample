package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

import static com.strawbingo.algorithm.cartoon.ch5.CycleLinkedList.*;

public class CycleLinkedListTest {



    @Test
    public void testIsCycleFalse(){
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(1);
        Node node5 = new Node(1);
        Node node6 = new Node(1);
        Node node7 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        boolean isCycle = isCycle(node1);

        Assert.assertEquals(false,isCycle);
    }

    @Test
    public void testIsCycleTrue(){
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(1);
        Node node5 = new Node(1);
        Node node6 = new Node(1);
        Node node7 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        node7.next = node4;

        boolean isCycle = isCycle(node1);


        Assert.assertEquals(true,isCycle);
    }

    @Test
    public void testMeetPoint(){
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(1);
        Node node5 = new Node(1);
        Node node6 = new Node(1);
        Node node7 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        node7.next = node3;

        Node enterCycle = enterCycle(node1);

        Assert.assertEquals(node3,enterCycle);
    }


}
