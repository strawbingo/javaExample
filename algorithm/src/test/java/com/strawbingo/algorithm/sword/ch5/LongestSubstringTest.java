package com.strawbingo.algorithm.sword.ch5;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {

    @Test
    public void testLengthOfLongestSubstring(){
        LongestSubstring longestSubstring = new LongestSubstring();

        Assert.assertEquals(2,longestSubstring.lengthOfLongestSubstring("aab"));
        Assert.assertEquals(4,longestSubstring.lengthOfLongestSubstring("abcdbac"));
        Assert.assertEquals(2,longestSubstring.lengthOfLongestSubstring("abababab"));
    }
}
