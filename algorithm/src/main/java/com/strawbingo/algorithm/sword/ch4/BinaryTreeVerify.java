package com.strawbingo.algorithm.sword.ch4;

/**
 * 题33：二叉搜索树的后序遍历
 * 输入一个整型数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回true，否则返回false。
 * 假设输入的数组的任意两个数字是互不相同。例如，{5，7，6，9，11，10，8}，则返回true。
 * {7，6，4，5}，返回false
 */
public class BinaryTreeVerify {

    public boolean verifyPostorder(int[] arr) {
        if(arr == null || arr.length ==0) return true;
        return verifyPostorderRecur(arr,0,arr.length-1);
    }

    boolean verifyPostorderRecur(int[] arr, int begin,int end){
//        System.out.println(begin+":"+end);
        if(begin >= end) return true;

        int root = arr[end];
        int mid = begin;
        //get mid
        for (int i = mid; i <end; i++) {

            if(arr[i] > root){
                break;
            }
            mid++;
        }

        //check
        for (int i = mid; i < end; i++) {
            if(arr[i]<root){
                return false;
            }
        }

//        System.out.println(begin+":end:"+end);
        //recur
        return verifyPostorderRecur(arr, begin,mid-1) && verifyPostorderRecur(arr,mid,end-1);


    }

}
