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

    /**
     * dp[i] = dp [i-1]
     * @param num
     * @return
     */
    public int translateNumDP(int num) {
        String numStr = String.valueOf(num);
        char[] chars = numStr.toCharArray();
        int len = chars.length;
        int[] dp = new int[len];
        dp[0] = 1;

        for (int i = 1; i < len; i++) {
            dp[i] = dp[i-1];
            int cur = (chars[i-1]-'0') * 10 + chars[i]-'0';
            if(cur > 9 && cur < 26){
                if(i <= 1){
                    dp[i]++;
                }else {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[len-1];

    }

}
