package com.strawbingo.algorithm.sword.ch2;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 题14：剪绳子
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是正整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]，
 * 请问k[0]*k[1]*...*k[m]的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class CuttingRope {


    public int cuttingRope(int n) {
        int ans = 1;
        if(n==2) return 1;
        if(n==3) return 2;

        int remainder = n%3;
        int m = n/3;
        if(remainder==1){

            if(m>=1){
                m--;
                ans = 2;
                remainder=2;
            }

        }
        System.out.println(m+":"+remainder+":"+ans);
        return (int)(ans * Math.pow(3,m))* (remainder==0?1:remainder);
    }

    public int cuttingRopeDp(int n) {
        int[] dp = new int[n+1];

        for (int i = 2; i <= n ; i++) {
            int currMax =0;
            for (int j = 1; j < i; j++) {
//                System.out.println(j+":"+i);
                currMax = Math.max(currMax,Math.max(j*(i-j),j*dp[i-j]));
            }
            dp[i] = currMax;
        }

        return dp[n];
    }

    /**
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     * @param n
     * @return
     */
    public int cuttingRopeDp2(int n) {
        BigInteger[] dp = new BigInteger[n+1];
        Arrays.fill(dp, BigInteger.valueOf(1));
        for (int i = 2; i <= n ; i++) {
            BigInteger currMax = BigInteger.ZERO;
            for (int j = 1; j < i; j++) {
//                System.out.println(j+":"+i);
                BigInteger bigInteger1 = BigInteger.valueOf(j * (i - j));
                BigInteger bigInteger2 = dp[i - j].multiply(BigInteger.valueOf(j));
                currMax = currMax.max(bigInteger1.max(bigInteger2));

            }
            dp[i] = currMax;
        }

        // return dp[n]%1000000007;
//        System.out.print(dp[n]);
        // return (int)dp[n]%1000000007;
        return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
