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
        //get pre char and curr char
        return  dfs(s,p);

    }

    public boolean dfs(String s, String p){
//        System.out.println(s+":"+p);
        if(s.length()==0 && p.length()==0) return true;

        if(s.length() != 0 && p.length()==0 ) return false;


        if(p.length()>1 ){
            char pChar = p.charAt(0);
            char pChar2 = p.charAt(1);
//            System.out.println("pChar2"+pChar2);
            //if pChar2 is * , may 0 or more than 1
            if(pChar2 == star){
//                System.out.println("pChar2 == star");
                //if match
                if(s.length()>0){
                    if( s.charAt(0) == p.charAt(0) || pChar == point){
                        String sSub = s.substring(1);
                        //match 1 time
//                        dfs(s.substring(1),p.substring(2));
//                        // match more time;
//                        dfs(s.substring(1),p);
                        String pSub = p.substring(2);
                        //match 0 time;
                        return dfs(s,pSub) ||  dfs(sSub,p)  ;
//                        return dfs(s.substring(1),p) || dfs(s,p.substring(2));
                    }
                    else {
                        return  dfs(s, p.substring(2));
                    }
                }
                else {
                    return dfs(s,p.substring(2));
                }

//                return dfs(s,p.substring(2)) ||
//                        ((s.length()>0 &&( s.charAt(0) == p.charAt(0) || pChar == point)) ? dfs(s.substring(1),p.substring(2)) ||dfs(s.substring(1),p): false);
            }
            else {

                if(s.length()>0 &&( s.charAt(0) == p.charAt(0) || pChar == point)){
//                    System.out.println("pChar==sChar===="+s.charAt(0)+":"+pChar);
                    return dfs(s.substring(1),p.substring(1));
                }
                else {
                    return false;
                }
            }

        }
        else {

            if(s.length() == 0 && p.length()!=0 ) return false;
//            System.out.println("in p.length()<=1=="+s+":"+p);
            if((s.length()>0 &&( s.charAt(0) == p.charAt(0) || p.charAt(0) == point))){
                return dfs(s.substring(1),p.substring(1));
            }
            else {
//                System.out.println("return false");
                return  false;
            }
        }



    }
}
