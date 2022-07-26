package com.strawbingo.algorithm.net;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TwoSumTest {

    @Test
    public void testTowSumA(){
        int[] arr = {5,12,6,3,9,2,1,7};
        ArrayList res = TwoSum.twoSumA(arr, 13);

        Assert.assertEquals(2, res.size());
        Assert.assertEquals("12,1",res.get(0));
        Assert.assertEquals("6,7",res.get(1));


        res = TwoSum.twoSumA(arr, 1);

        Assert.assertEquals(0, res.size());

    }

    @Test
    public void testTowSumAIndex(){
        int[] arr = {5,12,6,3,9,2,1,7};
        ArrayList res = TwoSum.twoSumAIndex(arr, 13);

        Assert.assertEquals(2, res.size());
        Assert.assertEquals("1,6",res.get(0));
        Assert.assertEquals("2,7",res.get(1));


        res = TwoSum.twoSumA(arr, 1);

        Assert.assertEquals(0, res.size());

    }

    @Test
    public void testTowSumB(){
        int[] arr = {5,12,6,3,9,2,1,7};
        ArrayList res = TwoSum.twoSumB(arr, 13);

        Assert.assertEquals(2, res.size());
        Assert.assertEquals("12,1",res.get(0));
        Assert.assertEquals("6,7",res.get(1));


        res = TwoSum.twoSumB(arr, 1);

        Assert.assertEquals(0, res.size());

    }

    @Test
    public void testTowSumBIndex(){
        int[] arr = {5,12,6,3,9,2,1,7};
        ArrayList res = TwoSum.twoSumBIndex(arr, 13);

        Assert.assertEquals(2, res.size());
        Assert.assertEquals("1,6",res.get(0));
        Assert.assertEquals("2,7",res.get(1));


        res = TwoSum.twoSumB(arr, 1);

        Assert.assertEquals(0, res.size());

    }
}
