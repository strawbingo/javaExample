package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题38-2
 * 输入如一个含有8个数字的数组，判断有没有可能把这8个数字分别放到正方体的8个顶点上，使得正方体上三组相对面上的四个顶点的和都相等
 */
public class KubeSumTest {

    @Test
    public void testSameSum(){
        KubeSum kubeSum = new KubeSum();
        int[] nums = {1,2,3,4,5,6,7,8};
        String[] orderNums = kubeSum.sameSum(nums);

        Assert.assertEquals(2,orderNums.length);
    }
}
