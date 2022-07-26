package com.strawbingo.algorithm.sword.ch2;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请按成 一个函数，输入这样一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class FindNumFrom2dArray {


    public static boolean findNum(int[][] arr, int num) {
        boolean isFind = false;

        int row = arr[0].length;
        int col = arr.length;

        if(arr == null ){
            return isFind;
        }

        int curRow = 0;
        int curCol = col-1;
        //if> row ,col return false
        while (curRow>=0 && curRow < row && curCol>= 0 && curCol < col) {
//            System.out.println("Find Num"+num+","+curRow+":"+curCol);
            //if == return
            if(num == arr[curRow][curCol]){
                isFind = true;
                break;
            //if < row -1
            }else if(num < arr[curRow][curCol]){
                curCol--;
            }
            //if > col +1
            else if(num > arr[curRow][curCol]){
                curRow++;
            }
        }


        return isFind;
    }
}
