package com.strawbingo.algorithm.sword.ch3;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题17：打印从1到最大的n位数
 * 输入数字n，按顺序打印出从1到最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数999
 */
public class PrintNumberTest {

    @Test
    public void testPrintNumber(){
        PrintNumber printNumber = new PrintNumber();

//        printNumber.printNumber(4);

        int[] nums;
        nums = printNumber.printNumber(1);
        Assert.assertEquals(1,nums[0]);

        nums = printNumber.printNumber(3);
        Assert.assertEquals(999,nums.length);
        Assert.assertEquals(1,nums[0]);
        Assert.assertEquals(999,nums[nums.length-1]);


        nums = printNumber.printNumber(5);
        Assert.assertEquals(99999,nums.length);
        Assert.assertEquals(99999,nums[nums.length-1]);
    }
}
