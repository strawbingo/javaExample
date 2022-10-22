package com.strawbingo.algorithm.sword.ch5;

/**
 * 题49：丑数
 * 我们把只包含因子2、3和5数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第1500个丑数。
 * 例如，6、8都是丑数，但14不是，因为它包含因子7.习惯上我们把1当做第一个丑数。
 */
public class UglyNumber {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int p2=1,p3=1,p5=1;
        for(int i = 2; i<=n; i ++){
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);


            if(num2 ==  dp[i]){
                p2++;
            }
            if(num3 ==  dp[i]){
                p3++;
            }
            if(num5 ==  dp[i]){
                p5++;
            }
        }
        return dp[n];

    }

}
