package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题47：礼物的最大价值
 * 在一个m*n的棋盘的每一格斗放一个礼物，每个礼物都有一定的价值（价值大于0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格，直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物，请计算你最多能拿到多少价值的礼物？
 */
public class GiftMaxValueTest {

    @Test
    public void testMaxValue(){
        GiftMaxValue giftMaxValue = new GiftMaxValue();
        int[][] grid = {{1,3,1},
                         {1,5,1},
                          {4,2,1}};
        Assert.assertEquals(12,giftMaxValue.maxValue(grid));

        int[][] grid2 = {{1,3,1,0},
                         {1,2,5,1},
                         {12,2,1,1}};
        Assert.assertEquals(18,giftMaxValue.maxValue(grid2));
    }
}
