package com.strawbingo.algorithm.cartoon.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    int[] sortArray = {8,2,3,4,5,6,7,1};

    @Test
    public void testSort(){
        QuickSort.sortSingleSide(sortArray,0,sortArray.length-1);

        System.out.println(Arrays.toString(sortArray));
        Assert.assertEquals(1, sortArray[0]);
        Assert.assertEquals(6, sortArray[5]);
    }


    @Test
    public void testSortedBothSide(){
        QuickSort.sortedBothSide(sortArray,0,sortArray.length-1);

        System.out.println(Arrays.toString(sortArray));
        Assert.assertEquals(1, sortArray[0]);
        Assert.assertEquals(6, sortArray[5]);
    }

    @Test
    public void testSortedWithStack(){
        QuickSort.sortedWithStack(sortArray);

        System.out.println(Arrays.toString(sortArray));
        Assert.assertEquals(1, sortArray[0]);
        Assert.assertEquals(6, sortArray[5]);
    }


}
