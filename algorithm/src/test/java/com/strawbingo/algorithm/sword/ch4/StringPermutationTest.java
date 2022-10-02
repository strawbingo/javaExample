package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题38：字符串的排列
 */
public class StringPermutationTest {

    /**
     * 输入一个字符串，打印出该字符串中字符的所有排列。
     * 例如输入字符串abc，则打印出a、b、c所能排列出来不的所有字符串abc、acb、bac、bca、cab和cba
     */
    @Test
    public void testPermutation(){
        StringPermutation stringPermutation = new StringPermutation();
        String[] arr = stringPermutation.permutation("abc");
        Assert.assertEquals(6,arr.length);

        Assert.assertNull(stringPermutation.permutation(""));

        Assert.assertEquals(3,stringPermutation.permutation("aab").length);
    }
}
