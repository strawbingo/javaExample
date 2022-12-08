package com.strawbingo.algorithm.labuladong.backtrack;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/n-queens/
 * N 皇后
 */
public class NQueenTest {

    @Test
    public void testNQuuen(){
        NQueen nQuuen = new NQueen();

        List<List<String>> res = new ArrayList();
        //[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
        List<String> sub = new ArrayList<>();
        sub.add(".Q..");
        sub.add("...Q");
        sub.add("Q...");
        sub.add("..Q.");
        res.add(sub);

        List<String> sub2 = new ArrayList<>();
        sub2.add("..Q.");
        sub2.add("Q...");
        sub2.add("...Q");
        sub2.add(".Q..");
        res.add(sub2);

        Assert.assertEquals(res,nQuuen.solveNQueens(4));

    }

}
