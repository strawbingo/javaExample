package com.strawbingo.algorithm.cartoon.ch4;

import java.util.Arrays;

public class CockTailSort {


    public static void sort(int[] arr) {
        int count=0;
        for(int i = 0; i< arr.length/2; i++){


            boolean isSorted = true;
            for (int j=i; j<arr.length-i-1; j++){
                count++;
                if (arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
                System.out.println(Arrays.toString(arr));
            }
            if (isSorted){
                break;
            }

            isSorted = true;
            for (int z= arr.length-i-2; z>i; z--){
                count++;
                if(arr[z]< arr[z-1]){
                    int temp = arr[z];
                    arr[z] = arr[z-1];
                    arr[z-1] = temp;
                    isSorted = false;
                }
                System.out.println(Arrays.toString(arr));
            }
            if (isSorted){
                break;
            }

            System.out.println("第" + (i + 1) + "次比较后" + "--->" + Arrays.toString(arr) + ",isSorted--->" + isSorted);


        }
        System.out.println("count = "+count);
    }

}
