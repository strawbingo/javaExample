package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题63：股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 例如，一只股票在某些时间节点的价格为{9,11,8,5,7,12,16,14}。如果我们能在价格为5的时候买入并在价格为16时卖出，则能收获最大的利润为11
 */
public class StockMaxProfitTest {

    @Test
    public void testMaxProfit(){
        StockMaxProfit stockMaxProfit = new StockMaxProfit();
        int[] nums = {9,11,8,5,7,12,16,14};
        Assert.assertEquals(11,stockMaxProfit.maxProfit(nums));

        int[] nums2 = {7,1,5,3,6,4};
        Assert.assertEquals(5,stockMaxProfit.maxProfit(nums2));


        int[] nums3 = {7,6,4,3,1};
        Assert.assertEquals(0,stockMaxProfit.maxProfit(nums3));
    }
}
