package com.strawbingo.algorithm.sword.ch6;

/**
 * 题65：不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用"＋"、“➖”、“✖️”、“➗”四则运算符号
 */
public class AddWithoutArithmetic {

    public int add(int a, int b) {


        while (b != 0){
//            System.out.println(a+" = in = "+b);
            int n = a^b;
            b = (a&b) << 1;
            a = n;
//            System.out.println(a+":"+b);
        }
        return a;
    }

}
