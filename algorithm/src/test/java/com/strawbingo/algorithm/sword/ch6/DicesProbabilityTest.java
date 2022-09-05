package com.strawbingo.algorithm.sword.ch6;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题60：n个骰子的点数
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出所有可能值出现的概率.
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 */
public class DicesProbabilityTest {

    @Test
    public void testDicesProbability(){
        DicesProbability dicesProbability = new DicesProbability();
//        double[] res = dicesProbability.dicesProbability(1);
//        double[] expectRes = {0.16667,0.16667,0.16667,0.16667,0.16667,0.16667};
//        Assert.assertArrayEquals(expectRes,res,0.0001);

        double[] res2 = dicesProbability.dicesProbabilityDp(3);
        double[] expectRes2 = {0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778};
        Assert.assertArrayEquals(expectRes2,res2,0.0001);
    }

}
