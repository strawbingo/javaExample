package com.strawbingo.algorithm.labuladong.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/n-queens/
 * N 皇后
 */
public class NQueen {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        boolean[][] queen = new boolean[n][n];
        backTrack(res,queen,0);
        return res;
    }

    private void backTrack(List<List<String>> res, boolean[][] queen, int n) {
        if(n == queen.length){
            res.add(generateBoard(queen));
            return ;
        }


        for (int j = 0; j < queen[n].length; j++) {
            boolean isCan = isCanPlace(queen,n,j);
            if(!isCan) continue;
            queen[n][j] = true;
            backTrack(res,queen,n+1);
            queen[n][j] = false;
        }


    }

    private boolean isCanPlace(boolean[][] queen, int row,int col) {
        //col check
        for (int i = 0; i < row; i++) {
            if(queen[i][col]) return false;
        }

        //left up check
        for (int i = row-1,j=col-1; i >=0 && j>=0; i--,j--) {
            if(queen[i][j]) return false;
        }

        //right up check
        for (int i = row-1,j=col+1; i >=0 && j<queen.length; i--,j++) {
            if(queen[i][j]) return false;
        }

        return true;
    }

    private List<String> generateBoard(boolean[][] queen) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < queen.length; i++) {
            StringBuilder boardLine = new StringBuilder();
            for (int j = 0; j < queen[i].length; j++) {
                boardLine.append(queen[i][j]?"Q":".");
            }
            board.add(boardLine.toString());
        }

        return board;
    }

}
