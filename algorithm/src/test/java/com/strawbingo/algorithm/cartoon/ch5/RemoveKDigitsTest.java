package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class RemoveKDigitsTest {

    @Test
    public void testGetMinNum(){
        Assert.assertEquals(12415,RemoveKDigits.getMinNum(124165,1));

        Assert.assertEquals(1241,RemoveKDigits.getMinNum(124165,2));

        Assert.assertEquals(321,RemoveKDigits.getMinNum(7654321,4));
    }
}
