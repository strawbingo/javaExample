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
        int[] ans = new int[k];
        if(k<=0) return ans;

        PriorityQueue<Integer> que = new PriorityQueue(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i <k; i++) {
            que.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(arr[i]<que.peek()){
                que.poll();
                que.add(arr[k]);
            }
        }

        ans = que.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }


    /**
     * 解法一：时间复杂度为O(n)的算法，只有当我们可以修改输入数组时可用
     */
    public int[] getLeastNumbersByPartition(int[] arr, int target) {

        int[] ans = new int[target];
        if(ans.length <= 0) return ans;
        sort(arr,0,arr.length-1);
        for(int i=0; i<target ;i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    void sort(int[] arr,int begin, int end){
        //if begin >= end ,return
//        System.out.println(begin+":be:"+end+":len:"+arr.length);
        if(begin >= end || end>=arr.length){
            return;
        }
//        System.out.println(begin+":be:conti:"+end);
        //partion to 2 part

        int mid = partion(arr,begin,end);

        //dfs
        sort(arr,begin,mid-1);
        sort(arr,mid+1, end);
    }

    int partion(int[] arr,int begin, int end){
//        System.out.println(begin+":"+end);
        int midNum = arr[begin];
        int i = begin, j = end;
        while(i<j){
            while(i<j && midNum < arr[j]){
                j--;
            }
            while(i<j && midNum >= arr[i]){
                i++;
            }
//            System.out.println(i+":"+j);
            if(i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
//        System.out.println(Arrays.toString(arr)+"=mid="+j);
        arr[begin] = arr[j];
        arr[j] = midNum;
//        System.out.println(Arrays.toString(arr)+"=mid="+j);
        return i;
    }
}
