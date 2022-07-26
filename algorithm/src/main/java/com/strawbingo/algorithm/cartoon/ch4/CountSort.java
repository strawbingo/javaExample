package com.strawbingo.algorithm.cartoon.ch4;

/**
 * 计数排序
 */
public class CountSort {

    public static int[] sort(int[] sortArray) {
        //get max value
        int max =0;
        for (int temp: sortArray){
            if(temp > max){
                max = temp;
            }
        }

        System.out.println(max);
        int[] countArr = new int[max+1];

        for(int temp: sortArray){
            countArr[temp]++;
        }

        int[] sortedArr = new int[countArr.length-1];
        int z=0;
        for(int i=0 ;i<countArr.length; i++){
            for(int j=0; j<countArr[i] ; j++){
                System.out.println(i);
                sortedArr[z++] = i;
            }
        }



        return sortedArr;
    }

}
