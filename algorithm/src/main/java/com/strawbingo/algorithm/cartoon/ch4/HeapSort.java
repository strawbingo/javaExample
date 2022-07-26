package com.strawbingo.algorithm.cartoon.ch4;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    /**
     * 正排序
     * @param sortArray
     */
    public static void sortSec(int[] sortArray) {
        buildMaxHeap(sortArray,sortArray.length-1);
        System.out.println("Max Heap is"+Arrays.toString(sortArray));

        for(int i=0; i<sortArray.length; i++){
            int temp = sortArray[0];
            sortArray[0] = sortArray[sortArray.length-1-i];
            sortArray[sortArray.length-1-i] = temp;

//            buildMaxHeap(sortArray,sortArray.length-2-i);
            downAdjust(sortArray,0,sortArray.length-2-i);
        }
    }

    /**
     * 构建最大堆
     * @param sortArray
     */
    public static void buildMaxHeap(int[] sortArray,int sortLength){

        for(int i = (sortLength-2)/2 ; i>=0; i--){
            downAdjust(sortArray,i,sortLength);
        }

    }

    /**
     * 下沉
     * @param sortArray
     */
    public static void downAdjust( int[] sortArray,int index,int sortLength){
        int parentIndex = index;
        int childIndex = parentIndex*2+1;

        while(childIndex < sortLength ){
            if((childIndex+1)< sortLength && sortArray[childIndex] < sortArray[childIndex+1]){
                childIndex = childIndex+1;
            }

            //最大堆，小的下沉
            if(sortArray[parentIndex] < sortArray[childIndex]){
                int temp = sortArray[parentIndex];
                sortArray[parentIndex] = sortArray[childIndex];
                sortArray[childIndex] = temp;
            }
            parentIndex = childIndex;
            childIndex =  parentIndex*2+1;
        }

    }

}
