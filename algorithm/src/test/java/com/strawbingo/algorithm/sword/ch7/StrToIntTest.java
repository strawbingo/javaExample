package com.strawbingo.algorithm.sword.ch7;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题67：把字符串转换成整数
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 */
public class StrToIntTest {

    @Test
    public void testStrToInt(){
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(-1*Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(-1*Integer.MAX_VALUE);

        StrToInt strToInt = new StrToInt();
        Assert.assertEquals(-42, strToInt.strToInt(" -42"));
        Assert.assertEquals(42, strToInt.strToInt("42"));
        Assert.assertEquals(4193, strToInt.strToInt("4193 with words"));
        Assert.assertEquals(0, strToInt.strToInt("words and 987"));
        Assert.assertEquals(-2147483648, strToInt.strToInt("-91283472332"));
        Assert.assertEquals(0, strToInt.strToInt(""));
        Assert.assertEquals(2147483647, strToInt.strToInt("9223372036854775808"));
    }
}
