package com.strawbingo.algorithm.sword.ch4;

/**
 * 题29：顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针一次打印出每一个数字
 */
public class MatrixPrint {

    public int[] clockwisePrint(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];

        int cols =  matrix[0].length;
        int rows = matrix.length;
        int[] ans = new int[cols*rows];
        int index = 0;

        int left =0, top=0, right =cols-1, bottom = rows-1;
        while (left<=right && top<=bottom){

            for(int col = left; col<= right;col++){
                ans[index++] = matrix[top][col];
            }

            for(int row = top+1; row<= bottom; row++){
                ans[index++] = matrix[row][right];
            }

            if(bottom>top) {
                for(int col = right-1; col>=left ; col--){
                    ans[index++] = matrix[bottom][col];
                }
            }

            if(right>left) {
                for(int row = bottom-1; row>top; row--){
                    ans[index++] = matrix[row][left];
                }
            }

            top++;
            left++;
            right--;
            bottom--;
        }

        return ans;
    }

}
