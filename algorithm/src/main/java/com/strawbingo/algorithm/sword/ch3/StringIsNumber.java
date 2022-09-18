package com.strawbingo.algorithm.sword.ch3;

/**
 * 题20：表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如字符串”+100“、”5e2“、”-123“、”3.1416”及“-1E-16“都表示数值，
 * 但”12e“、”1a3.14“、”1.2.3“、”+-5“及”12e+5.4“都不是
 */
public class StringIsNumber {

    /**
     * A[.B][e|E[]C]
     *
     *
     */
    public boolean isNumber(String s) {
         //trim blank
        s = s.trim();
        if(s == null || s.length() ==0) return false;
//        System.out.println("in isNumber:"+s);

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

        }
        else {
            //check is number
            //if have . split to 2 part . and check is number
            if(s.indexOf(".")>=0){
//                System.out.println("s.substring(0,s.indexOf(\".\")="+s.substring(0,s.indexOf(".")));
                if (!isNumberWithDot(s)) return false;
            }
            else {
                if(!isNumberWithSign(s,false)) return false;
            }
        }

        return true;
    }

    private boolean isNumberWithDot(String s) {
        if(s.charAt(0) == '+' || s.charAt(0)=='-'){
            s=s.substring(1);
        }
        int dotIndex = s.indexOf(".");
        if(s.substring(0,dotIndex).length() == 0 && s.substring(dotIndex+1).length() ==0) return false;

        boolean part1 = s.substring(0, dotIndex).length()==0?true:isNumberWithSign(s.substring(0, dotIndex), false);
        boolean part2 = s.substring(dotIndex + 1).length()==0?true: isNumberOnly(s.substring(dotIndex + 1), false);

        return (part1==false||part2==false)? false:true;
    }

    private boolean isNumberOnly(String s,boolean must) {
        if(s==null || s.length()==0){
            return must? false:true;
        }
        char[] chars = s.toCharArray();
        for (char c:
             chars) {
            int num = (int)c-(int)'0';
//            System.out.println("num="+num);
            if(num < 0 || num > 9){
//                System.out.println("return false");
                return false;
            }
        }
        return true;
    }


    private boolean isNumberWithSign(String s,boolean must) {
//        System.out.println("isNumberWithSign="+s);
        if(s==null || s.length()==0){
            return must? false:true;
        }
        if(s.charAt(0) == '+' || s.charAt(0)=='-'){
            return isNumberOnly(s.substring(1),true);
        }
        else {
            return isNumberOnly(s,false);
        }

    }


}
