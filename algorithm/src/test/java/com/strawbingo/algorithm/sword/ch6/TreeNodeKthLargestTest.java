package com.strawbingo.algorithm.sword.ch6;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题54：二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class TreeNodeKthLargestTest {

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

    @Test
    public void testKthLargest(){
        TreeNodeKthLargest treeNodeKthLargest = new TreeNodeKthLargest();
        TreeNode root = setUp();
        Assert.assertEquals(4,treeNodeKthLargest.kthLargest(root,1));
        Assert.assertEquals(3,treeNodeKthLargest.kthLargest(root,2));
    }


}
