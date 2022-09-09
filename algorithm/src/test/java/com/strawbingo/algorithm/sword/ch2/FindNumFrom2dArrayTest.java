package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

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
