package com.strawbingo.algorithm.sword.ch2;

/**
 * 题12：
 * 矩阵中的路径。
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符所有字符的路径。
 * 任意格开始，上下左右移动，不能重复进入。
 */

public class PathInMatrix {

    public static boolean hasPath(char[][] source, char[] des) {
        int rows = source.length;
        int cols = source[0].length;

        boolean[][] flags = new boolean[rows][cols];
        for (int i=0 ; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("loop for:"+i+"="+j);
                if(jude(source,des,0,i,j,flags,rows,cols)){
                    return true;
                }
            }
        }

        return false;

    }

    private static boolean jude(char[][] source, char[] des, int charIndex ,int i, int j, boolean[][] flags,int rows,int cols) {
        System.out.println("loop:"+i+"="+j+"charIndex="+charIndex);
        //if no more char, return true
        if(charIndex == des.length-1){
            return true;
        }

        //next char
//        System.out.println("com:"+source[i][j]+"==="+des[charIndex]);
        if(i>=0&& i<rows && j>=0&& j<rows && flags[i][j] ==false && charIndex<des.length && source[i][j]==(des[charIndex])){
            flags[i][j] = true;
            System.out.println("in com:"+source[i][j]+"==="+des[charIndex]);
            return
                    jude(source,des,charIndex+1,i+1,j,flags,rows,cols)||
            jude(source,des,charIndex+1,i-1,j,flags,rows,cols)||
            jude(source,des,charIndex+1,i,j+1,flags,rows,cols)||
            jude(source,des,charIndex+1,i,j-1,flags,rows,cols);
        }

        return false;

    }

}
