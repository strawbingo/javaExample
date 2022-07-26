package com.strawbingo.algorithm.cartoon.ch2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

    MyLinkedList myLinkedList;

    @Before
    public void setup(){
        myLinkedList = new MyLinkedList();
        myLinkedList.insertNode(1,0);
        myLinkedList.insertNode(2,1);
        myLinkedList.insertNode(3,1);
        myLinkedList.insertNode(4,2);
        myLinkedList.insertNode(5,1);
        myLinkedList.insertNode(-1,0);
    }

    @Test
    public void testOutPut(){

        myLinkedList.output();
    }

    @Test
    public void testGetNode(){
        Assert.assertEquals(5,myLinkedList.getNode(2).data);
    }

    @Test
    public  void testInsertNode(){
        myLinkedList.insertNode(10,3);
        Assert.assertEquals(10,myLinkedList.getNode(3).data);

    }

    @Test
    public void testRemoveNode(){
        System.out.println("******remove first********");
        Assert.assertEquals(-1,myLinkedList.removeNode(0).data);
        myLinkedList.output();

        System.out.println("*******remove last*******");
        Assert.assertEquals(2,myLinkedList.removeNode(4).data);
        myLinkedList.output();

        System.out.println("*******remove mid*******");
        Assert.assertEquals(3,myLinkedList.removeNode(2).data);
        myLinkedList.output();
    }
}
