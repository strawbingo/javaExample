package com.strawbingo.algorithm.sword.ch7;

/**
 * 题67：把字符串转换成整数
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 */
public class StrToInt {

    public int strToInt(String s) {
        s = s.trim();
//        System.out.println(s);
        char[] chars = s.toCharArray();

        if( chars.length ==0 || (chars[0]!= '+' && chars[0]!= '-' && (chars[0] > '9' || chars[0]<'0'))){
//            System.out.println("return 0");
            return 0;
        }
//        StringBuilder sb = new StringBuilder();
        int sign =1;
        long ans = 0;
        for (int i = 0; i <chars.length ; i++) {
            if(i == 0 && (chars[0] == '+' || chars[0] == '-') ){
                sign = Integer.parseInt(chars[0]+"1");
                continue;
            }
            if (chars[i] > '9' || chars[i]<'0'){
//                System.out.println(chars[i]);
                break;
            }
//            sb.append(chars[i]);
            ans = ans * 10 +chars[i] - '0';
            ans = sign == 1? Math.min(Integer.MAX_VALUE,ans) :
                    Math.min(-(long)Integer.MIN_VALUE,ans);
//            System.out.println(i+":"+ans);
        }
//        System.out.println(ans);
//        System.out.println(sign);
//        System.out.println( Math.min(-(long)Integer.MIN_VALUE,Integer.parseInt(sb.toString())));

//        System.out.println(ans);
        return sign * (int)ans;
    }

}
