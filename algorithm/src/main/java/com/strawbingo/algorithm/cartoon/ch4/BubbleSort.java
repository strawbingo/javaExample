package com.strawbingo.algorithm.cartoon.ch4;

public class BubbleSort {


    public int[] sort(int[] arr1) {
        int count = 0;
        for (int i=0; i< arr1.length-1;i++){

            for (int j=0; j<arr1.length-1-i; j++){
//                System.out.println(i + ":"+j);
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
                count++;
            }
        }

        System.out.println("round = "+count);
        return arr1;
    }

    /**
     * 一轮内无交换
     * @param arr
     */
    public void sortOptimizing1(int[] arr) {
        int count = 0;

        for (int i=0; i<arr.length-1; i++){

            boolean isSorted = true;
            for (int j=0; j<arr.length-i-1;j++){
//                System.out.println(i + ":"+j);
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSorted = false;
                }


                count++;
            }
            if (isSorted == true){
                break;
            }

        }
        System.out.println("round  = "+count);
    }

    /**
     * 数列有序区，有序区不再处理
     * @param arr
     */
    public void sortOptimizing2(int[] arr) {
        int count = 0;
        int sortBoder=arr.length-1;

        for(int i=0 ; i< arr.length -1; i++){
            boolean isSorted = true;
            for (int j=0; j<sortBoder; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sortBoder = j;
                    isSorted = false;
                }
                count++;
            }

            if(isSorted){
                break;
            }
        }
        System.out.println("round  = "+count);
    }


}
