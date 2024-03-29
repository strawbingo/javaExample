package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题48：最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长字符串的长度。
 * 假设字符串中只包含’a‘~’z‘的字符。例如，在字符串”arabcacfr“中，最长的不含重复字符的子字符串是“acfr”，长度为4.
 */
public class LongestSubstringTest {

    @Test
    public void testLengthOfLongestSubstring(){
        LongestSubstring longestSubstring = new LongestSubstring();

        Assert.assertEquals(2,longestSubstring.lengthOfLongestSubstring("aab"));
        Assert.assertEquals(4,longestSubstring.lengthOfLongestSubstring("abcdbac"));
        Assert.assertEquals(2,longestSubstring.lengthOfLongestSubstring("abababab"));
        Assert.assertEquals(3,longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
}
