package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题15：二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数（也被称为 汉明重量).）
 */
public class HammingWeightTest {

    @Test
    public void hammingWeight(){
        HammingWeight hammingWeight = new HammingWeight();
        Assert.assertEquals(3, hammingWeight.hammingWeight(11));
        Assert.assertEquals(1, hammingWeight.hammingWeight(128));
        Assert.assertEquals(31, hammingWeight.hammingWeight(-3));
    }
}
