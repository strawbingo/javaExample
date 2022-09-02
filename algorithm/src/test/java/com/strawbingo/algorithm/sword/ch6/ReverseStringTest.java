package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题58：翻转字符串
 */
public class ReverseStringTest {

    /**
     * 题目一：翻转单词顺序
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
     * 为简单起见，标点符号和普通字母一样处理。例如输入字符串“I am a student.”，则输出“student. a am I”
     */
    @Test
    public void testReverseWords(){
        ReverseString reverseString = new ReverseString();
        Assert.assertEquals("student. a am I",reverseString.reverseWords("I am a student."));

        Assert.assertEquals("blue is sky the",reverseString.reverseWords("the sky is blue"));

        Assert.assertEquals("example good a",reverseString.reverseWords("a good   example"));

    }

    /**
     * 题目二：左旋转字符串
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转的功能。比如，输入字符串“abcdefg”和数字2，该函数将返回左旋转两位得到的结果“cdefgab”
     */
    @Test
    public void testReverseLeftWords(){
        ReverseString reverseString = new ReverseString();
        Assert.assertEquals("cdefgab",reverseString.reverseLeftWords("abcdefg",2));
    }

}
