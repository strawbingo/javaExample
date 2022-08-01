package com.strawbingo.algorithm.sword.ch3;

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
        boolean isMach = true;
        //"aaa","a.a"
        String pattenCharPre = "";
        String patterCharCurr = p.substring(0,1);

        for (int i=1; i<= p.length(); i++) {
            pattenCharPre = patterCharCurr;
            patterCharCurr= i == p.length()?"":p.substring(i,i+1);
            System.out.println(pattenCharPre+":"+patterCharCurr);
            System.out.println(s);
            System.out.println("==============");

//            if(patterCharCurr.equals(point)){
//                System.out.println("match pattenCharPre");
//                s = s.substring(1);
//                continue;
//            }

            if(patterCharCurr.equals(star)){
                // 0 or more pattenCharPre
                System.out.println("patterCharCurr is * ,match more");
                while(s.length()>=1 && (pattenCharPre.equals(point)||
                        s.substring(0,1).equals(pattenCharPre))){
                    s = s.substring(1);
                }
                continue;
            }

            if(pattenCharPre.equals("") || star.equals(pattenCharPre) ){
                continue;
            }

            if (point.equals(pattenCharPre)){
                System.out.println("match pattenCharPre");
                if(s.length()>0) {
                    s = s.substring(1);
                }
//                else {
//                    isMach = false;
//                    break;
//                }
                continue;
            }

            //if patterCharCurr is not * or .,means patterCharCurr is alphabet
            // compare
            // patterCharCurr have char but s is null
            // pattenCharPre not equals first letter
            // patterCharCurr is null
            if( (s.length()==0 && patterCharCurr!=null) ||
                    !pattenCharPre.equals(s.substring(0,1))
                ){
                System.out.println("pattenCharPre="+pattenCharPre+":s="+s);
                isMach = false;
                break;
            }
            else {
                System.out.println("match letter");
//                if(patterCharCurr.isEmpty()) {
                    s = s.substring(1);
//                }
            }


        }
        System.out.println("final s="+s);
        if(s.length()>0){
            isMach = false;
        }

        return isMach;
    }

}
