package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 题57：和为s的数字
 */
public class ArraySumTest {

    /**
     * 题目一：和为s的两个数字
     * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
     * 如果有多对数字的和等于s，则输出任意一对即可
     */
    @Test
    public void testTwoSum(){
        ArraySum arraySum = new ArraySum();
        int[] nums = {2,7,11,15};
        int[] expectRes = {2,7};
        int[] calcRes = arraySum.twoSum(nums, 9 );
        Arrays.sort(calcRes);
        Assert.assertArrayEquals(expectRes,calcRes);

        int[] nums2 = {10,26,30,31,47,60};
        int[] expectRes2 = {10,30};
        int[] calcRes2 = arraySum.twoSum(nums2, 40 );
        Arrays.sort(calcRes2);
        Assert.assertArrayEquals(expectRes2,calcRes2);
    }

    /**
     * 题目二：和为s的连续正数序列
     * 输入一个正数s，打印出所有和为s的连续正数序列（至少含有两个数）。
     * 例如，输入15，由于1+2+3+4+5=4+5+6=7+8=15,所以打印出3个连续序列
     */
    @Test
    public void testFindContinuousSequence(){
        ArraySum arraySum = new ArraySum();
        int[][] expectRes = {{2,3,4},{4,5}};
        Assert.assertArrayEquals(expectRes,arraySum.findContinuousSequence(9));

        Assert.assertArrayEquals(expectRes,arraySum.findContinuousSequence2(9));

    }
}
