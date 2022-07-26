package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;


public class FullArrangeTest {

    @Test
    public void testNextNumber() {
        long number = 13465;
        Assert.assertEquals(13546, FullArrange.nextNumber(number));

        number = 1359742;
        Assert.assertEquals(1372459, FullArrange.nextNumber(number));

        number = 23456789;
        Assert.assertEquals(23456798, FullArrange.nextNumber(number));

        number = 654321;
        Assert.assertEquals(654321, FullArrange.nextNumber(number));

    }

    @Test(expected = InvalidParameterException.class)
    public void testNextNumberInvalidParameterException() {
        FullArrange.nextNumber(-1);
    }

}
