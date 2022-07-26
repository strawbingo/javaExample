package com.strawbingo.algorithm.cartoon.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CockTailSortTest {

    int[] arr = {8,2,3,4,5,6,7,1};

    @Test
    public void testSort(){

        CockTailSort.sort(arr);

        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(6, arr[5]);

    }

    @Test
    public void testCockTailSort1(){

//        CockTailSort.cockTailSort1(arr);

        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(6, arr[5]);

    }
}
