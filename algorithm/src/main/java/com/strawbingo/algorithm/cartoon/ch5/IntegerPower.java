package com.strawbingo.algorithm.cartoon.ch5;

/**
 * 数字是否2的整数次幂
 */
public class IntegerPower {

    public static boolean isPowerOf(int num) {
        return  (num & num-1)==0;
    }

}
