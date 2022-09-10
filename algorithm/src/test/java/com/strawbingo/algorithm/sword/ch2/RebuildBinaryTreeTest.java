package com.strawbingo.algorithm.sword.ch2;


import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题7：重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class RebuildBinaryTreeTest {

    RebuildBinaryTree rebuildBinaryTree = new RebuildBinaryTree();

    /**
     *       3
     *   2       8
     * 9   10      4
     */
    @Test
    public void testRebuild(){

        int[] preOrder = {3, 2, 9, 10, 8 ,4};
        int[] inOrder = {9, 2 ,10 ,3 , 8, 4};

        TreeNode rebuild = rebuildBinaryTree.rebuild(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getVal());
        Assert.assertEquals(2, rebuild.left.getVal());
        Assert.assertEquals(9, rebuild.left.left.getVal());
    }


    /**
     *       3
     *   2        8
     * 9   10   6   4
     */
    @Test
    public void testRebuildFullTree(){

        int[] preOrder = {3, 2, 9, 10, 8 ,6 ,4};
        int[] inOrder = {9, 2 ,10 ,3 , 6, 8, 4};

        TreeNode rebuild = rebuildBinaryTree.rebuild(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getVal());
    }

    /**
     *       3
     *           8
     *               4
     *                   6
     */
    @Test
    public void testRebuildRightTree(){

        int[] preOrder = {3, 8 ,4, 6};
        int[] inOrder = {3, 8 ,4, 6};

        TreeNode rebuild = rebuildBinaryTree.rebuild(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getVal());
    }


    /**
     *       3
     *   2       8
     * 9   10      4
     */
    @Test
    public void testRebuildInCorrectOrder() {

        int[] preOrder = {3, 2, 9, 10, 4, 8};
        int[] inOrder = {9, 2, 10, 3, 8, 4};

        TreeNode rebuild = rebuildBinaryTree.rebuild(preOrder, inOrder);
        Assert.assertNull(rebuild);
    }

    @Test
    public void testRebuildInCorrectOrder2() {

        int[] preOrder = {3, 2, 9, 10, 4, 8};
        int[] inOrder = {9, 10, 10, 3, 8, 4};

        TreeNode rebuild = rebuildBinaryTree.rebuild(preOrder, inOrder);
        Assert.assertNull(rebuild);
    }
}
