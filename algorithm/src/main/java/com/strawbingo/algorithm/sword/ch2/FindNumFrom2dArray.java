package com.strawbingo.algorithm.sword.ch2;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请按成 一个函数，输入这样一个二维数组和一个整数，判断数组中是否含有该整数
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
