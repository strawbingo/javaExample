package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class NextNodeOfBinaryTreeTest {

    /**
     *       3
     *   2       8
     * 7    10      4
     *    9    11
     */
    @Test
    public void testRebuild(){

        TreeNode root = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        root.setLeftNode(node2);
        node2.setParentNode(root);
        root.setRightNode(node8);
        node8.setParentNode(root);

        TreeNode node7 = new TreeNode(7);
        TreeNode node10 = new TreeNode(10);
        node2.setLeftNode(node7);
        node7.setParentNode(node2);
        node2.setRightNode(node10);
        node10.setParentNode(node2);

        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        node10.setLeftNode(node9);
        node9.setParentNode(node10);
        node10.setRightNode(node11);
        node11.setParentNode(node10);

        TreeNode node4 = new TreeNode(4);
        node8.setRightNode(node4);
        node4.setParentNode(node8);


        Assert.assertEquals(9, NextNodeOfBinaryTree.getNext(node2).getValue());
        Assert.assertEquals(10, NextNodeOfBinaryTree.getNext(node9).getValue());
        Assert.assertEquals(3, NextNodeOfBinaryTree.getNext(node11).getValue());
        Assert.assertNull( NextNodeOfBinaryTree.getNext(node4));

    }

}
