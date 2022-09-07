package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题65：不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用"＋"、“➖”、“✖️”、“➗”四则运算符号
 */
public class AddWithoutArithmeticTest {

    @Test
    public void addTest(){
        AddWithoutArithmetic addWithoutArithmetic = new AddWithoutArithmetic();
        Assert.assertEquals(2,addWithoutArithmetic.add(1,1));
    }
}
