package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题40：最小的k个数
 * 输入n个整数，找出其中最小的k个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4
 */
public class LeastNumbersTest {


    @Test
    public void testGetLeastNumbers(){
        int[] arr = {3,4,2,1};
        LeastNumbers leastNumbers = new  LeastNumbers();
        int[] res = leastNumbers.getLeastNumbers(arr,2);

        Assert.assertEquals(2,res.length);
        Assert.assertEquals(2,res[1]);
    }

    /**
     * 解法一：时间复杂度为O(n)的算法，只有当我们可以修改输入数组时可用
     */
    @Test
    public void testGetLeastNumbersByPartition(){
        LeastNumbers leastNumbers = new  LeastNumbers();

        int[] arr = {4,5,6,7,1,2,3,9,8};
        int[] res = leastNumbers.getLeastNumbersByPartition(arr,4);

        Assert.assertEquals(4,res.length);
        Assert.assertEquals(2,res[1]);

        int[] arr2 = {0,0,2,3,2,1,1,2,0,4};
        int[] res2 = leastNumbers.getLeastNumbersByPartition(arr2,10);
        Assert.assertEquals(10,res2.length);

    }

    /**
     * 解法二：时间复杂度为O(nlogk)的算法，特别适合处理海量数据
     */
    @Test
    public void testGetLeastNumbersLargeNum(){
        int[] arr = {3,4,2,1};
        LeastNumbers leastNumbers = new  LeastNumbers();
        int[] res = leastNumbers.getLeastNumbersLargeNum(arr,2);

        Assert.assertEquals(2,res.length);
        Assert.assertEquals(1,res[1]);
    }

}
