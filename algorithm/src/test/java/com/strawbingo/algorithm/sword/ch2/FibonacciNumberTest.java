package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    /**
     * 题10：斐波那契数列：
     * 题1，求菲波那切数列的第n项
     */
    @Test
    public void testGetN(){

        Assert.assertEquals(0, FibonacciNumber.getN(0));
        Assert.assertEquals(1, FibonacciNumber.getN(1));
        Assert.assertEquals(1, FibonacciNumber.getN(2));
        Assert.assertEquals(2, FibonacciNumber.getN(3));
        Assert.assertEquals(3, FibonacciNumber.getN(4));
        Assert.assertEquals(5, FibonacciNumber.getN(5));
        Assert.assertEquals(610, FibonacciNumber.getN(15));
    }

    /**
     * 题10：斐波那契数列：
     * 题1，求菲波那切数列的第n项
     */
    @Test
    public void testGetFibonacci(){

        Assert.assertEquals(0, FibonacciNumber.getFibonacci(0));
        Assert.assertEquals(1, FibonacciNumber.getFibonacci(1));
        Assert.assertEquals(1, FibonacciNumber.getFibonacci(2));
        Assert.assertEquals(2, FibonacciNumber.getFibonacci(3));
        Assert.assertEquals(3, FibonacciNumber.getFibonacci(4));
        Assert.assertEquals(5, FibonacciNumber.getFibonacci(5));
        Assert.assertEquals(610, FibonacciNumber.getFibonacci(15));
    }

    /**
     * 题10：斐波那契数列：
     * 题1，求菲波那切数列的第n项
     * LeetCode
     */
    @Test
    public void testFib(){
        FibonacciNumber fibonacciNumber = new FibonacciNumber();

        Assert.assertEquals(0, fibonacciNumber.fib(0));
        Assert.assertEquals(1, fibonacciNumber.fib(1));
        Assert.assertEquals(1, fibonacciNumber.fib(2));
        Assert.assertEquals(2, fibonacciNumber.fib(3));
        Assert.assertEquals(3, fibonacciNumber.fib(4));
        Assert.assertEquals(5, fibonacciNumber.fib(5));
        Assert.assertEquals(610, fibonacciNumber.fib(15));
    }

    /**
     * 题目二：青蛙跳台阶。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     */
    @Test
    public void testFrogJump(){

        Assert.assertEquals(1, FibonacciNumber.frogJump(1));
        Assert.assertEquals(2, FibonacciNumber.frogJump(2));
        Assert.assertEquals(3, FibonacciNumber.frogJump(3));
    }

    /**
     * 题目二：青蛙跳台阶。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     */
    @Test
    public void testFrogJumpLoop(){

        Assert.assertEquals(1, FibonacciNumber.frogJumpLoop(1));
        Assert.assertEquals(2, FibonacciNumber.frogJumpLoop(2));
        Assert.assertEquals(3, FibonacciNumber.frogJumpLoop(3));
    }

    /**
     * 题目二：青蛙跳台阶问题。一只青蛙一次可以跳1一级台阶，也可以跳上2级台阶。求跳上n级台阶有多少种跳法
     * LeetCode
     */
    @Test
    public void testNumWays(){
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        Assert.assertEquals(1, fibonacciNumber.numWays(1));
        Assert.assertEquals(2, fibonacciNumber.numWays(2));
        Assert.assertEquals(3, fibonacciNumber.numWays(3));
        Assert.assertEquals(21, fibonacciNumber.numWays(7));
    }

}
