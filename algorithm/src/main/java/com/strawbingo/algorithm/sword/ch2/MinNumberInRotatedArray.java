package com.strawbingo.algorithm.sword.ch2;


import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * 题11：旋转数组的最小数字。
 * 把一个数字最开始的若干个元素搬到数组的末尾，我们称之为旋转数组。
 * 输入一个递增排序数组的一个旋转，输出旋转数组的最小元素。
 */
public class MinNumberInRotatedArray {

    public static String getMinNumber(String oldString) {
        String[] oldArr = oldString.split(",");
        //find the index
        int begin = 0;
        int end = oldArr.length-1;
        int index = (end-begin)/2+begin;
        while (end > begin){
            if(Integer.parseInt(oldArr[begin])<Integer.parseInt(oldArr[index])){
                begin = index;
            }
            else {
                end = index;
            }
            index = (end-begin)/2+begin;
        }
        System.out.println(index);
        //copy array
        String[] newArr = new String[oldArr.length];
        System.out.println(newArr.length);
        int newIndex =0;
        for(int i=index+1; i<oldArr.length;i++){
            newArr[newIndex] = oldArr[i];
            newIndex++;
        }
        for(int i = 0;i<=index;i++){
            newArr[newIndex] = oldArr[i];
            newIndex++;
        }

        return StringUtils.arrayToDelimitedString(newArr,",");
    }

    public static int getMinNumberWithDup(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int left = 0;
        int right = arr.length-1;
        int mideIndex = 0;
        while(left < right) {
            //get midIndex
            mideIndex = (left + right)/2;
            System.out.println(mideIndex);

            if(left +1 == right){
                mideIndex=right;
                break;
            }

            if(arr[left] == arr[mideIndex]){
                System.out.println(left+"=="+mideIndex+"==="+right);
                return getMinNumInOrder(left,arr);
            }
            else if(arr[left] < arr[mideIndex]){
                left = mideIndex;
            }
            else {
                right = mideIndex;
            }

        }

        return arr[mideIndex];

    }

    /**
     * 遍历 O(n)
     * @param left
     * @param arr
     * @return
     */
    private static int getMinNumInOrder(int left, int[] arr) {
        int res = 0;
        for(int i = left;i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                res =  arr[i+1];
                break;
            }
        }
        return res;
    }

    /**
     * leetCode
     */
    public int minArray(int[] nums) {
        if(nums.length ==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length-1;


        while (left < right){
//            System.out.println(left +":"+right);
            int mid = left +(right -left)/2;


            if(nums[mid]> nums[right]){
                left = mid+1;
            }else if(nums[right]> nums[mid]){
                right = mid;
            }else if(nums[mid] == nums[right]){
                    right = right -1;
            }
        }

        return nums[left];
        
    }
}
