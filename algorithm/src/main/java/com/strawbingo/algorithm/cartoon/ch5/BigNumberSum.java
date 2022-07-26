package com.strawbingo.algorithm.cartoon.ch5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BigNumberSum {

    public static String add(String number1, String number2) {

        int[] num1 = new int[number1.length()];
        int[] num2 = new int[number2.length()];
        for (int i = 0; i < number1.length(); i++) {
            num1[i] = number1.charAt(number1.length() - i - 1) - '0';
        }

        for (int i = 0; i < number2.length(); i++) {
            num2[i] = number2.charAt(number2.length() - i - 1) - '0';
        }

        int max = num1.length > num2.length ? num1.length : num2.length;
        int[] result = new int[max + 1];
//        System.out.println(Arrays.toString(result));
        int plus = 0;
        for (int i = 0; i < result.length; i++) {
            int temp = (i < num1.length ? num1[i] : 0) + (i < num2.length ? num2[i] : 0) + plus;
            if (temp >= 10) {
                plus = 1;
                result[result.length - i - 1] = temp - 10;
            } else {
                plus = 0;
                result[result.length - i - 1] = temp;
            }
//            System.out.println(Arrays.toString(result));
        }
        System.out.println(Arrays.toString(result));
        if(result[0]==0){
            result[0]=-1;
        }
        System.out.println(Arrays.toString(result));

        return Arrays.stream(result).mapToObj(String::valueOf).filter(s->!s.equals("-1")).collect(Collectors.joining(""));
    }

}
