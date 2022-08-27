package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String source) {
        int ans = 0;
        char[] chars = source.toCharArray();
        Set<Character> charSet = new HashSet();
        int rk = 0;
        for (int i = 0; i < source.length(); i++) {
            if(i != 0){
                charSet.remove(chars[i-1]);
            }

            while (rk<source.length() && !charSet.contains(chars[rk])){

                charSet.add(chars[rk]);
                rk++;
//                System.out.println("i="+i+",rk="+rk);
//                System.out.println(Arrays.toString(charSet.toArray()));
            }


            ans = Math.max(ans, rk - i);
        }

        return ans;
    }

}
