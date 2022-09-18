package com.strawbingo.algorithm.sword.ch3;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题20：表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如字符串”+100“、”5e2“、”-123“、”3.1416”及“-1E-16“都表示数值，
 * 但”12e“、”1a3.14“、”1.2.3“、”+-5“及”12e+5.4“都不是
 */
public class StringIsNumberTest {

    @Test
    public void testIsNumber(){
        StringIsNumber stringIsNumber = new StringIsNumber();

        Assert.assertTrue(stringIsNumber.isNumber("1 "));
        Assert.assertTrue(stringIsNumber.isNumber("+100"));
        Assert.assertTrue(stringIsNumber.isNumber("5e2"));
        Assert.assertTrue(stringIsNumber.isNumber("-123"));
        Assert.assertTrue(stringIsNumber.isNumber("3.1416"));
        Assert.assertTrue(stringIsNumber.isNumber("-1E-16"));
        Assert.assertTrue(stringIsNumber.isNumber("0123"));
        Assert.assertTrue(stringIsNumber.isNumber(".1"));
        Assert.assertTrue(stringIsNumber.isNumber("3."));
        Assert.assertTrue(stringIsNumber.isNumber("+.8"));
        Assert.assertTrue(stringIsNumber.isNumber("46.e3"));
        Assert.assertTrue(stringIsNumber.isNumber(".2e81"));


        Assert.assertFalse(stringIsNumber.isNumber("12e"));
        Assert.assertFalse(stringIsNumber.isNumber("1a3.14x"));
        Assert.assertFalse(stringIsNumber.isNumber("1.2.3"));
        Assert.assertFalse(stringIsNumber.isNumber("+-5"));
        Assert.assertFalse(stringIsNumber.isNumber("12e+5.4"));
        Assert.assertFalse(stringIsNumber.isNumber("."));
        Assert.assertFalse(stringIsNumber.isNumber("4e+"));
        Assert.assertFalse(stringIsNumber.isNumber("+E3"));
        Assert.assertFalse(stringIsNumber.isNumber(" "));

    }
}
