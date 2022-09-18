package com.strawbingo.algorithm.sword.ch3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 题19：正则表达式匹配
 * 请实现一个函数用来匹配包含'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串“aaa”与模式“a.a”和“ab*ac*a”匹配，但与“aa.a“和”ab*a“均不匹配
 */
public class RegularExpression {

    private char star = '*';
    private char point = '.';

    public boolean isMatch(String s, String p) {
        int m  = s.length();
        int n = p.length();

        //f[i][j]  if p[j] != * : f[i-1][j-1], if match (s[i] , p[j])
        //                              false, otherwise
        // otherwise  p[j] == * : f[i][j-2] or f[i-1][j], if match( s[i], p[j-1])
        //                        f[i][j-2]   otherwise

        boolean f[][] = new boolean[m+1][n+1];
        f[0][0] = true;
        for (int i = 0; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                if(p.charAt(j-1)==star){
                    f[i][j] = matches(s,p,i,j-1) ? f[i][j-2] || f[i-1][j] : f[i][j-2];
                }
                else {
                    f[i][j] = matches(s, p, i, j) ? f[i-1][j-1]: false;
                }
            }
        }

        return f[m][n];
    }

    private boolean matches(String s, String p, int i, int j) {

        if (i == 0) {
            return false;
        }

        if(p.charAt(j-1) == point) return true;

        return s.charAt(i-1) == p.charAt(j-1);
    }


}
