package com.strawbingo.algorithm.cartoon.ch5;

import java.security.InvalidParameterException;

public class FullArrange {

    /**
     * 给出一个正整数，找出这个正整数所有数字全排列的下一个数
     * @param number
     * @return
     */
    public static long nextNumber(long number) {
        if(number<0){
            throw new InvalidParameterException("less then zero!");
        }

        if(number<10){
            return number;
        }
        System.out.println("origin:"+number);
        //13465
        String num = String.valueOf(number);

        int descIndex = getDescIndex(num);

        if(descIndex==0){
            return number;
        }

        //13465
        String res = num.substring(0,descIndex);
        System.out.println("res:"+res);
        System.out.println("descIndex:"+descIndex);

        int minIndex = getMinNumIndex(num, descIndex);
        res = res.concat(String.valueOf(num.charAt(minIndex)));


        for(int i = num.length()-1 ; i>descIndex;i--){
//            if(num.charAt(i) > num.charAt(descIndex)){
                if(i == minIndex){
                    res = res.concat(String.valueOf(num.charAt(descIndex)));
                }else {
                    res = res.concat(String.valueOf(num.charAt(i)));
                }
//            }
        }


        return Long.parseLong(res);
    }

    private static int getMinNumIndex(String num, int descIndex) {
        for(int i = num.length()-1 ; i>descIndex;i--){
            System.out.println("i"+i+"numLen"+num.length());
            if(num.charAt(i) > num.charAt(descIndex)){
                System.out.println("minIndex:"+i);
                return i;
            }
        }

        return 0;
    }

    private static int getDescIndex(String num) {
        //get desc index
        for(int i=num.length()-2; i>0; i--){

            if(num.charAt(i)<num.charAt(i+1)){
                return i;
            }
        }
        return 0;
    }


    private static int findTransferPoint(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] > numbers[i - 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {1};
        findTransferPoint(numbers);
    }
}
