package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

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
