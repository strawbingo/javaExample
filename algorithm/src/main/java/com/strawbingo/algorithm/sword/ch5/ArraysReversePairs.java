package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;

/**
 * 题51：数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。例如，在数组{7,5,6,4}中，
 * 一共存在5个逆序对，分别是（7，6）、（7，5）、（7，4）、（6，4）和（5，4）
 */
public class ArraysReversePairs {


    public int reversePairs(int[] nums) {
        if(nums.length<2) return 0;

        int[] source = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            source[i] = nums[i];
        }

        int[] temp = new int[nums.length];

        return reversePairs(source,0,nums.length-1,temp);
    }

    private int reversePairs(int[] nums, int left, int right, int[] temp) {
        if(left == right) return 0;

        int mid = left + (right - left)/2;
        int resLeft = reversePairs(nums,left,mid,temp);
        int refRight = reversePairs(nums,mid+1,right,temp);

        //优化
        if(nums[mid] <= nums[mid+1]){
            return resLeft+refRight;
        }

        int res = resLeft + refRight + mergeArray(nums,left,mid,right,temp);

        return res;
    }

    private int mergeArray(int[] nums, int left, int mid, int right, int[] temp) {
        int res = 0;
        for (int i = left; i < right+1; i++) {
            temp[i] = nums[i];
        }

//        System.out.println("new merge: left=" + left + ":right=" + right+":nums" + Arrays.toString(nums));

        int i = left, j = mid + 1;
        for (int index = left; index <= right; index++) {
//            System.out.println("i="+i + ":j=" + j + ":index=" + index);
            if (i == mid + 1) {
                nums[index] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[index] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                nums[index] = temp[i];
                i++;
            } else {
                nums[index] = temp[j];
                j++;
                res += mid - i + 1;
            }
        }
//        System.out.println("res=" + res + ":nums" + Arrays.toString(nums));
        return res;
    }

}
