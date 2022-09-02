package com.strawbingo.algorithm.sword.ch6;

import java.util.Arrays;

/**
 * 题58：翻转字符串
 */
public class ReverseString {

    /**
     * 题目一：翻转单词顺序
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
     * 为简单起见，标点符号和普通字母一样处理。例如输入字符串“I am a student.”，则输出“student. a am I”
     */
    public String reverseWords(String s) {

        String newS = removeBlank(s);
//        System.out.println(newS);

        char[] chars = newS.toCharArray();
        reverseWord(chars,0,chars.length-1);

        int left = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ' ){
                reverseWord(chars,left,i-1);
                left = i+1;
                i++;
            }
            if( i==chars.length-1){
                reverseWord(chars,left,i);
            }

        }

//        System.out.println(Arrays.toString(chars));
//        System.out.println(String.valueOf(chars));
        return String.valueOf(chars);
    }

    private String removeBlank(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        char pre = ' ';
        for (char c:
             s.toCharArray()) {

            if(c == ' ' && pre == ' '){
                pre = c;
                continue;
            }
            pre = c;
            sb.append(c);
        }
        return sb.toString();
    }

    private void reverseWord(char[] chars,int left, int right){
        int len = right-left+1;

        for (int i = 0; i <len/2 ; i++) {
            char tmp = chars[left+i];
            chars[left+i] = chars[right-i] ;
            chars[right-i] = tmp;
        }
    }

    /**
     * 题目二：左旋转字符串
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转的功能。比如，输入字符串“abcdefg”和数字2，该函数将返回左旋转两位得到的结果“cdefgab”
     */
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int j = n; j < chars.length; j++) {
            sb.append(chars[j]);
        }

        for (int i = 0; i <n ; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
