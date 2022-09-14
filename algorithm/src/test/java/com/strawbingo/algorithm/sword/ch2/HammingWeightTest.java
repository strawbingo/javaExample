package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题15：二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数（也被称为 汉明重量).）
 */
public class HammingWeightTest {

    @Test
    public void testHammingWeight(){
        HammingWeight hammingWeight = new HammingWeight();
        Assert.assertEquals(3, hammingWeight.hammingWeight(11));
        Assert.assertEquals(1, hammingWeight.hammingWeight(128));
        Assert.assertEquals(31, hammingWeight.hammingWeight(-3));


        Assert.assertEquals(3, hammingWeight.hammingWeight2(11));
        Assert.assertEquals(1, hammingWeight.hammingWeight2(128));
        Assert.assertEquals(31, hammingWeight.hammingWeight2(-3));
    }

    /**
     * 一条语句判断整数是不是2的n次方
     */
    @Test
    public void testIs2N(){
        HammingWeight hammingWeight = new HammingWeight();
        Assert.assertFalse(hammingWeight.is2N(1));
        Assert.assertTrue(hammingWeight.is2N(2));
        Assert.assertFalse(hammingWeight.is2N(3));
        Assert.assertTrue(hammingWeight.is2N(8));
        Assert.assertTrue(hammingWeight.is2N(1024));

    }
}
