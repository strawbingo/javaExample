package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题45：把数组排成最小的数
 * 输入一个正整数数组，把数组里有所有数字拼接起来排成一个数，打印能拼接出的素有数字中最小的一个。
 * 例如，输入数组{3,32,321}则打印出这三个数字能排成的最小数字321323
 */
public class MinNumberTest {

    @Test
    public void testMinNumber(){
        MinNumber minNumber = new MinNumber();
        int[] nums ={10,2};
        Assert.assertEquals("102",minNumber.minNumber(nums));

        int[] nums2 ={3,30,34,5,9};
        Assert.assertEquals("3033459",minNumber.minNumber(nums2));

        int[] nums3 ={128,12};
        Assert.assertEquals("12128",minNumber.minNumber(nums3));

        int[] nums4 ={121,12};
        Assert.assertEquals("12112",minNumber.minNumber(nums4));

    }
}
