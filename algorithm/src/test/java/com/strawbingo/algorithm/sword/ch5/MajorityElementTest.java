package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题39：数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。2出现5次，输出2
 */
public class MajorityElementTest {

    /**
     * 基于Partition函数的时间复杂度为O(n)的算法
     */
    @Test
    public void testMajorityElementByPartition(){

        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {1,2,3,2,2,4,5,2};
        int num = majorityElement.MajorityElementByPartition(nums);
        Assert.assertEquals(2,num);

        int[] nums2 = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        num = majorityElement.MajorityElementByPartition(nums2);
        Assert.assertEquals(2,num);


        int[] nums3 = {3,3,4};
        num = majorityElement.MajorityElementByPartition(nums3);
        Assert.assertEquals(3,num);

    }

    /**
     * 解法二：根据数组特点找出时间复杂度为O(n)的算法
     */
    @Test
    public void testMajorityElement(){
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {1,2,3,2,2,4,5,2,2};
        int num = majorityElement.MajorityElement(nums);
        Assert.assertEquals(2,num);

        int[] nums2 = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        num = majorityElement.MajorityElement(nums2);
        Assert.assertEquals(2,num);


        int[] nums3 = {3,3,4};
        num = majorityElement.MajorityElement(nums3);
        Assert.assertEquals(3,num);

    }

}
