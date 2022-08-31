package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 题56：数组中数字出现的次数
 */
public class ArraySingleNumberTest {

    /**
     * 题目一：数组中只出现一次的两个数字
     * 一个整型数组里除两个数字之外，其他数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)
     */
    @Test
    public void testSingleNumber(){
        ArraySingleNumber arraySingleNumber = new  ArraySingleNumber();
        int[] nums = {4,1,4,6};
        int[] res = {1,6};
        int[] ints = arraySingleNumber.singleNumber(nums);
        Arrays.sort(ints);
        Assert.assertArrayEquals(res, ints);


        int[] nums2 = {1,2,5,2};
        int[] res2 = {1,5};
        int[] ints2 = arraySingleNumber.singleNumber(nums2);
        Arrays.sort(ints2);
        Assert.assertArrayEquals(res2, ints2);

    }

    /**
     * 题目二：数组中唯一只出现一次的数字
     * 在一个数组中除一个数字只出现一次之外，其他数字都出现了三次。请找出只出现一次的数字
     */
    @Test
    public void testSingeNumber2(){
        ArraySingleNumber arraySingleNumber = new  ArraySingleNumber();
        int[] nums = {3,4,3,3};
        Assert.assertEquals(4, arraySingleNumber.singleNumber2(nums));


        int[] nums2 = {9,1,7,9,7,9,7};
        Assert.assertEquals(1, arraySingleNumber.singleNumber2(nums2));

    }


}
