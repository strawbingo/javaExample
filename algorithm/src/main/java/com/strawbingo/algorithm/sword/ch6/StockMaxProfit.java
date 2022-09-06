package com.strawbingo.algorithm.sword.ch6;

/**
 * 题63：股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 例如，一只股票在某些时间节点的价格为{9,11,8,5,7,12,16,14}。如果我们能在价格为5的时候买入并在价格为16时卖出，则能收获最大的利润为11
 */
public class StockMaxProfit {

    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        int minNum=0;
        for (int i = 0; i <nums.length ; i++) {
            if(i==0){
                minNum = nums[0];
                continue;
            }
            //if number greater min, calc minus and compare to maxProfit
            if(nums[i] > minNum ){
                if((nums[i] - minNum) > maxProfit) {
                    maxProfit = nums[i] - minNum;
                }
            }
            //if number less min, set to minNum
            else {
                minNum = nums[i];
            }
        }

        return maxProfit;
    }
}
