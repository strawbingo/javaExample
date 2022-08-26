package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;


/**
 * 题45：把数组排成最小的数
 * 输入一个正整数数组，把数组里有所有数字拼接起来排成一个数，打印能拼接出的素有数字中最小的一个。
 * 例如，输入数组{3,32,321}则打印出这三个数字能排成的最小数字321323
 */
public class MinNumber {

    public String minNumber(int[] nums) {
        int[] resNums = new int[nums.length];
        //loop find min num
        int loop = nums.length;
        int sort=0;
        while (loop > 0){
            int chooseI = -1 ;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] < 0) continue;
                if(chooseI <0 ) {
                    chooseI = i;
                    continue;
                }

                if(compareTwoNum(nums[chooseI], nums[i])){
                    continue;
                }
                else {
                    chooseI = i;
                }

            }
            System.out.println("chooseI:"+chooseI);
            System.out.println("nums[chooseI]:"+nums[chooseI]);
            resNums[sort] = nums[chooseI];
            nums[chooseI] = -1;
            sort++;
            loop--;
        }

        System.out.println(Arrays.toString(resNums));
        //get res
        String res= "";
        for (int i = 0; i < resNums.length; i++) {
            res += resNums[i];
        }

        return res;
    }

    private boolean compareTwoNum(int x, int y) {

        if((x+""+y).compareTo(y+""+x) < 0){
            return true;
        }else{
            return false;
        }
    }

}
