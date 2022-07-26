package com.strawbingo.algorithm.sword.ch2;


import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class RebuildBinaryTreeTest {



    /**
     *       3
     *   2       8
     * 9   10      4
     */
    @Test
    public void testRebuild(){

        int[] preOrder = {3, 2, 9, 10, 8 ,4};
        int[] inOrder = {9, 2 ,10 ,3 , 8, 4};

        TreeNode rebuild = RebuildBinaryTree.rebulid(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getValue());
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

        TreeNode rebuild = RebuildBinaryTree.rebulid(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getValue());
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

        TreeNode rebuild = RebuildBinaryTree.rebulid(preOrder, inOrder);
        Assert.assertEquals(3, rebuild.getValue());
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

        TreeNode rebuild = RebuildBinaryTree.rebulid(preOrder, inOrder);
        Assert.assertNull(rebuild);
    }

    @Test
    public void testRebuildInCorrectOrder2() {

        int[] preOrder = {3, 2, 9, 10, 4, 8};
        int[] inOrder = {9, 10, 10, 3, 8, 4};

        TreeNode rebuild = RebuildBinaryTree.rebulid(preOrder, inOrder);
        Assert.assertNull(rebuild);
    }
}
