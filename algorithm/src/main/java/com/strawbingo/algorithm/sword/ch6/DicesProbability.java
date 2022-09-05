package com.strawbingo.algorithm.sword.ch6;

import java.util.Arrays;

/**
 * 题60：n个骰子的点数
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出所有可能值出现的概率.
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 *
 * https://www.pianshen.com/article/84721545779/
 * https://blog.csdn.net/qq_27952053/article/details/90547973
 */
public class DicesProbability {

    public double[] dicesProbability(int n) {
        int maxValue = 6;
        int maxSum = n * maxValue;
        int size = maxSum - n +1;

        double[] res = new double[size];
        probability(n, res);

        double total = Math.pow(maxValue,n);
        for (int i = 0; i < size; i++) {
            res[i] = res[i]/total;
        }

        return res;
    }

    private void probability(int n, double[] res) {
        for (int i = 1; i <= 6; i++) {
            probability(n,n,i,res);
        }
    }

    private void probability(int original, int current, int sum, double[] res) {
        System.out.println(original+":"+current+":"+sum);
        if(current == 1){
            res[sum-original]++;
        }
        else {
            for (int i = 1; i <= 6; i++) {
                probability(original,current-1,i+sum,res);
            }
        }
    }

    public double[] dicesProbabilityDp(int n) {
        int maxValue = 6;
        int maxSum = n * maxValue;
        int size = maxSum - n +1;

        double[] dp = new double[6];
        Arrays.fill(dp,1.0/6.0);

        for (int i = 2; i <= n  ; i++) {
            double[] temp = new double[5*i+1];

            for (int j = 0; j < dp.length; j++) {
               for (int k = 0; k < 6; k++) {
//                   System.out.println(k+":"+(k+j));
                    temp[k+j] += dp[j]/6 ;
                }
            }

            dp = temp;
        }

        return dp;
    }

}
