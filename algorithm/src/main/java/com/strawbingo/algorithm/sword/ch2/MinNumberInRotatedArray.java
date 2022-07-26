package com.strawbingo.algorithm.sword.ch2;


import org.springframework.util.StringUtils;

import java.util.Arrays;

public class MinNumberInRotatedArray {

    public static String getMinNumber(String oldString) {
        String[] oldArr = oldString.split(",");
        //find the index
        int begin = 0;
        int end = oldArr.length-1;
        int index = (end-begin)/2+begin;
        while (end > begin){
            if(Integer.parseInt(oldArr[begin])<Integer.parseInt(oldArr[index])){
                begin = index;
            }
            else {
                end = index;
            }
            index = (end-begin)/2+begin;
        }
        System.out.println(index);
        //copy array
        String[] newArr = new String[oldArr.length];
        System.out.println(newArr.length);
        int newIndex =0;
        for(int i=index+1; i<oldArr.length;i++){
            newArr[newIndex] = oldArr[i];
            newIndex++;
        }
        for(int i = 0;i<=index;i++){
            newArr[newIndex] = oldArr[i];
            newIndex++;
        }

        return StringUtils.arrayToDelimitedString(newArr,",");
    }

    public static int getMinNumberWithDup(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int left = 0;
        int right = arr.length-1;
        int mideIndex = 0;
        while(left < right) {
            //get midIndex
            mideIndex = (left + right)/2;
            System.out.println(mideIndex);

            if(left +1 == right){
                mideIndex=right;
                break;
            }

            if(arr[left] == arr[mideIndex]){
                System.out.println(left+"=="+mideIndex+"==="+right);
                return getMinNumInOrder(left,arr);
            }
            else if(arr[left] < arr[mideIndex]){
                left = mideIndex;
            }
            else {
                right = mideIndex;
            }

        }

        return arr[mideIndex];

    }

    private static int getMinNumInOrder(int left, int[] arr) {
        int res = 0;
        for(int i = left;i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                res =  arr[i+1];
                break;
            }
        }
        return res;
    }
}
