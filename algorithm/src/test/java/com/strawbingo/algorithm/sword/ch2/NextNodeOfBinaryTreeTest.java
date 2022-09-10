package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题8：二叉树的下一个节点
 * 给定一颗二叉树和其中一个节点，找出中序遍历的下一个节点。
 * 树中节点除了指向左右子节点的指针，还有指向父节点的指针
 */
public class NextNodeOfBinaryTreeTest {

    /**
     *       3
     *   2       8
     * 7    10      4
     *    9    11
     */
    @Test
    public void testGetNext(){
        NextNodeOfBinaryTree nextNodeOfBinaryTree = new NextNodeOfBinaryTree();

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


        Assert.assertEquals(9, nextNodeOfBinaryTree.getNext(node2).getVal());
        Assert.assertEquals(10, nextNodeOfBinaryTree.getNext(node9).getVal());
        Assert.assertEquals(3, nextNodeOfBinaryTree.getNext(node11).getVal());
        Assert.assertNull( nextNodeOfBinaryTree.getNext(node4));

    }

}
