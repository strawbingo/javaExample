package com.strawbingo.algorithm.sword.ch3;

public class StringIsNumber {

    /**
     * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
     * 例如字符串”+100“、”5e2“、”-123“、”3.1416”及“-1E-16“都表示数值，
     * 但”12e“、”1a3.14“、”1.2.3“、”+-5“及”12e+5.4“都不是
     *
     * A[.B][e|E[]C]
     */
    public boolean isNumber(String s) {

        s = s.trim();
        if(s.isEmpty()) return false;

//        System.out.println("isNumber"+s);

        if(s.indexOf('e')>0 || s.indexOf('E') >0){
            int eIndex =  s.indexOf('e')>0?s.indexOf('e'):s.indexOf('E');
            String s1 = s.substring(0,eIndex);
            String s2 = s.substring(eIndex+1);

            if(s2.length() == 0) return false;

            return  isNumberWithDot(s1) && isAllNumber(s2);
        }

        return isNumberWithDot(s);

    }

    private boolean isAllNumber(String s) {
//        System.out.println("isAllNumber"+s);


        if(s.charAt(0) == '+' || s.charAt(0)=='-'){
            s = s.substring(1);
        }

        if(s.length()==0) return false;

        return  isPositiveNumber(s);
    }

    private boolean isPositiveNumber(String s) {
        System.out.println("isPositiveNumber"+s);


        for(int i=0; i <s.length();i++){
            int i1 = 0;
            try {
                i1 = Integer.parseInt(s.charAt(i)+"");
            }
            catch (Exception e){
                return false;
            }
            System.out.println("isPositiveNumber"+i1);
//            System.out.println(i1+ "="+s.charAt(i));
            if(i1<0 || i1> 9)
                return false;
        }
        return true;
    }

    private boolean isNumberWithDot(String s) {
        System.out.println("isNumberWithDot"+s);
        if(s.charAt(0) == '+' || s.charAt(0)=='-'){
            s = s.substring(1);
        }
        if(s.length()==0) return false;
        if(s.indexOf('.')>=0){
            int eIndex =  s.indexOf('.');
            String s1 = s.substring(0,eIndex);
            String s2 = s.substring(eIndex+1);
            System.out.println(s1+"=s1s2="+s2);
            if(s1.length()==0 && s2.length() ==0) return false;
            return ((s1.length()>0)?isPositiveNumber(s1):true) &&
                    isPositiveNumber(s2);
        }
        else {
            return isPositiveNumber(s);
        }
    }

}
