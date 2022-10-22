package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题49：丑数
 * 我们把只包含因子2、3和5数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第1500个丑数。
 * 例如，6、8都是丑数，但14不是，因为它包含因子7.习惯上我们把1当做第一个丑数。
 */
public class UglyNumberTest {

    @Test
    public void tetNthUglyNumber(){
        UglyNumber uglyNumber = new UglyNumber();
        Assert.assertEquals(1,uglyNumber.nthUglyNumber(1));
        Assert.assertEquals(12,uglyNumber.nthUglyNumber(10));
        Assert.assertEquals(15,uglyNumber.nthUglyNumber(11));

    }
}
