package com.strawbingo.algorithm.sword.ch3;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题16：数值的整数次方
 * 实现函数double Power（double base，int exponent），求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题
 *
 * 1. 考虑底数和指数为0或负数
 * 2. 任何除0以外的实数的0次方都是1
 * 3. 0的n次方，当n大于0时，等于0。当n等于0时，0的0次方没有意义。当n小于0时，也没有意义。
 *    当n为正数时为0，n为负数时无意义。
 * 0的正数次方等于0；0的非正数次方（0次方和负数次方）无意义，因为0不能做分母
 */
public class PowerTest {

    @Test
    public void testPower(){

        Assert.assertEquals(1d,Power.power(1d,6),0.000001);
        Assert.assertEquals(8d,Power.power(2d,3),0.000001);
        Assert.assertEquals(1024d,Power.power(2d,10),0.000001);
        Assert.assertEquals(0.25d,Power.power(2d,-2),0.000001);
        Assert.assertEquals(0.125d,Power.power(2d,-3),0.000001);
        Assert.assertEquals(1d,Power.power(2d,0),0.000001);

//        Assert.assertEquals(0.01d,Power.power(0.1d,2),0.000001);

        Assert.assertNull(Power.power(0d,0));
        Assert.assertNull(Power.power(0d,-2));
        Assert.assertEquals(0d,Power.power(0d,2),0.000001);

        Assert.assertEquals(1d,Power.power(-1d,2),0.000001);
        Assert.assertEquals(-8d,Power.power(-2d,3),0.000001);
        Assert.assertEquals(1d,Power.power(-2d,0),0.000001);
        Assert.assertEquals(0.25d,Power.power(-2d,-2),0.000001);
        Assert.assertEquals(-0.125d,Power.power(-2d,-3),0.000001);


    }

    @Test
    public void testPowerEnhance(){

        Assert.assertEquals(1d,Power.powerEnhance(1d,6),0.000001);
        Assert.assertEquals(8d,Power.powerEnhance(2d,3),0.000001);
        Assert.assertEquals(1024d,Power.powerEnhance(2d,10),0.000001);
        Assert.assertEquals(0.25d,Power.powerEnhance(2d,-2),0.000001);
        Assert.assertEquals(0.125d,Power.powerEnhance(2d,-3),0.000001);
        Assert.assertEquals(1d,Power.powerEnhance(2d,0),0.000001);

        Assert.assertEquals(0.01d,Power.power(0.1d,2),0.000001);

        Assert.assertNull(Power.power(0d,0));
        Assert.assertNull(Power.power(0d,-2));
        Assert.assertEquals(0d,Power.powerEnhance(0d,2),0.000001);

        Assert.assertEquals(1d,Power.powerEnhance(-1d,2),0.000001);
        Assert.assertEquals(-8d,Power.powerEnhance(-2d,3),0.000001);
        Assert.assertEquals(1d,Power.powerEnhance(-2d,0),0.000001);
        Assert.assertEquals(0.25d,Power.powerEnhance(-2d,-2),0.000001);
        Assert.assertEquals(-0.125d,Power.powerEnhance(-2d,-3),0.000001);

        Assert.assertEquals(1d,Power.powerEnhance(1d,-2147483648),0.000001);
        Assert.assertEquals(0d,Power.powerEnhance(2d,-2147483648),0.000001);


    }

    @Test
    public void testMyPower(){
        Power power = new Power();
        Assert.assertEquals(1d,power.myPow(1d,6),0.000001);
        Assert.assertEquals(8d,power.myPow(2d,3),0.000001);
        Assert.assertEquals(1024d,power.myPow(2d,10),0.000001);
        Assert.assertEquals(0.25d,power.myPow(2d,-2),0.000001);
        Assert.assertEquals(0.125d,power.myPow(2d,-3),0.000001);
        Assert.assertEquals(1d,power.myPow(2d,0),0.000001);

//        Assert.assertEquals(0.01d,power.myPow(0.1d,2),0.000001);

        Assert.assertEquals(1d,power.myPow(0d,0),0.000001);
        Assert.assertTrue(Double.isInfinite(power.myPow(0d,-2)));
        Assert.assertEquals(0d,power.myPow(0d,2),0.000001);

        Assert.assertEquals(1d,power.myPow(-1d,2),0.000001);
        Assert.assertEquals(-8d,power.myPow(-2d,3),0.000001);
        Assert.assertEquals(1d,power.myPow(-2d,0),0.000001);
        Assert.assertEquals(0.25d,power.myPow(-2d,-2),0.000001);
        Assert.assertEquals(-0.125d,power.myPow(-2d,-3),0.000001);

        Assert.assertEquals(0d,power.myPow(-2d, -2147483648),0.000001);


    }
}
