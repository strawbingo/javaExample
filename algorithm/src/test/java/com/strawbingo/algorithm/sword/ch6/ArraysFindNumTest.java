package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题53：在排序数组中查找数字
 */
public class ArraysFindNumTest {

    /**
     * 题目一：数字在排序数组中出现的次数
     * 统计一个数字在排序数组中出现的次数。
     * 例如，输入排序数组{1,2,3,3,3,3,4,5}和数字3，由于3在这个数组中出现了4次，因此输出4
     */
    @Test
    public void testSearchCount(){
        ArraysFindNum arraysFindNum = new ArraysFindNum();
        int[] nums = {1,2,3,3,3,3,4,5};
        Assert.assertEquals(4,arraysFindNum.searchCounts(nums,3));
        Assert.assertEquals(0,arraysFindNum.searchCounts(nums,8));

        int[] nums2 = {5,7,7,8,8,10};
        Assert.assertEquals(2,arraysFindNum.searchCounts(nums2,8));
        Assert.assertEquals(0,arraysFindNum.searchCounts(nums2,6));

        int[] nums3 = {2,2};
        Assert.assertEquals(2,arraysFindNum.searchCounts(nums3,2));
        Assert.assertEquals(0,arraysFindNum.searchCounts(nums3,6));

    }

    /**
     * 题目二：0~n-1中缺失的数字
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0~n-1之内。
     * 在范围0~n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字
     */
    @Test
    public void testMissingNumber(){
        ArraysFindNum arraysFindNum = new ArraysFindNum();
        int[] nums = {0,1,3};
        Assert.assertEquals(2,arraysFindNum.missingNumber(nums));

        int[] nums2 = {0,1,2,3,4,5,6,7,9};
        Assert.assertEquals(8,arraysFindNum.missingNumber(nums2));

        int[] nums3 = {0};
        Assert.assertEquals(1,arraysFindNum.missingNumber(nums3));

    }

    /**
     * 题目三：数组中数值和下标相等的元素
     * 假设一个单调递增的数组里每个元素都是整数并且是唯一的。
     * 请编程实现一个函数，找出数组中任意一个数值等于其下标的元素。
     * 例如，在数组{-3,-1,1,3,5}中，数字3和它的下标相等
     */
    @Test
    public void testGetNubSubscriptEqualsValue(){
        ArraysFindNum arraysFindNum = new ArraysFindNum();
        int[] nums = {-3,-1,1,3,5};
        Assert.assertEquals(3,arraysFindNum.getNubSubscriptEqualsValue(nums));

        int[] nums2 = {-3,-1,1,4,5};
        Assert.assertEquals(-1,arraysFindNum.getNubSubscriptEqualsValue(nums2));
    }


}
