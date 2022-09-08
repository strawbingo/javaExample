package com.strawbingo.algorithm.sword.ch7;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题68：树中两个节点的最低公共祖先
 *
 */
public class TreeNodeLowerTest {

    /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * “对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的
     * 祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     */
    @Test
    public void testLowestCommonAncestor(){
        TreeNodeLower treeNodeLower = new TreeNodeLower();
        TreeNode root = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        root.left = node2;
        root.right = node8;

        TreeNode node0 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        node2.left = node0;
        node2.right = node4;

        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        node4.left = node3;
        node4.right = node5;

        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        node8.left = node7;
        node8.right = node9;



        TreeNode ancestor = treeNodeLower.lowestCommonAncestor(root, node2, node8);
        Assert.assertEquals(6,ancestor.val);

        Assert.assertEquals(2,treeNodeLower.lowestCommonAncestor(root, node2, node4).val);

        Assert.assertEquals(6,treeNodeLower.lowestCommonAncestor2(root, node2, node8).val);
        Assert.assertEquals(2,treeNodeLower.lowestCommonAncestor2(root, node2, node4).val);
    }

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     */
    @Test
    public void testLowestCommonAncestor2(){
        TreeNodeLower treeNodeLower = new TreeNodeLower();
        TreeNode root = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        root.left = node5;
        root.right = node1;

        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        node5.left = node6;
        node5.right = node2;

        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        node2.left = node7;
        node2.right = node4;

        TreeNode node0 = new TreeNode(0);
        TreeNode node8 = new TreeNode(8);
        node1.left = node0;
        node1.right = node8;

        Assert.assertEquals(3,treeNodeLower.lowestCommonAncestor3(root, node5, node1).val);
        Assert.assertEquals(5,treeNodeLower.lowestCommonAncestor3(root, node5, node4).val);

        Assert.assertEquals(3,treeNodeLower.lowestCommonAncestor4(root, node5, node1).val);
        Assert.assertEquals(5,treeNodeLower.lowestCommonAncestor4(root, node5, node4).val);
    }
}
