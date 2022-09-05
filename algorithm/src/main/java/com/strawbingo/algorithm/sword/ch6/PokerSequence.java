package com.strawbingo.algorithm.sword.ch6;

import java.util.Arrays;

/**
 * 题61：扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2~10位数字本身，Q为12，K为13，而大小王可以看成任意数字
 */

public class PokerSequence {

    public boolean isStraight(int[] nums) {
        int pre = -1;
        int kingCount = 0;

        Arrays.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == 0){
                kingCount++;
                continue;
            }
            if(pre == -1){
                pre = nums[i];
            }
            else {
                if(pre + 1 == nums[i]){
                    pre++;
                }
                else {
                    if(pre  == nums[i] ){
                        return false;
                    }
                    else if(nums[i] - pre -1 <= kingCount){
                        kingCount -= nums[i] - pre -1;
                        pre = nums[i];
                    }else{
                        return false;
                    }
                }
            }
        }

        return true;

    }

}
