package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题50：第一个只出现一次的字符
 */
public class FirstUniqCharTest {

    /**
     * 题目一：字符串中第一个只出现一次的字符
     * 在字符串中找出第一个只出现一次的字符。如输入“abaccdeff”，则输出’b‘
     */
    @Test
    public void testFirstUniqChar(){
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        Assert.assertEquals('b',firstUniqChar.firstUniqCharInString("abaccdeff"));
        Assert.assertEquals(' ',firstUniqChar.firstUniqCharInString("aa"));
    }

    /**
     * 题目二：字符流中第一个只出现一次的字符
     * 请实现一个函数，用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中读出前连个字符“go”时，第一个只出现的字符是'g'，当从该字符流中读出前6个字符“google”时，
     * 第一个只出现一次的字符是’l‘
     */
    @Test
    public void testFirstUniqCharInStream(){
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        firstUniqChar.addCharcter('a');
        firstUniqChar.addCharcter('b');
        Assert.assertEquals('a',firstUniqChar.firstUniqCharInStream());

        firstUniqChar.addCharcter('a');
        firstUniqChar.addCharcter('c');
        firstUniqChar.addCharcter('c');
        firstUniqChar.addCharcter('d');
        firstUniqChar.addCharcter('e');
        firstUniqChar.addCharcter('f');
        Assert.assertEquals('b',firstUniqChar.firstUniqCharInStream());

        firstUniqChar = new FirstUniqChar();
        firstUniqChar.addCharcter('a');
        firstUniqChar.addCharcter('a');
        Assert.assertEquals(' ',firstUniqChar.firstUniqCharInStream());

        firstUniqChar = new FirstUniqChar();
        firstUniqChar.addCharcter('g');
        firstUniqChar.addCharcter('o');
        Assert.assertEquals('g',firstUniqChar.firstUniqCharInStream());
        firstUniqChar.addCharcter('o');
        firstUniqChar.addCharcter('g');
        firstUniqChar.addCharcter('l');
        firstUniqChar.addCharcter('e');
        Assert.assertEquals('l',firstUniqChar.firstUniqCharInStream());
    }

}
