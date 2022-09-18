package com.strawbingo.algorithm.sword.ch3;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题19：正则表达式匹配
 * 请实现一个函数用来匹配包含'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串“aaa”与模式“a.a”和“ab*ac*a”匹配，但与“aa.a“和”ab*a“均不匹配
 */
public class RegularExpressionTest {

    @Test
    public void testIsMatch(){
        RegularExpression regularExpression = new RegularExpression();

        boolean isMathc = regularExpression.isMatch("aaa","a.a");
        Assert.assertTrue(isMathc);

        System.out.println("****************************.*a*a");
        isMathc = regularExpression.isMatch("bbbba",".*a*a");
        Assert.assertTrue(isMathc);

        System.out.println("****************************a*c");
        isMathc = regularExpression.isMatch("aaaaaaaaaab","a*a*a*a*a*a*a*a*a*a*c");
        Assert.assertFalse(isMathc);

        System.out.println("****************************a*a*a*a*a*a*a*a*a*a*c");
        isMathc = regularExpression.isMatch("aaaaaaaaaaaaab","a*a*a*a*a*a*a*a*a*a*c");
        Assert.assertFalse(isMathc);

        System.out.println("****************************==.*..a*");
        isMathc = regularExpression.isMatch("a",".*..a*");
        Assert.assertFalse(isMathc);


        System.out.println("****************************.*c");
        isMathc = regularExpression.isMatch("ab",".*c");
        Assert.assertFalse(isMathc);

        System.out.println("****************************ab*ac*a");
        isMathc = regularExpression.isMatch("aaa","ab*ac*a");
        Assert.assertTrue(isMathc);

        System.out.println("****************************");
        isMathc = regularExpression.isMatch("aaa","aa.a");
        Assert.assertFalse(isMathc);

        System.out.println("****************************");
        isMathc = regularExpression.isMatch("aaa","ab*a");
        Assert.assertFalse(isMathc);

        System.out.println("****************************a*");
        isMathc = regularExpression.isMatch("aa","a*");
        Assert.assertTrue(isMathc);

        System.out.println("****************************a*");
        isMathc = regularExpression.isMatch("ab",".*");
        Assert.assertTrue(isMathc);

//        System.out.println("****************************mis*is*ip*.");
//        isMathc = regularExpression.isMatch("missiissppi","mis*is*ip*.");
//        Assert.assertTrue(isMathc);          //"mississippi"

        System.out.println("****************************mis*is*ip*.");
        isMathc = regularExpression.isMatch("mississippi","mis*is*ip*.");
        Assert.assertTrue(isMathc);          //"mississippi"     "mis*is*ip*."



        System.out.println("****************************.a");
        isMathc = regularExpression.isMatch("aaa",".a");
        Assert.assertFalse(isMathc);

        System.out.println("****************************a*a");
        isMathc = regularExpression.isMatch("aaa","a*a");
        Assert.assertTrue(isMathc);

        System.out.println("****************************ab*");
        isMathc = regularExpression.isMatch("a","ab*");
        Assert.assertTrue(isMathc);

    }

//    @Test
//    public void testIsMatch2(){
//        RegularExpression regularExpression = new RegularExpression();
//
//        boolean isMathc = regularExpression.isMatch2("aaa","a.a");
//        Assert.assertTrue(isMathc);
//
//        System.out.println("****************************");
//        isMathc = regularExpression.isMatch2("aaa","ab*ac*a");
//        Assert.assertTrue(isMathc);
//
//        System.out.println("****************************");
//        isMathc = regularExpression.isMatch2("aaa","aa.a");
//        Assert.assertFalse(isMathc);
//
//        System.out.println("****************************");
//        isMathc = regularExpression.isMatch2("aaa","ab*a");
//        Assert.assertFalse(isMathc);
//
//        System.out.println("****************************a*");
//        isMathc = regularExpression.isMatch2("aa","a*");
//        Assert.assertTrue(isMathc);
//
//        System.out.println("****************************a*");
//        isMathc = regularExpression.isMatch2("ab",".*");
//        Assert.assertTrue(isMathc);
//
//        System.out.println("****************************mis*is*ip*.");
//        isMathc = regularExpression.isMatch2("mississippi","mis*is*ip*.");
//        Assert.assertTrue(isMathc);
//
//        System.out.println("****************************.a");
//        isMathc = regularExpression.isMatch2("aaa",".a");
//        Assert.assertFalse(isMathc);
//
//        System.out.println("****************************.a");
//        isMathc = regularExpression.isMatch2("aaa","a*a");
//        Assert.assertTrue(isMathc);
//
//
//        System.out.println("****************************=a*a*a*a*a*a*a*a*a*a*c");
//        isMathc = regularExpression.isMatch2("aaaaaaaaaaaaab" , "a*a*a*a*a*a*a*a*a*a*c");
//        Assert.assertTrue(isMathc);
//
//    }
}
