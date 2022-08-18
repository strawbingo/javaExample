package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题27：二叉树的镜像
 * 请完成一个函数，输入一棵二叉树，该函数输出它的镜像
 */
public class TreeNodeMirrorTest {

    private TreeNode setUpParentTree(){
        TreeNode root = new TreeNode(3);

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);

        root.setLeftNode(node4);
        root.setRightNode(node5);
        node4.setLeftNode(node1);
        node4.setRightNode(node2);

        return root;
    }

    /**
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     */
    @Test
    public void testMirrorTree(){
        TreeNodeMirror treeNodeMirror = new  TreeNodeMirror();
        TreeNode root = setUpParentTree();
        root = treeNodeMirror.mirrorTree(root);
        Assert.assertEquals(5,root.getLeftNode().getVal());
    }


}
