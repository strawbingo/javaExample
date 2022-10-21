package com.strawbingo.algorithm.sword.ch5;

/**
 * 题46：把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成“a”，1翻译成“b”，......，11翻译成“l”，25翻译成“z”。
 * 一个数字可能有多种翻译。例如，12258，有5种不同的翻译，分别是“bccfi”、“bwfi”、“bczi”、“mcfi”和“mzi”。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法
 */
public class NumberTransToString {


    public int translateNum(int num) {
        String numString = String.valueOf(num);
        int ans  = dp(numString);
        return  ans;
    }

    private int dp(String numString) {
//        System.out.println("numString:"+numString);
        if(numString.length()==0){
            return 1;
        }
        if(numString.length()== 1){
            return 1;
        }
//        System.out.println(numString.substring(1,numString.length())+":"+Integer.valueOf(numString.substring(0,2)));
        int n1= dp(numString.substring(1,numString.length())) ;
        int n2 =  Integer.valueOf(numString.substring(0,2))>25||Integer.valueOf(numString.substring(0,2))<10?0:( dp(numString.substring(2,numString.length())));
//        System.out.println(n1+":"+n2);

        return n1+n2;
    }


    public int translateNumDP(int num) {
        String s = String.valueOf(num);

        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] dp = new int[len];
        dp[0] = 1;

        for (int i = 1; i < len ; i++) {
            dp[i] = dp[i-1];
            int currNum = (chars[i-1]-'0')*10+(chars[i]-'0');
            if(currNum >=10 && currNum<=25){
                if(i<2){
                    dp[i]++;
                }
                else {
                    dp[i] += dp[i - 2];
                }
            }

        }

        return dp[len-1];
    }

    public int translateNumDP2(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int len = chars.length;
        int p=0,q=0,r=1;

        for (int i = 0; i < len; i++) {
            p = q;
            q = r;

            if(i==0){
                continue;
            }

            int currNum = (chars[i-1]-'0') *10 + (chars[i]-'0') ;
            if(currNum > 9 && currNum < 26){
                r += p;
            }

        }

        return r;
    }
}
