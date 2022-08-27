package com.strawbingo.algorithm.sword.ch5;

/**
 * 题47：礼物的最大价值
 * 在一个m*n的棋盘的每一格斗放一个礼物，每个礼物都有一定的价值（价值大于0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格，直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物，请计算你最多能拿到多少价值的礼物？
 */
public class GiftMaxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if(i ==0 && j==0) continue;
                if(i==0) {
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                }
                else if(j==0){
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                }else {
                    grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1]) + grid[i][j];
                }
            }

        }

        return grid[m-1][n-1];
    }
}
