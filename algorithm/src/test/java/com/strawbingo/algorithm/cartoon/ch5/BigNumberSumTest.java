package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class BigNumberSumTest {

    @Test
    public void testAdd(){

        Assert.assertEquals("11294967294",BigNumberSum.add("2147483647","9147483647"));

        Assert.assertEquals("6",BigNumberSum.add("2","4"));

        Assert.assertEquals("800",BigNumberSum.add("455","345"));

    }
}
