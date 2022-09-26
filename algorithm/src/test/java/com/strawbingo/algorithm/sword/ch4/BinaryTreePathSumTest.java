package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 题34：二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
 * 从数的根节点开始往下一直到叶节点所经过的节点形成一条路径
 */
public class BinaryTreePathSumTest {

    @Test
    public void testPathSum(){
        TreeNode root = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node13 = new TreeNode(13);
        TreeNode nodeR4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);

        root.setLeftNode(node4);
        root.setRightNode(node8);

        node4.setLeftNode(node11);

        node11.setLeftNode(node7);
        node11.setRightNode(node2);

        node8.setLeftNode(node13);
        node8.setRightNode(nodeR4);

        nodeR4.setLeftNode(node5);
        nodeR4.setRightNode(node1);

        BinaryTreePathSum binaryTreePathSum = new  BinaryTreePathSum();
        List<List<Integer>> list = binaryTreePathSum.pathSum(root, 22);
        Assert.assertEquals(2,list.size());
        Assert.assertEquals(2,list.get(0).get(3).intValue());

        list = binaryTreePathSum.pathSum(root, 50);
        Assert.assertEquals(0,list.size());

        TreeNode root2nd1 = new TreeNode(1);
        TreeNode root2nd2 = new TreeNode(2);
        root2nd1.setLeftNode(root2nd2);
        list = binaryTreePathSum.pathSum(root2nd1, 0);
        Assert.assertEquals(0,list.size());

        list = binaryTreePathSum.pathSum(root2nd1, 1);
        Assert.assertEquals(0,list.size());

        //ddddddddd
        TreeNode root3nd1 = new TreeNode(1);
        list = binaryTreePathSum.pathSum(root3nd1, 1);
        Assert.assertEquals(1,list.size());

        TreeNode root4nd1 = new TreeNode(-2);
        TreeNode root4nd2 = new TreeNode(-3);
        root4nd1.right = root4nd2;
        list = binaryTreePathSum.pathSum(root4nd1, -5);
        Assert.assertEquals(1,list.size());

        TreeNode root5nd1 = new TreeNode(1);
        TreeNode root5nd2 = new TreeNode(-2);
        TreeNode root5nd3 = new TreeNode(-3);
        root5nd1.left = root5nd2;
        root5nd1.right = root5nd3;

        TreeNode root5nd4 = new TreeNode(1);
        TreeNode root5nd5 = new TreeNode(3);
        root5nd2.setLeftNode(root5nd4);
        root5nd2.setRightNode(root5nd5);

        TreeNode root5nd6 = new TreeNode(-2);
        root5nd3.setLeftNode(root5nd6);

        TreeNode root5nd7 = new TreeNode(-1);
        root5nd4.setLeftNode(root5nd7);

        list = binaryTreePathSum.pathSum(root5nd1, -1);
        Assert.assertEquals(1,list.size());


    }
}
