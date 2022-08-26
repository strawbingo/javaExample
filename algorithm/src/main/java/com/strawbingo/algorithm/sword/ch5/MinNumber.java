package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;

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
