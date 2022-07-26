package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class QueueUseStackTest {

    @Test
    public void testPushAndPop() throws Exception {
        QueueUseStack<Integer> queueUseStack = new QueueUseStack<>();

        queueUseStack.push(1);
        queueUseStack.push(2);
        queueUseStack.push(3);

        Assert.assertEquals(1,(int)queueUseStack.pop());
        Assert.assertEquals(2,(int)queueUseStack.pop());


        queueUseStack.push(4);
        Assert.assertEquals(3,(int)queueUseStack.pop());
        Assert.assertEquals(4,(int)queueUseStack.pop());
    }

    @Test
    public void testPushAndPopDouble() throws Exception {
        QueueUseStack<HashMap> queueUseStack = new QueueUseStack<>();

        queueUseStack.push(new HashMap());
//        queueUseStack.push(2d);
//        queueUseStack.push(3d);
//
//        Assert.assertEquals(1d,(double) queueUseStack.pop());
//        Assert.assertEquals(2d,(double)queueUseStack.pop());
//
//
//        queueUseStack.push(4d);
//        Assert.assertEquals(3d,(double)queueUseStack.pop());
//        Assert.assertEquals(4d,(double)queueUseStack.pop());
    }

}
