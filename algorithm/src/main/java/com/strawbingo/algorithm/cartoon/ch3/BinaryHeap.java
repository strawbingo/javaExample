package com.strawbingo.algorithm.cartoon.ch3;

public class BinaryHeap {

    //上浮
    public static void upAdjustAll(int[] arr){

       for(int i = (arr.length-1)/2 ; i>=0 ; i--){
           int left = arr[i*2+1];
           int right = 0;
           if(i*2+2 >= arr.length) {
               right = Integer.MAX_VALUE;
           }
           else {
               right = arr[i * 2 + 2];
           }

           if(left < right){
               if(left<arr[i]){
                   arr[i*2+1] = arr[i];
                   arr[i] = left;
               }
           }else {
               if(right< arr[i]){
                   arr[i*2+2] = arr[i];
                   arr[i] = right;
               }
           }
       }

    }


    //上浮
    public static void upAdjust(int[] arr){
        int childIndex = arr.length -1;
        int parentIndex = (childIndex -1)/2;

        int temp = arr[childIndex];
        while (childIndex > 0 && temp < arr[parentIndex]){
            arr[childIndex] = arr[parentIndex];

            childIndex = parentIndex;
            parentIndex = (childIndex -1)/2;
        }
        arr[parentIndex] = temp;

    }


    //下沉
    public static void downAdjust(int[] arr,int parentIndex,int lenth){
        int childIndex = parentIndex*2+1;

        int temp = arr[parentIndex];

        if(childIndex>lenth-1){
            return;
        }

        if(childIndex+1 < lenth){
            if (arr[childIndex] > arr[childIndex+1]){
                childIndex = childIndex+1;
            }
        }

        if(temp > arr[childIndex]){
            arr[parentIndex] = arr[childIndex];
            arr[childIndex] = temp;
        }


    }

    //构建
    //错误
    public static void buildHeap(int[] arr){
        //从根节点开始做下沉
        for(int i=0; i<(arr.length-1)/2 ; i++){
            downAdjust(arr,i,arr.length);
        }

    }


    //下沉
    public static void downAdjust2(int[] arr,int parentIndex,int length) {
        int temp = arr[parentIndex];
        int childIndex = parentIndex*2 + 1;


        //
        while(length > childIndex){
            //if left child greater than right child
            if ( length > childIndex+1 && arr[childIndex] > arr[childIndex+1]){
                childIndex = childIndex + 1;
            }

            //if parent greater than child
            if(temp <= arr[childIndex] ){
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex =  parentIndex*2 + 1;

        }

        arr[parentIndex] = temp;


    }

    //构建
    public static void buildHeap2(int[] arr){

        for(int i = (arr.length-2)/2 ; i>= 0; i--){
            downAdjust2(arr,i,arr.length);
        }

    }

}
