package com.strawbingo.algorithm.sword.ch5;

/**
 * 题46：把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成“a”，1翻译成“b”，......，11翻译成“l”，25翻译成“z”。
 * 一个数字可能有多种翻译。例如，12258，有5种不同的翻译，分别是“bccfi”、“bwfi”、“bczi”、“mcfi”和“mzi”。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法
 */
public class NumberTransToString {


    public int translateNum(int num) {
        String str = String.valueOf(num);
        int count = getTransNum(str);
        return count;

    }

    private int getTransNum(String str) {
        if (str.length() ==1)  return 1;
        if (str.substring(0,1).equals( "0")&&str.length()==2)  return 1;

//        System.out.println(str);
        return getTransNum(str.substring(1))+
                (str.length()>1?(Integer.parseInt(str.substring(0,2))>25||Integer.parseInt(str.substring(0,2))<10?0:
                        str.length()==2?1:getTransNum(str.substring(2))
                ):0);

    }

}
