package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题40：最小的k个数
 * 输入n个整数，找出其中最小的k个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4
 */
public class LeastNumbers {


    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];

        for(int i=0; i<k; i++){
            res[i] = arr[i];
        }

        return res;
    }




    /**
     * 解法二：时间复杂度为O(nlogk)的算法，特别适合处理海量数据
     */
    public int[] getLeastNumbersLargeNum(int[] arr, int k) {
        if(k<=0) return new int[0];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        for(int i=0; i< arr.length; i++){
            if(priorityQueue.size() < k){
                priorityQueue.add(arr[i]);
            }
            else {
                if(arr[i]<priorityQueue.peek()){
                    priorityQueue.poll();
                    priorityQueue.add(arr[i]);
                }
            }
        }

        int[] res = priorityQueue.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }


    /**
     * 解法一：时间复杂度为O(n)的算法，只有当我们可以修改输入数组时可用
     */
    public int[] getLeastNumbersByPartition(int[] arr, int target) {

        int index =  getK(arr,target,0,arr.length-1);

        int[] res = new int[target];

        for(int i=0; i<target; i++){
            res[i] = arr[i];
        }

        return res;
    }

    private int getK(int[] arr, int target, int start, int end) {
        if(start == end) return start;

       int index = partition(arr,start,end);
       if(index == target){
           return index;
       }
       else if(index > target) {
           return getK(arr,target,start,index-1);
       }
       else {
           return getK(arr, target, index+1, end);
       }
    }

    private int partition(int[] arr, int start, int end) {
        int temp = arr[start];

        while (start<end){
            while (start<end && temp <= arr[end]) end--;
            arr[start] = arr[end];
            while (start<end && arr[start] <= temp) start++;
            arr[end] = arr[start];
        }

        arr[start] = temp;
        return start;
    }
}
