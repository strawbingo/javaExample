package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题66：构建乘积数组
 * 给定一个数组A[0,1,...,n-1]，请构建一个数组B[0,1,...,n-1]，
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能用除法
 * 除了下标 i 以外的元素的积
 */
public class MultiplyArrayTest {

    @Test
    public void testConstructArray(){
        MultiplyArray multiplyArray = new MultiplyArray();
        int[] nums = {1,2,3,4,5};
        int[] expectNums = {120,60,40,30,24};
        Assert.assertArrayEquals(expectNums, multiplyArray.constructArr(nums));

        int[] expectNums2 = {};
        Assert.assertArrayEquals(expectNums2,multiplyArray.constructArr(null));
    }
}
