package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;

/**
 * 题49：丑数
 * 我们把只包含因子2、3和5数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第1500个丑数。
 * 例如，6、8都是丑数，但14不是，因为它包含因子7.习惯上我们把1当做第一个丑数。
 */
public class UglyNumber {

    public int nthUglyNumber(int n) {
        int[] p = new int[n+1];
        p[1] = 1;
        int p2 = 1, p3=1, p5 =1;
        for (int i = 2; i <= n; i++) {
            int tmp = Math.min(p[p2]*2,Math.min(p[p3]*3,p[p5]*5));
//            System.out.println(p2+":"+p3+":"+p5);
            if(tmp == p[p2]*2){
                p2++;
            }
            if(tmp == p[p3]*3){
                p3++;
            }
            if(tmp == p[p5]*5){
                p5++;
            }
            p[i] = tmp;
        }

//        System.out.println(Arrays.toString(p));
        return p[n];

    }

}
