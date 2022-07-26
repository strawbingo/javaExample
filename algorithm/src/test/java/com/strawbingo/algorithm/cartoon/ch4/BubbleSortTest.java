package com.strawbingo.algorithm.cartoon.ch4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    int[] arr1 = {1,2,3,4,3,6};

    BubbleSort bubbleSort;

    @Before
    public void setup(){
        bubbleSort = new BubbleSort();
    }


    @Test
    public void testSort(){

        bubbleSort.sort(arr1);

        Assert.assertEquals(3, arr1[3]);
        Assert.assertEquals(6, arr1[5]);

        System.out.println(Arrays.toString(arr1));

    }

    @Test
    public void testSortOptimizing1(){
        bubbleSort.sortOptimizing1(arr1);

        Assert.assertEquals(3, arr1[3]);
        Assert.assertEquals(6, arr1[5]);

        System.out.println(Arrays.toString(arr1));
    }


    @Test
    public void testSortOptimizing2(){
        bubbleSort.sortOptimizing2(arr1);

        Assert.assertEquals(3, arr1[3]);
        Assert.assertEquals(6, arr1[5]);

        System.out.println(Arrays.toString(arr1));
    }

}
