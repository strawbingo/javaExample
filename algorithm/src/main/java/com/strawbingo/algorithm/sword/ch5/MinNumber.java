package com.strawbingo.algorithm.sword.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 题45：把数组排成最小的数
 * 输入一个正整数数组，把数组里有所有数字拼接起来排成一个数，打印能拼接出的素有数字中最小的一个。
 * 例如，输入数组{3,32,321}则打印出这三个数字能排成的最小数字321323
 */
public class MinNumber {

    public String minNumber(int[] nums) {
        StringBuilder ans = new StringBuilder();

        ArrayList<Integer> numList = new ArrayList<>();
        for (int num:nums) {
            numList.add(num);
        }
//        System.out.println("numList.size():"+numList.size());
        while (!numList.isEmpty()){
            int index = 0;
            int minNum = numList.get(index);
//            System.out.println("numList.size():"+numList.size());


            for (int i = 1; i < numList.size(); i++) {
                if(compare(minNum,numList.get(i))){
                    minNum = numList.get(i);
                    index = i;
                }
            }

            ans.append(minNum);
            numList.remove(index);
        }

        return ans.toString();
    }

    /**
     * compare bit by bit
     * @param minNum
     * @param currNum
     * @return
     */
    private boolean compare(int minNum, Integer currNum) {

        long min = minNum * (long)(Math.pow(10,String.valueOf(currNum).length())) + currNum;
        long curr = currNum * (long)(Math.pow(10,String.valueOf(minNum).length())) + minNum;

        return min > curr;

    }


}
