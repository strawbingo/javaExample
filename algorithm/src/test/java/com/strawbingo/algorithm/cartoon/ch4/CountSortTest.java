package com.strawbingo.algorithm.cartoon.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountSortTest {

    int[] sortArray = {4,2,3,8,5,6,7,1};

    @Test
    public void sortTest(){
        int[] sortedArray = CountSort.sort(sortArray);

        System.out.println("final:"+ Arrays.toString(sortedArray));
        Assert.assertEquals(1, sortedArray[0]);
        Assert.assertEquals(6, sortedArray[5]);
    }
}
