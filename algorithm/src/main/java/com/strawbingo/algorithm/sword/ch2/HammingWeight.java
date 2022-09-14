package com.strawbingo.algorithm.sword.ch2;

/**
 * 题15：二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数（也被称为 汉明重量).）
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
//            System.out.println(n);
            if((n&flag) !=0){
                count++;
            }
            flag <<=1;
        }

        return count;
    }

}
