package com.strawbingo.algorithm.cartoon.ch5;

/**
 * 求整数的最大公约数
 */
public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int num1, int num2) {
        int result = 0;
        int min = num1;
        int max = num2;

        while (true) {
            if (min > max) {
                int temp = min;
                min = max;
                max = temp;
            }

            int remainder = max % min;
            if(remainder ==0){
                result = min;
                break;
            }
            max = min;
            min = remainder;

        }

        return result;
    }


    //辗转相除法
    public static int greatestCommonDivisor2(int num1, int num2) {
        int a = num1>num2 ? num1: num2;
        int b = num1<num2 ? num1: num2;

        if( a%b == 0){
            return b;
        }
        return greatestCommonDivisor2(a%b,b);

    }

    public static int greatestCommonDivisor3(int num1, int num2) {
        if(num1 == num2){
            return num1;
        }

        int a = num1>num2 ? num1: num2;
        int b = num1<num2 ? num1: num2;
        return greatestCommonDivisor3(a-b,b);
    }

    public static int greatestCommonDivisor4(int num1, int num2) {
        if(num1 == num2){
            return num1;
        }
        int a = num1>num2 ? num1: num2;
        int b = num1<num2 ? num1: num2;

        //both even number
        if((a&1)==0 && (b&1)==0){
            return greatestCommonDivisor4(a>>1,b>>1)<<1;
        }else if((a&1)==1 && (b&1)==0){
            return greatestCommonDivisor4(a,b>>1);
        }
        else if((a&1)==0 && (b&1)==1){
            return greatestCommonDivisor4(a>>1,b);
        }else {
            return greatestCommonDivisor4(a-b,b);
        }

    }
}
