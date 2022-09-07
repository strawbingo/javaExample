package com.strawbingo.algorithm.sword.ch6;

/**
 * 题66：构建乘积数组
 * 给定一个数组A[0,1,...,n-1]，请构建一个数组B[0,1,...,n-1]，
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能用除法
 * 除了下标 i 以外的元素的积
 */
public class MultiplyArray {

    public int[] constructArr(int[] nums) {
        if(nums==null || nums.length == 0) return new int[0];

        int len = nums.length;
        int[] ans = new int[len];

        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int back = nums[len-1];
        for (int i = len-2; i >=0 ; i--) {
            ans[i] = ans[i] * back;
            back = back*nums[i];
//            System.out.println(back);
        }
        return ans;
    }

}
