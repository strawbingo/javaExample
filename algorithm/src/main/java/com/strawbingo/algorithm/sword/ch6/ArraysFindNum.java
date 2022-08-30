package com.strawbingo.algorithm.sword.ch6;

/**
 * 题53：在排序数组中查找数字
 */
public class ArraysFindNum {

    /**
     * 题目一：数字在排序数组中出现的次数
     * 统计一个数字在排序数组中出现的次数。
     * 例如，输入排序数组{1,2,3,3,3,3,4,5}和数字3，由于3在这个数组中出现了4次，因此输出4
     */
    public int searchCounts(int[] nums, int target) {
        if(nums.length == 0) return 0;

        int count = 0;
        int left = searchLeft(nums,target,0,nums.length-1);
        int right= searchRight(nums,target,0,nums.length-1);
        if(left >= 0){
            count = right - left +1;
        }

//        System.out.println(left+":"+right);
        return count;
    }

    private int searchLeft(int[] nums, int target, int left, int right) {
        if(left==right) {
            if(nums[left]== target){
                return left;
            }
            else {
                return -1;
            }
        }

        int mid = left + (right-left)/2;
        if(nums[mid] == target) {
            if(mid ==0 || nums[mid-1] !=target){
                return mid;
            }
            else {
                return searchLeft(nums,target,left,mid);
            }
        }
        else if(nums[mid] > target ) {
           return searchLeft(nums,target,left,mid);
        }
        else {
           return searchLeft(nums,target,mid+1,right);
        }
    }

    private int searchRight(int[] nums, int target, int left, int right) {
        if(left==right) {
            if (nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }

        int mid = left + (right-left)/2;
        if(nums[mid] == target) {
            if(nums[mid+1] !=target) {
                return mid;
            }
            else {
                return searchRight(nums,target,mid+1,right);
            }
        }
        else if(nums[mid] > target ) {
            return searchRight(nums,target,left,mid);
        }
        else {
            return searchRight(nums,target,mid+1,right);
        }
    }

    /**
     * 题目二：0~n-1中缺失的数字
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0~n-1之内。
     * 在范围0~n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字
     */
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;
        int left=0, right = nums.length-1;


        while (left <= right ){
            int mid = left + (right-left)/2;
            if(nums[mid] == mid){
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }
        return left;
    }

    /**
     * 题目三：数组中数值和下标相等的元素
     * 假设一个单调递增的数组里每个元素都是整数并且是唯一的。
     * 请编程实现一个函数，找出数组中任意一个数值等于其下标的元素。
     * 例如，在数组{-3,-1,1,3,5}中，数字3和它的下标相等
     */
    public int getNubSubscriptEqualsValue(int[] nums) {
        int left=0, right = nums.length-1;

        while (left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == mid){
                return mid;
            }
            else if(nums[mid] < mid){
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return -1;
    }
}
