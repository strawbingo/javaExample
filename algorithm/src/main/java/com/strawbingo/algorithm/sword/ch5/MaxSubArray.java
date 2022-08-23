package com.strawbingo.algorithm.sword.ch5;

/**
 * 题42：连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个字数组。
 * 求所有子数组的和的最大值。要求时间复杂度O(n)
 */
public class MaxSubArray {

    public int maxSubArraySum(int[] nums) {
//        if(nums.length == 1) return nums[0];

        int sum = 0;
        int tempSum = 0;
        for(int i=0; i<nums.length; i++){
            tempSum = tempSum+nums[i];

            if(i == 0 || tempSum>sum){
                sum=tempSum;
            }

            if(tempSum < 0 ) tempSum = 0;
        }

        return  sum;
    }

    /**
     *  动态规划
     * @param nums
     * @return
     */
    public int maxSubArraySum2(int[] nums) {
        if(nums.length == 0) return 0;

        //dp[i] 为i位置数组的最大值
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            max = Math.max(max,dp[i]);
        }

        return max;
    }
}
