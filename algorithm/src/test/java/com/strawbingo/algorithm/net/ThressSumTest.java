package com.strawbingo.algorithm.net;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ThressSumTest {

    @Test
    public void testTowSumA(){
        int[] arr = {5,12,6,3,9,2,1,7};
        List res = ThreeSum.ThreeSumA(arr, 13);

        Assert.assertEquals(3, res.size());
        Assert.assertEquals("2,6,5",res.get(0));
        Assert.assertEquals("1,9,3",res.get(1));
        Assert.assertEquals("7,1,5",res.get(2));


        res = ThreeSum.ThreeSumA(arr, 1);

        Assert.assertEquals(0, res.size());

    }



    @Test
    public void testTowSumB(){
        int[] arr = {5,12,6,3,9,2,1,7};
        List res = ThreeSum.ThreeSumB(arr, 13);

        Assert.assertEquals(3, res.size());
        Assert.assertEquals("1,3,9",res.get(0));
        Assert.assertEquals("1,5,7",res.get(1));
        Assert.assertEquals("2,5,6",res.get(2));


        res = ThreeSum.ThreeSumB(arr, 1);

        Assert.assertEquals(0, res.size());

    }


}
