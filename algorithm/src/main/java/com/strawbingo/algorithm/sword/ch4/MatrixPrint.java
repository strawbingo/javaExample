package com.strawbingo.algorithm.sword.ch4;

/**
 * 题29：顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针一次打印出每一个数字
 */
public class MatrixPrint {

    public int[] clockwisePrint(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int size = rows * cols;
        int[] printArr = new int[size];
        int printArrIndex = 0;

        int  left=0, right = cols-1 , top=0, bottom = rows-1;

        //loop item
        while (left <= right && top <= bottom) {
            //print row from left to right
            for(int column=left; column<=right; column++){
                printArr[printArrIndex++] = matrix[top][column];
            }

            //print col form up to down
            //if bottom > top
            if(bottom > top ) {
                for (int row = top + 1; row <= bottom; row++) {
                    printArr[printArrIndex++] = matrix[row][right];
                }
            }


            //print row from right to left
            //if right > left
            if(right > left && bottom > top) {
                for (int column = right-1 ; column > left; column--) {
                    printArr[printArrIndex++] = matrix[bottom][column];
                }
            }

            //print col from down to up
            //if bottom > top
            if(bottom > top  && right > left) {
                for (int row = bottom ; row > top; row--) {
                    printArr[printArrIndex++] = matrix[row][left];
                }
            }

            //move to next loop
            left++;
            right--;
            top++;
            bottom--;


        }

        return printArr;
    }

}
