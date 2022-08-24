package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题43：1~n整数中1出现的次数
 * 输入一个正整数，求1~n这个n个整数的十进制表示中1出现的次数。
 * 例如，输入如12，1~12这些整数中含1的数字有1，10，11和12，1一共出现了5次
 */
public class DigitCounterTest {

    @Test
    public void testCountDigitOne(){
        DigitCounter digitCounter = new DigitCounter();
        int count = digitCounter.countDigitOne(12);
        Assert.assertEquals(5, count);

        count = digitCounter.countDigitOne(13);
        Assert.assertEquals(6, count);

        count = digitCounter.countDigitOne(1);
        Assert.assertEquals(1, count);

        count = digitCounter.countDigitOne(1410065408);
        Assert.assertEquals(1737167499, count);
    }
}
