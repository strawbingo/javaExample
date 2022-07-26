package com.strawbingo.algorithm.cartoon.ch6;

import org.junit.Assert;
import org.junit.Test;

public class MyBitMapTest
{

    @Test
    public void testBitMap() throws Exception {
        System.out.println(0 >> 6);
        System.out.println(63 >> 6);
        System.out.println(64 >> 6);
        System.out.println(65 >> 6);
        MyBitMap bitMap = new MyBitMap(128);
        bitMap.setBit(4);
        bitMap.setBit(98);


        Assert.assertEquals(true,bitMap.getBit(4));
        Assert.assertEquals(true,bitMap.getBit(98));
        Assert.assertEquals(false,bitMap.getBit(100));


    }
}
