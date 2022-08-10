package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题33：二叉搜索树的后序遍历
 * 输入一个整型数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回true，否则返回false。
 * 假设输入的数组的任意两个数字是互不相同。例如，{5，7，6，9，11，10，8}，则返回true。
 * {7，6，4，5}，返回false
 */
public class BinaryTreeVerifyTest {

    @Test
    public void testVerifyPostorder(){
        BinaryTreeVerify binaryTreeVerify = new BinaryTreeVerify();
        int[] arr = {5,7,6,9,11,10,8};
        Assert.assertTrue(binaryTreeVerify.verifyPostorder(arr));

        int[] arr2 = {7,6,4,5};
        Assert.assertFalse(binaryTreeVerify.verifyPostorder(arr2));

        int[] arr3 = {4,6,7,5};
        Assert.assertTrue(binaryTreeVerify.verifyPostorder(arr3));

        Assert.assertFalse(binaryTreeVerify.verifyPostorder(null));
    }
}
