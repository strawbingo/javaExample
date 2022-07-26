package com.strawbingo.algorithm.cartoon.ch3;

import org.junit.Test;

import java.util.Arrays;

public class BinaryHeapTest {


    /**
     *         1
     *     3       2
     *  6    5   7   8
     *9  10 0
     */
    @Test
    public void testUpAdjust(){
        int[] array = new int[]{1,3,2,6,5,7,8,9,10,0};

        BinaryHeap.upAdjust(array);

        System.out.println(Arrays.toString(array));
        //[0, 1, 2, 6, 3, 7, 8, 9, 10, 5]
    }

    /**
     *         1
     *     3       2
     *  9    5   7   8
     *6  10 0
     */
    @Test
    public void testUpAdjustAll(){
        int[] array = new int[]{1,3,2,9,5,7,8,6,10,0};

        BinaryHeap.upAdjust(array);

        System.out.println(Arrays.toString(array));
        //[0, 1, 2, 6, 3, 7, 8, 9, 10, 5]

        array = new int[]{1,3,2,9,5,7,8,6,10,0};
        BinaryHeap.upAdjustAll(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     *           7
     *        1           3
     *    10     5    2    8
     *  9   6
     *
     *  result [1, 5, 2, 6, 7, 3, 8, 9, 10]
     */
    @Test
    public void testBuildHeap(){
        int[] array = new int[]{7,1,3,10,5,2,8,9,6};
        BinaryHeap.buildHeap(array);
        System.out.println(Arrays.toString(array));
        //[1, 5, 2, 6, 7, 3, 8, 9, 10]


        /**
         *            10
         *       9          8
         *    7      6     5   4
         *  3  2   1
         *
         *  result [1, 2, 4, 3, 6, 5, 8, 10, 7, 9]
         */
        array = new int[]{10,9,8,7,6,5,4,3,2,1};
        BinaryHeap.buildHeap(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{7,1,3,10,5,2,8,9,6};
        BinaryHeap.buildHeap2(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{10,9,8,7,6,5,4,3,2,1};
        BinaryHeap.buildHeap2(array);
        System.out.println(Arrays.toString(array));
    }


}
