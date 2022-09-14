package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题14：剪绳子
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是正整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]，
 * 请问k[0]*k[1]*...*k[m]的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class CuttingRopeTest {

    @Test
    public void testCuttingRope(){
        CuttingRope cuttingRope = new CuttingRope();
//        Assert.assertEquals(1,cuttingRope.cuttingRope(2));
//        Assert.assertEquals(2,cuttingRope.cuttingRope(3));
//        Assert.assertEquals(4,cuttingRope.cuttingRope(4));
//        Assert.assertEquals(6,cuttingRope.cuttingRope(5));
//        Assert.assertEquals(36,cuttingRope.cuttingRope(10));


//        Assert.assertEquals(1,cuttingRope.cuttingRopeDp(2));
//        Assert.assertEquals(2,cuttingRope.cuttingRopeDp(3));
//        Assert.assertEquals(4,cuttingRope.cuttingRopeDp(4));
//        Assert.assertEquals(6,cuttingRope.cuttingRopeDp(5));
//        Assert.assertEquals(36,cuttingRope.cuttingRopeDp(10));


        Assert.assertEquals(36,cuttingRope.cuttingRopeDp2(10));
        Assert.assertEquals(953271190,cuttingRope.cuttingRopeDp2(120));
    }
}
