package com.strawbingo.algorithm.sword.ch2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 题3：找出数组中重复的数字
 */
public class FindDuplicateTest {

    int[] arr1 = {1,2,3,4,3,5};
    int[] arr2 = {0,2,3,4,5,0};
    int[] arr3 = {1,2,3,4,5,1};
    int[] arr4 = {1,2,3,2,4,5};
    int[] arr5 = {3,1,2,3};
    int[] arr6 = {2, 3, 1, 0, 2, 5, 3};
    FindDuplicate findDuplicate;


    @Before
    public void setup(){
        findDuplicate = new FindDuplicate();
    }

    /**
     * 题目1：在一个长度为n数组里所有的数字都在0~n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
     * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 例如，输入长度为7的数组{2,3,1,0,2,5,3}，对应输出的重复数字是2或者3
     * 重排数组（下标与数值比较）
     * @throws InterruptedException
     */
    @Test
    public void TestFindDuplicateReOrder() throws InterruptedException {
       int dup =  findDuplicate.findDuplicateReOrder(arr1);
        Assert.assertEquals(3,dup);

        TimeUnit.SECONDS.sleep(10);

        Assert.assertEquals(0, findDuplicate.findDuplicateReOrder(arr2));
        Assert.assertEquals(2, findDuplicate.findDuplicateReOrder(arr4));
    }

    /**
     * 题目二：不修改数组找出重复的数字
     *  在一个长度为n的数组里的所有数字都在1到n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，
     *  但不能修改输入的数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的输出是重复的数字2或者3。
     *
     */
    @Test
    public void TestFindDuplicateBinarySearch() {
        Assert.assertEquals(3,findDuplicate.findDuplicateBinarySearch(arr1));

        Assert.assertEquals(1, findDuplicate.findDuplicateBinarySearch(arr3));
        Assert.assertEquals(2, findDuplicate.findDuplicateBinarySearch(arr4));
        Assert.assertEquals(3, findDuplicate.findDuplicateBinarySearch(arr5));
//        Assert.assertEquals(0, findDuplicate.findDuplicateBinarySearch(arr6));
    }

    /**
     * 题目二：不修改数组找出重复的数字
     *  在一个长度为n的数组里的所有数字都在1到n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，
     *  但不能修改输入的数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的输出是重复的数字2或者3。
     *
     */
    @Test
    public void TestFindDuplicateLinkLoop(){
        Assert.assertEquals(3, findDuplicate.findDuplicateLinkLoop(arr1));

        Assert.assertEquals(1, findDuplicate.findDuplicateLinkLoop(arr3));
        Assert.assertEquals(3, findDuplicate.findDuplicateLinkLoop(arr5));
//        Assert.assertEquals(2, findDuplicate.findDuplicateLinkLoop(arr6));
    }

}
