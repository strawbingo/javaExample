package com.strawbingo.algorithm.sword.ch3;

public class ArrayExchange {

    /**
     * 题21：调整数组顺序使计数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，
     * 所有偶数位于数组的后半部分
     */
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        while (i < j){
            while (nums[i] %2 ==1 && i <nums.length-1) i++;

            while (nums[j]%2 ==0 && j>0) j--;

            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;

    }

}
