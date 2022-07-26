package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class IntegerPowerTest {

    @Test
    public void testIsPowerOf(){
        Assert.assertEquals(false,IntegerPower.isPowerOf(5));
        Assert.assertEquals(true,IntegerPower.isPowerOf(2));
        Assert.assertEquals(true,IntegerPower.isPowerOf(16));
        Assert.assertEquals(true,IntegerPower.isPowerOf(1024));
    }
}
