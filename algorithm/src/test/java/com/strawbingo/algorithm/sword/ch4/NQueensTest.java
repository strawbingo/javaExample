package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * 题38-3: N皇后
 * 设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。
 * 这里的“对角线”指的是所有的对角线，不只是平分整个棋盘的那两条对角线。
 */
public class NQueensTest {

    @Test
    public void  testSoLveNQueens() {
        NQueens nQueens = new NQueens();

        List<List<String>> res = nQueens.soLveNQueens(1);
        Assert.assertEquals(1,res.size());

        res = nQueens.soLveNQueens(4);
        System.out.println(res);
        Assert.assertEquals(2,res.size());
    }
}
