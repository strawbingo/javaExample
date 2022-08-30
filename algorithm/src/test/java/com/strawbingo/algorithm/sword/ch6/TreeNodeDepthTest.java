package com.strawbingo.algorithm.sword.ch6;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题55：二叉搜索树的深度
 */
public class TreeNodeDepthTest {

    public TreeNode setUp(){
        TreeNode root = new TreeNode(3);

        TreeNode ndoe1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        root.left = ndoe1;
        root.right = node4;

        TreeNode node2 = new TreeNode(2);
        ndoe1.right = node2;

        return root;
    }
    /**
     * 题目一：二叉树的深度
     * 输入一棵二叉树的根节点，求该树的深度。
     * 从根节点到叶节点一次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度
     */
    @Test
    public void testMaxDepth(){
        TreeNodeDepth treeNodeDepth = new TreeNodeDepth();
        TreeNode root = setUp();
        Assert.assertEquals(3,treeNodeDepth.maxDepth(root));
    }

    /**
     * 题目二：平衡二叉树
     * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
     * 如果某二叉树中任意节点的左、右子树的深度相差不超过1，那么它就是一棵平衡二叉树
     */
    @Test
    public void testIsBalanced(){
        TreeNodeDepth treeNodeDepth = new TreeNodeDepth();
        TreeNode root = setUp();
        Assert.assertEquals(true,treeNodeDepth.isBalanced(root));

        TreeNode node5 = new TreeNode(5);
        root.left.right.left = node5;
        Assert.assertEquals(false,treeNodeDepth.isBalanced(root));
    }

}
