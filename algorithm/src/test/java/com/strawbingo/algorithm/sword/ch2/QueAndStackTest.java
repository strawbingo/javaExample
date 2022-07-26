package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

public class QueAndStackTest {

    /**
     * 用两个栈实现一个队列。队列声明两个函数appendTail和deleteHead
     */
    @Test
    public void testQueByStack(){

        Assert.assertNull(QueAndStack.deleteHead());
        QueAndStack.appendTail("a");
        QueAndStack.appendTail("b");
        QueAndStack.appendTail("c");
        Assert.assertEquals("a", QueAndStack.deleteHead());
    }


}
