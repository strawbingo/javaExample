package com.strawbingo.algorithm.sword.ch3;

public class ArrayExchange {

    /**
     * 题21：调整数组顺序使计数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，
     * 所有偶数位于数组的后半部分
     */
    public int[] exchange(int[] arr) {

        int begin = 0;
        int end = arr.length-1;

        while (begin < end){
//            System.out.println(begin+"=="+end);
//            System.out.println(arr[begin]%2+"====");
            if(arr[begin]%2 == 1){
                begin++;
//                System.out.println(begin+"==after++");
                continue;
            }

            if(arr[end]%2 == 0){
               end--;
//               System.out.println(end+"==after--");
               continue;
            }
//            System.out.println(begin+"***"+end);
            int tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }


        return arr;

    }

}
