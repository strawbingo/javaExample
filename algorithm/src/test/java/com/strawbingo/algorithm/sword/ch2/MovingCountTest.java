package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题13：机器人的运动范围。
 * 地上有一个m行n列的方格。一个机器人从坐标（0,0）的格子开始移动，上下左右移动，不能进入坐标和列数字之和大于k的格子。
 * 求能够到达多少个格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
 * 但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
public class MovingCountTest {

    @Test
    public void testMovingCount(){
        MovingCount movingCount = new MovingCount();
        Assert.assertEquals(3,movingCount.movingCount(2, 3 , 1));
        Assert.assertEquals(1,movingCount.movingCount(3, 1 , 0));
        Assert.assertEquals(8,movingCount.movingCount(2, 4 , 6));
    }
}
