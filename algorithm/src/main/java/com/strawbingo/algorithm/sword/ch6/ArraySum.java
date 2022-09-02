package com.strawbingo.algorithm.sword.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题57：和为s的数字
 */
public class ArraySum {

    /**
     * 题目一：和为s的两个数字
     * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
     * 如果有多对数字的和等于s，则输出任意一对即可
     */
    public int[] twoSum(int[] nums,int target) {
        int i=0;
        int j=nums.length - 1;
        int[] res = new int[2];
        while (i < j){
            int s = nums[i] + nums[j];
            if(s == target){
                res[0] = nums[i];
                res[1] = nums[j];
                return res;
            }
            else if(s < target){
                i++;
            }
            else {
                j--;
            }
        }


        return res;
    }

    /**
     * 题目二：和为s的连续正数序列
     * 输入一个正数s，打印出所有和为s的连续正数序列（至少含有两个数）。
     * 例如，输入15，由于1+2+3+4+5=4+5+6=7+8=15,所以打印出3个连续序列
     */
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int sum = 0;
        int count=0;
        List<int[]> list = new ArrayList<>();
        for(int i=1; i<target;i++){
            sum += i;
            if(sum == target){
                int[] nums = new int[i-left+1];
                for (int j = 0; j <i-left+1 ; j++) {
                    nums[j] = left+j;
                }
                list.add(nums);
//                System.out.println(left+":"+i);
//                System.out.println(Arrays.toString(nums));
            }else if(sum > target){
                while (sum > target){
                    sum = sum - left;
                    left++;
                }
                if(sum == target){
                    int[] nums = new int[i-left+1];
                    for (int j = 0; j <i-left+1 ; j++) {
                        nums[j] = left+j;
                    }
                    list.add(nums);
//                    System.out.println(left+":"+i);
//                    System.out.println(Arrays.toString(nums));
                }
            }

        }


//        int[][] res = new int[list.size()][];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = list.get(i);
//        }

        return list.toArray(new int[list.size()][]);
    }

    /**
     * 题目二：和为s的连续正数序列
     * 输入一个正数s，打印出所有和为s的连续正数序列（至少含有两个数）。
     * 例如，输入15，由于1+2+3+4+5=4+5+6=7+8=15,所以打印出3个连续序列
     */
    public int[][] findContinuousSequence2(int target) {
        int left = 1;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        for(int i=2; i<target && left<i;){
//            System.out.println(left+":"+i);
            sum = (left+i)* (i-left+1)/2;

            if(sum == target){
                int[] nums = new int[i-left+1];
                for (int j = 0; j <i-left+1 ; j++) {
                    nums[j] = left+j;
                }
                list.add(nums);
//                System.out.println(left+":"+i);
//                System.out.println(Arrays.toString(nums));
                i++;
            }else if(sum > target){
                left++;
            }
            else {
                i++;
            }

        }


//        int[][] res = new int[list.size()][];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = list.get(i);
//        }

        return list.toArray(new int[list.size()][]);
    }
}
