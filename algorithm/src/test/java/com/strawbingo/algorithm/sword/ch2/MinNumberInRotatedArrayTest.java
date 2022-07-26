package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

public class MinNumberInRotatedArrayTest {

    /**
     * 题11：旋转数组的最小数字。
     * 把一个数字最开始的若干个元素搬到数组的末尾，我们称之为旋转数组。
     * 输入一个递增排序数组的一个旋转，输出旋转数组的最小元素。
     */
    @Test
    public void testGetMinNumber(){

        Assert.assertEquals("1,2,3", MinNumberInRotatedArray.getMinNumber("3,1,2"));
        Assert.assertEquals("1,2,3,4,5,6", MinNumberInRotatedArray.getMinNumber("4,5,6,1,2,3"));
    }

    @Test
    public void testGetMinNumberWithDup(){

        int[] arr = {3,1,2};
        Assert.assertEquals(1,MinNumberInRotatedArray.getMinNumberWithDup(arr));

        int[] arr2 = {1,1,0,1,1};
        Assert.assertEquals(0,MinNumberInRotatedArray.getMinNumberWithDup(arr2));

        int[] arr3 = {1,2,3,0,1,1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(0,MinNumberInRotatedArray.getMinNumberWithDup(arr3));
    }

}
