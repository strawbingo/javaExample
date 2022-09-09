package com.strawbingo.algorithm.sword.ch2;

/**
 * 题4：二维数组中的查找
 * 在一个二维数组，每一行从左到右递增，每一列从上到下递增。输入一个二维数组和一个整数，判断数组是否包含该整数
 */
public class FindNumFrom2dArray {


    public static boolean findNum(int[][] matrix, int target) {
        boolean isFind = false;
        if(matrix == null || matrix.length ==0) return isFind;


        for (int j = matrix[0].length-1; j >=0 ; j--) {
            if(matrix[0][j] == target) {
                isFind = true;
                break;
            }
            else if (matrix[0][j] < target){
                for (int i = 0; i < matrix.length; i++) {
                    if(matrix[i][j] == target){
                        isFind = true;
                        break;
                    }
                }

            }

        }

        return isFind;
    }
}
