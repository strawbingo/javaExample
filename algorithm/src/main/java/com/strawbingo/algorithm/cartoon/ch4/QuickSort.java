package com.strawbingo.algorithm.cartoon.ch4;

import java.util.Stack;

public class QuickSort {

    /**
     * 单边循环法
     * @param sortArray
     */
    public static void sortSingleSide(int[] sortArray,int startIndex, int endIndex) {

        //split to two
        int index = (endIndex-startIndex)/2;
//
//        int temp = sortArray[index];
//        sortArray[index] =sortArray[startIndex];
//        sortArray[startIndex] = temp;
        System.out.println(startIndex+":"+endIndex);
        if (startIndex >= endIndex){
            return;
        }

        int mark = partitionSingleSide(sortArray, startIndex, endIndex);
        sortSingleSide(sortArray,startIndex,mark-1);
        sortSingleSide(sortArray,mark+1,endIndex);

    }

    /**
     * 单边循环法
     * @param sortArray
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static int partitionSingleSide(int[] sortArray,int startIndex, int endIndex){
        int mark = startIndex;

        int pivot = sortArray[startIndex];


        for(int i=startIndex+1; i<= endIndex; i++){

            if(sortArray[i] < pivot) {

                mark++;
                if(i != mark) {
                    int temp = sortArray[mark];
                    sortArray[mark] = sortArray[i];
                    sortArray[i] = temp;
                }

            }

        }


        sortArray[startIndex] = sortArray[mark];
        sortArray[mark] = pivot;

        return mark;
    }

    /**
     * 双边循环
     * @param sortArray
     * @param startIndex
     * @param endIndex
     */
    public static void sortedBothSide(int[] sortArray,int startIndex, int endIndex){

        System.out.println(startIndex+":"+endIndex);
        if(startIndex >= endIndex){
            return;
        }

        int pivotIndex = partitionBothSide(sortArray,startIndex,endIndex);
        sortedBothSide(sortArray,startIndex,pivotIndex-1);
        sortedBothSide(sortArray,pivotIndex+1,endIndex);

    }

    private static int partitionBothSide(int[] sortArray, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        int pivot = sortArray[startIndex];

        while (left != right){
            /*for(int i=right;i>left; i--){
                if(sortArray[right]<pivot){
                    break;
                }
                right--;
            }*/

            //使用while的写法
            while (left<right && sortArray[right] >pivot){
                right--;
            }

            for(int i=left; i< right; i++){
                if(sortArray[i] > pivot){
                    break;
                }
                left++;
            }

            if(left != right){
                int temp = sortArray[right];
                sortArray[right] = sortArray[left];
                sortArray[left] = temp;
            }

        }


        sortArray[startIndex] = sortArray[left];
        sortArray[left] = pivot;

        return left;
    }

    public static void sortedWithStack(int[] sortArray) {
        Stack<Integer> intSack = new Stack<>();

    }
}
