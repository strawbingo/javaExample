package com.strawbingo.algorithm.sword.ch6;


import org.junit.Assert;
import org.junit.Test;

/**
 * 题64：求1+2+...+n
 * 求1+2+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A？B：C）
 */
public class SumNumbersWithRestrictTest {

    @Test
    public void testSumNums(){
        SumNumbersWithRestrict sumNumbersWithRestrict = new SumNumbersWithRestrict();

        Assert.assertEquals(6,sumNumbersWithRestrict.sumNums(3));


        Assert.assertEquals(45,sumNumbersWithRestrict.sumNums(9));
    }


}
