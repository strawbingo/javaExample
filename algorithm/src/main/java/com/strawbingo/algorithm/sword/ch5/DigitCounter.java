package com.strawbingo.algorithm.sword.ch5;

/**
 * 题43：1~n整数中1出现的次数
 * 输入一个正整数，求1~n这个n个整数的十进制表示中1出现的次数。
 * 例如，输入如12，1~12这些整数中含1的数字有1，10，11和12，1一共出现了5次
 */
public class DigitCounter {

    public int countDigitOne(int n) {
        int sum = 0;
//        int base = 10;

        for(int i = 0; i < String.valueOf(n).length(); i++) {
//            System.out.println(i);
            long mulk = (int)Math.pow(10,i);
//            System.out.println(mulk);
//            System.out.println((n/(mulk*10)) * mulk+":"+Math.min(Math.max(n%(mulk*10)-mulk+1,0),mulk));
            sum += (n/(mulk*10)) * mulk + Math.min(Math.max(n%(mulk*10)-mulk+1,0),mulk);
//            System.out.println(n+"===="+mulk);
//            System.out.println(sum);

        }

//        long mulk = 1;
//        while (n>=mulk){
//            sum += (n/(mulk*10)) * mulk + Math.min(Math.max(n%(mulk*10)-mulk+1,0),mulk);
//            mulk = mulk *10;
//        }


        return sum;

//        long mulk = 1;
//        int ans = 0;
//        for (int k = 0; n >= mulk; ++k) {
//            System.out.println((n / (mulk * 10)) * mulk+":"+Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk));
//            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
//            System.out.println(n+"===="+mulk);
//            System.out.println(ans);
//            mulk *= 10;
//        }
//        return ans;
    }

}
