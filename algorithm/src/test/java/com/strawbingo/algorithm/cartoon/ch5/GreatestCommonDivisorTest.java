package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTest {


    @Test
    public void testGetGreatestCommonDivisor(){
        int gcd = GreatestCommonDivisor.greatestCommonDivisor(2,4);
        Assert.assertEquals(2,gcd);

        gcd = GreatestCommonDivisor.greatestCommonDivisor(3,5);
        Assert.assertEquals(1,gcd);


        gcd = GreatestCommonDivisor.greatestCommonDivisor(4,10);
        Assert.assertEquals(2,gcd);
    }

    @Test
    public void testGetGreatestCommonDivisor2(){
        int gcd = GreatestCommonDivisor.greatestCommonDivisor2(2,4);
        Assert.assertEquals(2,gcd);

        gcd = GreatestCommonDivisor.greatestCommonDivisor2(3,5);
        Assert.assertEquals(1,gcd);


        gcd = GreatestCommonDivisor.greatestCommonDivisor2(4,10);
        Assert.assertEquals(2,gcd);
    }

    @Test
    public void testGetGreatestCommonDivisor3(){
        int gcd = GreatestCommonDivisor.greatestCommonDivisor3(2,4);
        Assert.assertEquals(2,gcd);

        gcd = GreatestCommonDivisor.greatestCommonDivisor3(3,5);
        Assert.assertEquals(1,gcd);


        gcd = GreatestCommonDivisor.greatestCommonDivisor3(4,10);
        Assert.assertEquals(2,gcd);
    }

    @Test
    public void testGetGreatestCommonDivisor4(){
        int gcd = GreatestCommonDivisor.greatestCommonDivisor4(2,4);
        Assert.assertEquals(2,gcd);

        gcd = GreatestCommonDivisor.greatestCommonDivisor4(3,5);
        Assert.assertEquals(1,gcd);


        gcd = GreatestCommonDivisor.greatestCommonDivisor4(4,10);
        Assert.assertEquals(2,gcd);
    }

}
