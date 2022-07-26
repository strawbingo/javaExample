package com.strawbingo.algorithm.cartoon.ch3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *       3
 *   2       8
 * 9   10      4
 */
public class BinaryTreeTest {

    BinaryTree binaryTree;

    BinaryTree.TreeNode treeNode;


    @Before
    public void setup(){
        LinkedList<Integer> inputList = new LinkedList(Arrays.asList(3,2,9,null,null,10,null,null,8,null,4));

        treeNode = new BinaryTree().creatBinaryTree(inputList);

        binaryTree = new BinaryTree();

    }

    @Test
    public void tesPreOrderTraversal(){
        binaryTree.preOrderTraversal(treeNode);
    }

    @Test
    public void testInOrderTraversal(){
        binaryTree.inOrderTraversal(treeNode);
    }

    @Test
    public void testPostOrderTraversal(){
        binaryTree.postOrderTraversal(treeNode);
    }

    @Test
    public void testPreOrderTraversalWithStack(){
        binaryTree.preOrderTraversalWithStack(treeNode);
    }

    @Test
    public void testSequenceTraversal(){
        binaryTree.sequenceTraversal(treeNode);
    }

    @Test
    public void testSequenceTraversalNull(){
        binaryTree.sequenceTraversal(null);
    }
}
