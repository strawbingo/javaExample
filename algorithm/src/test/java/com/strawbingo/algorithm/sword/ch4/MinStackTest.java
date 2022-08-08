package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题30：包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数。
 * 在该栈中，调用min，push及pop的时间复杂度为O(1)。
 */
public class MinStackTest {

    @Test
    public void testMinStack(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.min());   //返回 -3.
        minStack.pop();
        Assert.assertEquals(0, minStack.top());     //  返回 0.
        Assert.assertEquals(-2,minStack.min());    //返回 -2.


        minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        Assert.assertEquals(0, minStack.min());   //返回 -3.
        minStack.pop();
        Assert.assertEquals(1, minStack.top());     //  返回 0.
        Assert.assertEquals(0,minStack.min());    //返回 -2.
    }

}
