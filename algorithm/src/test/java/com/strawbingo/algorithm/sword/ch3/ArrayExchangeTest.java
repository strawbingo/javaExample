package com.strawbingo.algorithm.sword.ch3;

import org.junit.Assert;
import org.junit.Test;

public class ArrayExchangeTest {

    /**
     * 题21：调整数组顺序使计数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，
     * 所有偶数位于数组的后半部分
     */
    @Test
    public void testExchange(){
        ArrayExchange arrayExchange = new ArrayExchange();

        int[] arr = {1,2,3,4};
        int[] res=  {1,3,2,4};
        Assert.assertArrayEquals(res,arrayExchange.exchange(arr));

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] res2 =  {1,9,3,7,5,6,4,8,2};
        Assert.assertArrayEquals(res2,arrayExchange.exchange(arr2));

        int[] arr3 = {1,3,5};
        int[] res3 =  {1,3,5};
        Assert.assertArrayEquals(res3,arrayExchange.exchange(arr3));

    }

}
