package com.strawbingo.algorithm.cartoon.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 *        4
 *     2     3
 *   8  5   6 7
 *  1
 */
public class HeapSortTest {

    int[] sortArray = {4,2,3,8,5,6,7,1};

    @Test
    public void testSort(){
        HeapSort.sortSec(sortArray);

        System.out.println("final:"+Arrays.toString(sortArray));
        Assert.assertEquals(1, sortArray[0]);
        Assert.assertEquals(6, sortArray[5]);

        int[] sortArray2 = {1,3,2,6,5,7,8,9,10,0};
        HeapSort.sortSec(sortArray2);
        System.out.println("final 2:"+Arrays.toString(sortArray2));
    }
}
