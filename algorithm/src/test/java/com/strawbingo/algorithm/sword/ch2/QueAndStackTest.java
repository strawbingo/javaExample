package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题9：用两个栈实现一个队列
 */
public class QueAndStackTest {

    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead
     */
    @Test
    public void testQueByStack(){
        QueAndStack queAndStack = new QueAndStack();
        Assert.assertEquals(-1,queAndStack.deleteHead());
        Assert.assertEquals(-1,queAndStack.deleteHead());
        queAndStack.appendTail(1);
        queAndStack.appendTail(2);
        queAndStack.appendTail(3);
        Assert.assertEquals(1, queAndStack.deleteHead());
    }

    /**
     * 扩展：用两个队列实现一个栈
     */
    @Test
    public void testStackByQueue(){
        QueAndStack queAndStack = new QueAndStack();
        Assert.assertEquals(true,queAndStack.empty());
        queAndStack.push(1);
        queAndStack.push(2);
        Assert.assertEquals(false,queAndStack.empty());
        Assert.assertEquals(2,queAndStack.top());
        Assert.assertEquals(2,queAndStack.pop());
        Assert.assertEquals(1,queAndStack.pop());
        Assert.assertEquals(true,queAndStack.empty());
    }

}
