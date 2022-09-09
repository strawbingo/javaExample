package com.strawbingo.algorithm.sword.ch2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 题3：数组中重复数字（长度n，数字在0~n-1之间）
 * 在一个长度为n+1的数组里的所有数字都在1到n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，
 *  但不能修改输入的数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的输出是重复的数字2或者3。
 */
public class FindDuplicateTest {

    int[] arr1 = {1,2,3,4,3,5};
    int[] arr2 = {0,2,3,4,5,0};
    int[] arr3 = {1,2,3,4,5,1};
    FindDuplicate findDuplicate;


    @Before
    public void setup(){
        findDuplicate = new FindDuplicate();
    }

    /**
     * 排序数组
     * @throws InterruptedException
     */
    @Test
    public void TestFindDuplicateReOrder() throws InterruptedException {
       int dup =  findDuplicate.findDuplicateReOrder(arr1);
        Assert.assertEquals(3,dup);

        TimeUnit.SECONDS.sleep(10);

        Assert.assertEquals(0, findDuplicate.findDuplicateReOrder(arr2));
    }

    /**
     * 扩展：不修改数组找出重复的数字
     */
    @Test
    public void TestFindDuplicateBinarySearch() {
        int dup =  findDuplicate.findDuplicateBinarySearch(arr1);
        Assert.assertEquals(3,dup);

        Assert.assertEquals(1, findDuplicate.findDuplicateBinarySearch(arr3));
    }


    @Test
    public void TestFindDuplicateLinkLoop(){
        Assert.assertEquals(3, findDuplicate.findDuplicateLinkLoop(arr1));

        Assert.assertEquals(1, findDuplicate.findDuplicateLinkLoop(arr3));
    }

}
