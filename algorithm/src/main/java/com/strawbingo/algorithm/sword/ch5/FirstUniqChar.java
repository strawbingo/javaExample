package com.strawbingo.algorithm.sword.ch5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
        if(s==null || s.length() == 0) return ' ';
        Map<Character,Integer> sMap = new HashMap();
        int len = s.length();

        for(int i=0; i <len; i++){
            char tmp  = s.charAt(i);
            sMap.put(tmp,sMap.containsKey(tmp)?sMap.get(tmp)+1:1);

        }

        for(int i=0; i <len; i++){
            if(sMap.get( s.charAt(i))==1) return  s.charAt(i);
        }

        return ' ';
    }

    private HashMap<Character, Integer>  sMap = new HashMap<>();
    private Queue<Character>  queue = new LinkedList<>();

    public void addCharcter(char c) {
       sMap.put(c,sMap.getOrDefault(c,0)+1);

       if(sMap.get(c) == 1){
           queue.add(c);
       }
    }

    /**
     * 题目二：字符流中第一个只出现一次的字符
     *
     * @return
     */
    public char firstUniqCharInStream() {
        while (!queue.isEmpty()){
            if(sMap.get(queue.peek())>1){
                queue.poll();
            }else {
                return queue.peek();
            }
        }

        return ' ';
    }
}
