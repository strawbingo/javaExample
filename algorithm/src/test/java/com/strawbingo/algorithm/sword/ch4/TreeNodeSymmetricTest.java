package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题28：对称的二叉树
 * 请实现一个函数，用来判断一个二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
public class TreeNodeSymmetricTest {

    private TreeNode setUpParentTree(){
        TreeNode root = new TreeNode(1);

        TreeNode node2l = new TreeNode(2);
        TreeNode node2r = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        root.setLeftNode(node2l);
        root.setRightNode(node2r);
        node2l.setLeftNode(node3);
        node2l.setRightNode(node4);
        node2r.setLeftNode(node4);
        node2r.setRightNode(node3);

        return root;
    }

    @Test
    public void testIsSymmetric(){
        TreeNodeSymmetric treeNodeSymmetric = new TreeNodeSymmetric();
        TreeNode root = setUpParentTree();
        Assert.assertTrue(treeNodeSymmetric.isSymmetric(root));

        Assert.assertTrue(treeNodeSymmetric.isSymmetric(null));

        root.getLeftNode().setLeftNode(new TreeNode(5));
        Assert.assertFalse(treeNodeSymmetric.isSymmetric(root));

    }

    @Test
    public void testIsSymmetricLoop(){
        TreeNodeSymmetric treeNodeSymmetric = new TreeNodeSymmetric();
        TreeNode root = setUpParentTree();
        Assert.assertTrue(treeNodeSymmetric.isSymmetricLoop(root));

        Assert.assertTrue(treeNodeSymmetric.isSymmetricLoop(null));

        root.getLeftNode().setLeftNode(new TreeNode(5));
        Assert.assertFalse(treeNodeSymmetric.isSymmetricLoop(root));

    }

}
