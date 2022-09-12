package com.strawbingo.algorithm.sword.ch2;

/**
 * 题12：
 * 矩阵中的路径。
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符所有字符的路径。
 * 任意格开始，上下左右移动，不能重复进入。
 */

public class PathInMatrix {

    //wrong method
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

    /**
     * leetCode
     */
    public boolean exist(char[][] source, String word) {
        if(source == null || word == null) return false;

        int row = source.length;
        int col = source[0].length;
//        int i=0;
//        int j=0;
        int index = 0;

        boolean match = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
//                System.out.println(i+":"+j);
                boolean[][] flag = new boolean[row][col];
                boolean ans = exist(source,word,row,col,i,j,index,flag);
                if(ans == true) return true;
            }

        }

//        return exist(source,word,row,col,i,j,index,flag,match);

        return false;
    }

    private boolean exist(char[][] source, String word, int row, int col, int i, int j, int index,boolean[][] flag) {
        System.out.println("index:"+index+":i="+i+":j="+j);
        if(index == word.length()) {
            System.out.println("no more word:"+index+":i="+i+":j="+j);
            return true;
        }
        if(i==row || j == col || i<0 || j<0) {
            System.out.println("false:::::i="+i+":j="+j);
            return false;
        }


        if(flag[i][j] == true || (source[i][j] != word.charAt(index))){
            System.out.println("not match:"+source[i][j]+":i="+i+":j="+j);
            return false;
        }else{
            System.out.println("match:"+source[i][j]+":i="+i+":j="+j);
            flag[i][j] = true;
            index = index+1;
            boolean match =  exist(source,word,row,col,i+1,j,index,flag) ||
                    exist(source,word,row,col,i,j+1,index,flag) ||
                    exist(source,word,row,col,i-1,j,index,flag) ||
                    exist(source,word,row,col,i,j-1,index,flag);
            if(!match)  flag[i][j] = false;
            return match;
        }


    }

    private boolean exist(char[][] source, String word, int row, int col, int i, int j, int index,boolean[][] flag,boolean match) {
        System.out.println("index:"+index+":i="+i+":j="+j+":match="+match);
        if(index == word.length()) {
            System.out.println("no more word:"+index+":i="+i+":j="+j);
            return true;
        }

        if(i==row || j == col || i<0 || j<0) {
            System.out.println("false:::::i="+i+":j="+j);
            return false;
        }

        if(flag[i][j] == true){
            System.out.println("accessed i="+i+":j="+j);
            return false;
        }
        if(match && (source[i][j] != word.charAt(index))){
            System.out.println("not match:"+source[i][j]+":i="+i+":j="+j);
            return false;
        }
        if(source[i][j] == word.charAt(index) ){
            System.out.println("match:"+source[i][j]+":i="+i+":j="+j);
            flag[i][j] = true;
            match = true;
            index = index+1;
        }


        return exist(source,word,row,col,i+1,j,index,flag,match) ||
                exist(source,word,row,col,i,j+1,index,flag,match) ||
                exist(source,word,row,col,i-1,j,index,flag,match) ||
                exist(source,word,row,col,i,j-1,index,flag,match);
    }
}
