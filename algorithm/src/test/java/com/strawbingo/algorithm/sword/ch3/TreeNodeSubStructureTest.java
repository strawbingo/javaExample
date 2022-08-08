package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题26：树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4 
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 */



public class TreeNodeSubStructureTest {

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

    private TreeNode setUpSubTree(){
        TreeNode root = new TreeNode(4);

        TreeNode node1 = new TreeNode(1);

        root.setLeftNode(node1);

        return root;
    }

    @Test
    public void testIsSubStructure(){
        TreeNodeSubStructure treeNodeSubStructure = new TreeNodeSubStructure();
        TreeNode parent = setUpParentTree();
        TreeNode sub = setUpSubTree();

        Assert.assertTrue(treeNodeSubStructure.isSubStructure(parent, sub));

        Assert.assertFalse(treeNodeSubStructure.isSubStructure(parent, null));


        Assert.assertFalse(treeNodeSubStructure.isSubStructure(parent, new TreeNode(6)));

        //[4,2,3,4,5,6,7,8,9]
        //[4,8,9]
        TreeNode root = new TreeNode(4);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7= new TreeNode(7);
        TreeNode node8= new TreeNode(8);
        TreeNode node9= new TreeNode(9);

        root.setLeftNode(node2);
        root.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        node3.setLeftNode(node6);
        node3.setRightNode(node7);
        node4.setLeftNode(node8);
        node4.setRightNode(node9);
        Assert.assertTrue(treeNodeSubStructure.isSubStructure(root, node4));

    }



}
