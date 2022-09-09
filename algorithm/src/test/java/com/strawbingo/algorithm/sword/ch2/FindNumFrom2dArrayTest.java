package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题4：二维数组中的查找
 * 在一个二维数组，每一行从左到右递增，每一列从上到下递增。输入一个二维数组和一个整数，判断数组是否包含该整数
 */
public class FindNumFrom2dArrayTest {

    int[][] source = {{1,2, 8, 9},
                      {2,4, 9,12},
                      {4,7,10,13},
                      {6,8,11,15}};

    int[][] source2 = new int[0][0];

    int[][] source3 = {{-5}};

    @Test
    public void testFindNum(){
        Assert.assertEquals(true, FindNumFrom2dArray.findNum(source,2));
        Assert.assertEquals(true, FindNumFrom2dArray.findNum(source,10));
        Assert.assertEquals(false, FindNumFrom2dArray.findNum(source,5));
        Assert.assertEquals(false, FindNumFrom2dArray.findNum(source,20));

        Assert.assertEquals(true, FindNumFrom2dArray.findNum(source3,-5));
    }
}
