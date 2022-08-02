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

    String star = "*";
    String point = ".";

    /**
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
//        System.out.println(s+"---------" +p);
       int m = s.length();
       int n = p.length();

       boolean[][] f = new boolean[m+1][n+1];
       f[0][0] = true;
       for(int i=0; i<= m ; ++i){
           for(int j=1; j<= n; ++j){
//               System.out.println(i+"====ij==="+j);
               if(p.charAt(j-1) == '*'){
                   f[i][j] = f[i][j-2];
                   if(matches(s,p,i,j-1)){
                       f[i][j] = f[i-1][j] || f[i][j] ;
                   }
               }
               //pj is not *
               else {

                   if(matches(s,p,i,j)){
                       f[i][j] = f[i-1][j-1];
                   }
               }
           }
       }

//       Stream.of(f).forEach(t -> System.out.println(Arrays.toString(t)));
//       System.out.println(f[m][n]);
       return f[m][n];
    }

    private boolean matches(String s, String p, int i, int j) {
       if(i == 0 ){
           return false;
       }

        if(p.charAt(j-1) == '.'){
            return true;
        }

        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    public boolean isMatch2(String s, String p) {
//        if(s.length()==0){
//            return false;
//        }

        return matchCore(s,p);

    }

    public boolean matchCore(String s, String p){
//        System.out.println(s+"---------" +p);
        if(p.length()>=2 && p.charAt(1) == '*'){
            if(s.length()>0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) ) {
                return matchCore(s, p.substring(2)) || matchCore(s.substring(1),p)
                        || matchCore(s.substring(1),p.substring(2));
            }
            else {
                return matchCore(s,p.substring(2));
            }
        }
        else if(s.length()> 0 && p.length()> 0 ){

            if(s.length() == 0) return false;

            if(s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'){
                return matchCore(s.substring(1),p.substring(1));
            }
            else {
                return false;
            }
        }
        else {
            if(s.length()==p.length()) {
                return true;
            }
            else{
                return false;
            }
        }
    }
}
