package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class MinimumStackTest {

    @Test
    public void testMinStack() throws Exception {
        MinimumStack minimumStack = new MinimumStack();
        minimumStack.push(4);
        minimumStack.push(5);
        minimumStack.push(3);
        minimumStack.push(6);
        minimumStack.push(7);
        minimumStack.push(1);

        Assert.assertEquals(1,minimumStack.getMin());

        System.out.println("pop:"+minimumStack.pop());
        System.out.println("pop:"+minimumStack.pop());
        System.out.println("pop:"+minimumStack.pop());
        Assert.assertEquals(3,minimumStack.getMin());
        System.out.println("pop:"+minimumStack.pop());
        Assert.assertEquals(4,minimumStack.getMin());
        System.out.println("pop:"+minimumStack.pop());
        System.out.println("pop:"+minimumStack.pop());

    }
}
