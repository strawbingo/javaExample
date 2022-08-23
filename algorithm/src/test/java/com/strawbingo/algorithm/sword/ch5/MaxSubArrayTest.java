package com.strawbingo.algorithm.sword.ch5;


import org.junit.Assert;
import org.junit.Test;

/**
 * 题42：连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个字数组。
 * 求所有子数组的和的最大值。要求时间复杂度O(n)
 */
public class MaxSubArrayTest {

    @Test
    public void testMaxSubArraySum(){
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray.maxSubArraySum(nums);
        Assert.assertEquals(6,max);

        int[] nums2 = {-2};
        int max2 = maxSubArray.maxSubArraySum(nums2);
        Assert.assertEquals(-2,max2);

        int[] nums3 = {-2,-1};
        int max3 = maxSubArray.maxSubArraySum(nums3);
        Assert.assertEquals(-1,max3);

    }

    /**
     * 动态规划
     */
    @Test
    public void testMaxSubArraySum2() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray.maxSubArraySum2(nums);
        Assert.assertEquals(6, max);

        int[] nums2 = {-2};
        int max2 = maxSubArray.maxSubArraySum2(nums2);
        Assert.assertEquals(-2, max2);

        int[] nums3 = {-2, -1};
        int max3 = maxSubArray.maxSubArraySum2(nums3);
        Assert.assertEquals(-1, max3);
    }
}

