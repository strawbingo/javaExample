package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * 题32：从上到下打印二叉树
 */
public class BinaryTreePrintTest {

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
     * 题目一：不分行，从上到下打印二叉树
     * 从上到下打印二叉树的每个节点，同一层的节点按照从左到右的顺序打印
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     */
    @Test
    public void testLevelOrder(){
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        TreeNode root = setUpParentTree();

        int[] order = binaryTreePrint.levelOrder(root);
        Assert.assertEquals(2,order[4]);
        Assert.assertEquals(5,order[2]);

        int[] ans = binaryTreePrint.levelOrder(null);
        Assert.assertEquals(0,ans.length);
    }

    /**
     * 题目二：分行从上到下打印二叉树
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
     */
    @Test
    public void testLevelOrderLineFeed() {
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        TreeNode root = setUpParentTree();

        List<List<Integer>>  order = binaryTreePrint.levelOrderLineFeed(root);
        Assert.assertEquals(3,order.size());
        Assert.assertEquals(2,order.get(2).size());
    }

    /**
     * 题目三：之字形打印二叉树
     * 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印
     */
    @Test
    public void testLevelOrderZLineFeed() {
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        TreeNode root = setUpParentTree();

        List<List<Integer>>  order = binaryTreePrint.levelOrderZLineFeed(root);
        Assert.assertEquals(3,order.size());
        Assert.assertEquals(2,order.get(2).get(1).intValue());
    }

}
