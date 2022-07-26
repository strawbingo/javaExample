package com.strawbingo.algorithm.cartoon.ch5;

import java.util.Arrays;

public class RemoveKDigits {

    public static int getMinNum(int inputNum, int k) {

        String sNum = String.valueOf(inputNum);
        int[] numArray = new int[sNum.length()];
        for(int i=0; i< sNum.length(); i++){
//            System.out.println("sNum 1:"+ sNum.substring(i,i+1));
            numArray[i] = Integer.valueOf(sNum.substring(i,i+1));
        }
//        System.out.println("numArray 1:"+ Arrays.toString(numArray));

        for (int i=0; i< k; i++ ){
            int maxNumIndex = getMaxNumIndex(numArray);
            numArray = removeIndex(numArray,maxNumIndex);
        }

//        System.out.println("numArray:"+ Arrays.toString(numArray));
        return toNumber(numArray);
    }

    private static int[] removeIndex(int[] numArray, int maxNumIndex) {
        int[] newNum = new int[numArray.length-1];
//        System.out.println("newNum 1:"+ Arrays.toString(newNum));
        for (int i=0 ; i<numArray.length; i++) {
            if(i < maxNumIndex){
                newNum[i] = numArray[i] ;
            }else if(i > maxNumIndex){
                newNum[i-1] = numArray[i];
            }
        }
//        System.out.println("newNum 2:"+ Arrays.toString(newNum));
        return newNum;
    }

    private static int getMaxNumIndex(int[] numArray) {
        int maxIndex = 0;
        int temp = numArray[0];
        for(int i=1; i< numArray.length; i++){
            if(numArray[i] > temp){
                temp = numArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int toNumber(int num[]){
        int sum = 0;
        for(int i =0; i <num.length; i++){
//            System.out.println(sum +":"+num[i]+":" );
            sum =  sum * 10 + num[i];
        }
        return sum;
    }

}
