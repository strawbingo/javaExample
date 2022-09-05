package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题61：扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2~10位数字本身，Q为12，K为13，而大小王可以看成任意数字
 */
public class PokerSequenceTest {

    @Test
    public void isStraight(){
        PokerSequence pokerSequence = new PokerSequence();
        int[] nums = {1,2,3,4,5};
        Assert.assertTrue(pokerSequence.isStraight(nums));

        int[] nums2 = {0,0,1,2,5};
        Assert.assertTrue(pokerSequence.isStraight(nums2));

        int[] nums3 = {0,0,1,2,6};
        Assert.assertFalse(pokerSequence.isStraight(nums3));

        int[] nums4 = {0,0,2,2,5};
        Assert.assertFalse(pokerSequence.isStraight(nums4));

        int[] nums5 = {9,10,4,0,9};
        Assert.assertFalse(pokerSequence.isStraight(nums5));
    }
}
