package com.strawbingo.algorithm.sword.ch6;

import java.util.Arrays;

/**
 * 题56：数组中数字出现的次数
 */
public class ArraySingleNumber {

    /**
     * 题目一：数组中只出现一次的两个数字
     * 一个整型数组里除两个数字之外，其他数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)
     */
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for (int num: nums) {
            xor ^= num;
        }

        int group = 1;
        while ((xor & group) == 0) {
            group <<= 1;
        }

        int num1=0,num2=0;
        System.out.println("group:"+group);
        for(int num: nums){
            if((num & group) ==0){
                num1 ^= num;
            }
            else {
                num2 ^= num;
            }
            System.out.println(num1+":"+num2);
        }

        int[] res = new int[2];
        res[0] = num1;
        res[1] = num2;
        System.out.println(Arrays.toString(res));
        return res;
    }

    /**
     * 题目二：数组中唯一只出现一次的数字
     * 在一个数组中除一个数字只出现一次之外，其他数字都出现了三次。请找出只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int[] count = new int[32];
        for (int num: nums) {
            for (int i = 0; i < 32; i++) {
                count[i] += num&1;
                num >>>= 1;
            }
//            System.out.println("loop:"+Arrays.toString(count));
        }

//        System.out.println(Arrays.toString(count));
        int res = 0;
        for (int i = 0; i < 32 ; i++) {
            res<<=1;
            res |= count[31-i]%3;

//            System.out.println("loop:"+res);
        }

        return res;
    }


}
