package com.strawbingo.algorithm.sword.ch5;


import java.util.HashSet;
import java.util.Set;

/**
 * 题48：最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长字符串的长度。
 * 假设字符串中只包含’a‘~’z‘的字符。例如，在字符串”arabcacfr“中，最长的不含重复字符的子字符串是“acfr”，长度为4.
 */
public class LongestSubstring {

    /**
     * 滑动窗口
     * @param source
     * @return
     */
    public int lengthOfLongestSubstring(String source) {
        char[] chars = source.toCharArray();
        int len = chars.length;
        int ans = 0;
        int rk = 0;
        // 哈希集合，记录每个字符是否出现过
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            // 左指针向右移动一格，移除一个字符
            if(i > 0){
                charSet.remove(chars[i-1]);
            }
            //calc rk

            while (rk<len && !charSet.contains(chars[rk])){
                // 不断地移动右指针
                charSet.add(chars[rk]);
                rk++;

            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans,rk-i);
        }

        return ans;
    }

}
