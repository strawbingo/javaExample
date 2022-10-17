package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题41：数据流中的中位数
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序后中间两个数的平均值
 */
public class MedianFinderTest {

    @Test
    public void testFindMedian(){
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
//        medianFinder.addNum(5);
//        medianFinder.addNum(6);
//        medianFinder.addNum(4);
//        medianFinder.addNum(8);
        Assert.assertEquals(Double.valueOf(1.5) , medianFinder.findMedian());

        medianFinder.addNum(3);
        Assert.assertEquals(Double.valueOf(2), medianFinder.findMedian());

        medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        Assert.assertEquals(Double.valueOf(-1),medianFinder.findMedian());
        medianFinder.addNum(-2);
        Assert.assertEquals(Double.valueOf(-1.5),medianFinder.findMedian());
        medianFinder.addNum(-3);
        Assert.assertEquals(Double.valueOf(-2),medianFinder.findMedian());

        medianFinder.addNum(-4);
        Assert.assertEquals(Double.valueOf(-2.5),medianFinder.findMedian());



    }

}
