package com.strawbingo.algorithm.sword.ch3;

/**
 * 题16：数值的整数次方
 * 实现函数double Power（double base，int exponent），求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题
 *
 * 1. 考虑底数和指数为0或负数
 * 2. 任何除0以外的实数的0次方都是1
 * 3. 0的n次方，当n大于0时，等于0。当n等于0时，0的0次方没有意义。当n小于0时，也没有意义。
 *    当n为正数时为0，n为负数时无意义。
 *    0的正数次方等于0；0的非正数次方（0次方和负数次方）无意义，因为0不能做分母
 */

public class Power {

    public static Double power(double base, int exponent) {

        if(base == 0){
            if(exponent <= 0){
                return null;
            }else {
                return 0d;
            }
        }

        if(exponent==0){
            return 1d;
        }else if(exponent < 0){
            base = 1/base;
            exponent = -exponent;
        }

        Double result = 1.0;
        while(exponent>0){
            result *=  base;
            exponent--;
        }

        return result;
    }

    public static Double powerEnhance(double base, int exponent) {

        if(base == 0){
            if(exponent <= 0){
                return null;
            }else {
                return 0d;
            }
        }
        System.out.println(base+":"+exponent);
        if(exponent==0){
            return 1d;
        }else if(exponent < 0){
            base = 1/base;
            exponent = -exponent;
        }

        System.out.println(base+":"+exponent);
        Double result = powerPositive(base, exponent);
//        if(exponent < 0) {
//            result = 1 / result;
//        }
        return result;
    }

    private static Double powerPositive(double base, int exponent) {
        Double result = 1.0;


        if(exponent==0){
            return result;
        }

        result =powerPositive(base,exponent/2);
        result = result * result;
        System.out.println(result+":"+exponent);
        if(exponent%2 !=0){
             result *= base;
            System.out.println(result+":::"+exponent);
        }

        return result;
    }

}
