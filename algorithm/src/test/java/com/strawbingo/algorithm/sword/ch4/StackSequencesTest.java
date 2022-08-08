package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题31：栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的亚述顺序，请判断第二个序列是否为该栈的弹出序列
 *
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 */
public class StackSequencesTest {

    @Test
    public void testValidateStackSequences(){
        StackSequences stackSequences = new StackSequences();
        int[] pushed  = {1,2,3,4,5};
        int[] poped = {4,5,3,2,1};
        Assert.assertTrue(stackSequences.validateStackSequences(pushed,poped));

        int[] popedErr = {4,3,5,1,2};
        Assert.assertFalse(stackSequences.validateStackSequences(pushed,popedErr));

        int[] pushed2  = {2,1,0};
        int[] poped2 = {1,2,0};
        Assert.assertTrue(stackSequences.validateStackSequences(pushed2,poped2));
    }

}
