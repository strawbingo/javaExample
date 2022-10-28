package com.strawbingo.algorithm.sword.ch5;



/**
 * 题51：数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。例如，在数组{7,5,6,4}中，
 * 一共存在5个逆序对，分别是（7，6）、（7，5）、（7，4）、（6，4）和（5，4）
 */
public class ArraysReversePairs {


    public int reversePairs(int[] nums) {
        if(nums.length<2){
            return 0;
        }

        int[] sorted = new int[nums.length];

        int ans = sort(nums,sorted,0,nums.length-1);
        return ans;
    }

    //sort numbers
    private int sort(int[] nums, int[] sorted, int left, int right) {
//        System.out.println("sort=left="+left+":right="+right);
        if(left == right){
            return 0;
        }
        int mid = left + (right-left)/2;
        int leftPairs = sort(nums,sorted,left,mid);
        int rightPairs = sort(nums,sorted,mid+1,right);
        
        int count = merge(nums,sorted,left,mid,right);

        return leftPairs+rightPairs +count;
    }

    private int merge(int[] nums,int[] sorted, int left, int mid,int right) {
        int i = left, j = mid+1;
//        System.out.println(i+":"+j);
        int count = 0;
        for (int index = left; index <= right; index++) {
            if(i>mid){
                sorted[index] = nums[j];
                j ++;
            }
            else if(j>right){
                sorted[index] = nums[i];
                i++;
            }else if(nums[i]<=nums[j]){
                sorted[index] = nums[i];
                i++;
            }else if( nums[j]<nums[i]){
                count += mid - i +1;
                sorted[index] = nums[j];
                j ++;
            }

        }

        for (int index = left; index <= right; index++) {
            nums[index] = sorted[index];
        }

        return count;
    }


}
