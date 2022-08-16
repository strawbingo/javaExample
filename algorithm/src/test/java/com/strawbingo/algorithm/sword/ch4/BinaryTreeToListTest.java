package com.strawbingo.algorithm.sword.ch4;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题36：二叉搜索树与双向链表
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的节点，只能调整树种节点指针的指向。
 */
public class BinaryTreeToListTest {

    private BinaryTreeToList.Node setUpTree(){
        BinaryTreeToList.Node root = new BinaryTreeToList.Node(4);
        BinaryTreeToList.Node node2 = new BinaryTreeToList.Node(2);
        BinaryTreeToList.Node node1 = new BinaryTreeToList.Node(1);
        BinaryTreeToList.Node node3 = new BinaryTreeToList.Node(3);
        BinaryTreeToList.Node node5 = new BinaryTreeToList.Node(5);

        root.left = node2;
        root.right = node5;

        node2.left= node1;
        node2.right = node3;

        return root;
    }

    /**
     *        4
     *     2       5
     *   1   3
     */
    @Test
    public void testTreeToDoublyList(){
        BinaryTreeToList binaryTreeToList = new BinaryTreeToList();
        BinaryTreeToList.Node head = binaryTreeToList.treeToDoublyList(setUpTree());

        Assert.assertEquals(1, head.val);
        Assert.assertEquals(5, head.left.val);
        Assert.assertEquals(1, head.left.right.val);

    }



}
