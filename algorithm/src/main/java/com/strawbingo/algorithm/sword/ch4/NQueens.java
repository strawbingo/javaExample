package com.strawbingo.algorithm.sword.ch4;

import java.util.ArrayList;
import java.util.List;

/**
 * 题38-3: N皇后
 * 设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。
 * 这里的“对角线”指的是所有的对角线，不只是平分整个棋盘的那两条对角线。
 */
public class NQueens {
    public List<List<String>> soLveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] base = new boolean[n][n];

        backtrack(ans,0,n,base);

        return ans;
    }

    private void backtrack(List<List<String>> ans, int row, int n,boolean[][] base) {
//        System.out.println(row);
        if(row>=n){
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < base.length; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < base[j].length; k++) {
                    sb.append(base[j][k]?"Q":".");
                }
                stringList.add(sb.toString());
            }
            ans.add(stringList);
            return ;
        }


        //put one ,
        for (int col = 0; col <n ; col++) {
            boolean continueNext = false;
            //col
            for (int k = 0; k < row; k++) {
                if(base[k][col]){
                    continueNext = true;
                    break;
                }
            }
            if(continueNext) continue;
            //left q
            for (int k = 0; k < row; k++) {
                if(((col-row+k)>=0) && base[k][col-row+k]==true){
                    continueNext = true;
                    break;
                }
            }
            if(continueNext) continue;
            //right q
            for (int k = 0; k < row; k++) {
                if(((col+row-k)<n) && base[k][col+row-k]==true){
                    continueNext = true;
                    break;
                }
            }

            if(continueNext) continue;

//            System.out.println(row+":"+col);
            base[row][col] = true;
            backtrack(ans,row+1,n,base);
            base[row][col] = false;
        }

    }
}
