package com.strawbingo.algorithm.sword.ch5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题50：第一个只出现一次的字符
 */
public class FirstUniqChar {

    /**
     * 题目一：字符串中第一个只出现一次的字符
     * 在字符串中找出第一个只出现一次的字符。如输入“abaccdeff”，则输出’b‘
     */
    public char firstUniqCharInString(String s) {
        HashMap<Character, Integer>  sMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (Character c:
                chars ) {
                sMap.put(c,sMap.getOrDefault(c,0)+1);
        }

        for (Character c:
             chars) {
            if(sMap.get(c) == 1){
                return c;
            }
        }

        return ' ';
    }

    private HashMap<Character, Integer>  sMap = new HashMap<>();
    private Queue<Character>  queue = new LinkedList<>();

    public void addCharcter(char c) {
        sMap.put(c,sMap.getOrDefault(c,0)+1);

        if(sMap.get(c)==1) {
            queue.add(c);
        }
        if(sMap.get(queue.peek())>1){
            queue.poll();
        }
    }

    public char firstUniqCharInStream() {
        if(queue.isEmpty()) return ' ';
        return queue.peek();
    }
}
