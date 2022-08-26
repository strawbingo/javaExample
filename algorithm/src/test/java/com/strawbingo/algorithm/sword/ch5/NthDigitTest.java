package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题44：数字序列中某一位的数字
 * 数字以0123456789101112131415...的格式序列化到一个字符序列中。
 * 在这个序列中，第5位（从0开始计数）是5，第13位是1，第19位是4，等等。请写出一个函数，求任意第n位对应的数字
 */
public class NthDigitTest {

    @Test
    public void testFindNthDigit(){
        NthDigit nthDigit = new NthDigit();
//        Assert.assertEquals(1,nthDigit.findNthDigit(10));
//        Assert.assertEquals(0,nthDigit.findNthDigit(11));
//        Assert.assertEquals(1,nthDigit.findNthDigit(12));
//        Assert.assertEquals(1,nthDigit.findNthDigit(13));
//        Assert.assertEquals(4,nthDigit.findNthDigit(19));
//        Assert.assertEquals(5,nthDigit.findNthDigit(5));
//        Assert.assertEquals(1,nthDigit.findNthDigit(190));
//        Assert.assertEquals(7,nthDigit.findNthDigit(1863));
        Assert.assertEquals(7,nthDigit.findNthDigit(1000000000));
    }

}
