package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题29：顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针一次打印出每一个数字
 */
public class MatrixPrintTest {

    @Test
    public void testClockwisePrint(){
        MatrixPrint matrixPrint = new MatrixPrint();
        int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
        int[]  res = matrixPrint.clockwisePrint(matrix);
        Assert.assertEquals(9,res.length);
        Assert.assertEquals(9,res[4]);

//        Assert.assertEquals(new int[0],matrixPrint.clockwisePrint(null));

        int[][] matrix2 =  {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[]  res2 = matrixPrint.clockwisePrint(matrix2);
        Assert.assertEquals(13,res2[24]);

        int[][] matrix3 =  {{3},{2}};
        int[]  res3 = matrixPrint.clockwisePrint(matrix3);
        Assert.assertEquals(2,res3[1]);

        int[][] matrix4 =  {{3,2,4}};
        int[]  res4 = matrixPrint.clockwisePrint(matrix4);
        Assert.assertEquals(2,res4[1]);

        int[][] matrix5 =  {{7},{9},{6}};
        int[]  res5 = matrixPrint.clockwisePrint(matrix5);
        Assert.assertEquals(9,res5[1]);
    }

}
