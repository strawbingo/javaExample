package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题46：把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成“a”，1翻译成“b”，......，11翻译成“l”，25翻译成“z”。
 * 一个数字可能有多种翻译。例如，12258，有5种不同的翻译，分别是“bccfi”、“bwfi”、“bczi”、“mcfi”和“mzi”。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法
 */
public class NumberTransToStringTest {

    @Test
    public void testTranslateNum(){
        NumberTransToString numberTransToString = new NumberTransToString();
        Assert.assertEquals(1,numberTransToString.translateNum(1));
        Assert.assertEquals(5,numberTransToString.translateNum(12258));
        Assert.assertEquals(2,numberTransToString.translateNum(23));
        Assert.assertEquals(1,numberTransToString.translateNum(506));
        Assert.assertEquals(12,numberTransToString.translateNum(1250156147));

        Assert.assertEquals(1,numberTransToString.translateNumDP(1));
        Assert.assertEquals(5,numberTransToString.translateNumDP(12258));
        Assert.assertEquals(2,numberTransToString.translateNumDP(23));
        Assert.assertEquals(1,numberTransToString.translateNumDP(506));
        Assert.assertEquals(12,numberTransToString.translateNumDP(1250156147));
    }
}
