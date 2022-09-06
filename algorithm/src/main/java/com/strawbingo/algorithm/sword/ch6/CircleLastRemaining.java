package com.strawbingo.algorithm.sword.ch6;

/**
 * 题62：圆圈中最后剩下的数字
 * 0，1，...，n-1这个n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。
 * 求出这个圆圈里剩下的最后一个数字
 */
public class CircleLastRemaining {

    public int lastRemaining(int n, int m) {
        int index = 0;
        for (int i = 2; i <=n ; i++) {
            index = (index + m)%i;
        }

        return index;
    }
}
