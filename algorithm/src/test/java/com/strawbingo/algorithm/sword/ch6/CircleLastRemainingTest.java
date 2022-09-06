package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题62：圆圈中最后剩下的数字
 * 0，1，...，n-1这个n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。
 * 求出这个圆圈里剩下的最后一个数字
 */
public class CircleLastRemainingTest {

    @Test
    public void testLastRemaining(){
        CircleLastRemaining circleLastRemaining = new CircleLastRemaining();
        Assert.assertEquals(3,circleLastRemaining.lastRemaining(5,3));

        Assert.assertEquals(2,circleLastRemaining.lastRemaining(10,17));
    }
}
