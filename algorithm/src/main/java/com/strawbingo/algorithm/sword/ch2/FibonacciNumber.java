package com.strawbingo.algorithm.sword.ch2;

public class FibonacciNumber {

    public static int getN(int n) {

        if(n <= 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int result = 0;
        int num1 = 0;
        int num2 = 1;
        for(int i = 2 ; i<= n; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;

    }

    /**
     * 递归
     */
    public static int getFibonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    /**
     * 题目二：青蛙跳台阶。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     */
    public static int frogJump(int i) {
        if(i<=0){
            return 0;
        }
        if(i ==1 ){
            return 1;
        }
        if(i ==2){
            return 2;
        }


        return frogJump(i-1)+ frogJump(i-2);

    }

    /**
     * 题目二：青蛙跳台阶。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     */
    public static int frogJumpLoop(int i) {
        if(i<=0){
            return 0;
        }
        if(i ==1 ){
            return 1;
        }
        if(i ==2){
            return 2;
        }

        int n1 = 2;
        int n2 = 1;
        int result = 0;
        for(int j=3 ; j<=i ;j++){
            result = n1 + n2;
            n2 = n1;
            n1 = n1+ n2;
        }
        return result;
    }

    /**
     * 题10：斐波那契数列：
     * 题1，求菲波那切数列的第n项
     * LeetCode
     * @param n
     * @return
     */
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int f0 = 0;
        int f1 = 1;
        int fn=0;

        while (n>1){
            fn=f0+f1;
            f0 = f1;
            f1 = fn;

            n--;
        }

        return fn;

    }

    /**
     * 题目二：青蛙跳台阶问题。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     * LeetCode
     */
    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int f0 = 1;
        int f1 = 1;
        int mod = 1000000007;
        int fn = 0;

        for (int i = 2; i <= n ; i++) {
            fn = (f0+f1)%mod;
            f0 =f1;
            f1 = fn;

        }
        return fn;
    }
}

