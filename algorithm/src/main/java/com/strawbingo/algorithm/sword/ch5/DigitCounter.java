package com.strawbingo.algorithm.sword.ch5;

/**
 * 题43：1~n整数中1出现的次数
 * 输入一个正整数，求1~n这个n个整数的十进制表示中1出现的次数。
 * 例如，输入如12，1~12这些整数中含1的数字有1，10，11和12，1一共出现了5次
 */
public class DigitCounter {

    public int countDigitOne(int n) {

        long base = 1;
        int sum = 0;
        while (base<=n){
            long a = n / base /10;
            long curr = (n / base) % 10;
            long b = n % base;

            System.out.println(a +":"+curr+":"+b);

            if(curr>1){
                //base > 1
                // a+1 * base
                sum += (a+1) * base;

            }
            else if(curr == 1) {
                //base == 1
                //a * base + b + 1
                sum += (a) * base;
                sum += b+1;
            }else {
                //base < 1
                // a * base
                sum += (a) * base;
            }
            base *=10;

        }

        return sum;
    }

}
