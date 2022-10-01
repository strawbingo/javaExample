package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 题37：序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class BinaryTreeCoderTest {
    BinaryTreeCoder binaryTreeCoder = new  BinaryTreeCoder();

    /**
     *      1
     *    2   3
     *      4   5
     * @return
     */

    private TreeNode setupTree(){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node3.left = node4;
        node3.right = node5;
        return  root;
    }

    @Test
    public void testSerialize(){
        TreeNode root = setupTree();
        String s = binaryTreeCoder.serialize(root);
//        Assert.assertEquals("1,2,null,null,3,4,null,null,5,null,null",s);
        Assert.assertEquals("1,2,3,null,null,4,5,null,null,null,null",s);

        s = binaryTreeCoder.serializeRecur(root);
//        Assert.assertEquals("1,2,null,null,3,4,null,null,5,null,null",s);
        Assert.assertEquals("1,2,3,null,null,4,5,null,null,null,null",s);

        s = binaryTreeCoder.serializeLeetCode1(root);
//        Assert.assertEquals("1,2,null,null,3,4,null,null,5,null,null",s);
        Assert.assertEquals("[1,2,3,null,null,4,5,null,null,null,null]",s);

    }


    @Test
    public void testDeSerialize(){
//        TreeNode root = binaryTreeCoder.deserialize("[1,2,null,null,3,4,null,null,5,null,null]");
        TreeNode root = binaryTreeCoder.deserialize("1,2,3,null,null,4,5,null,null,null,null");
        Assert.assertEquals(1,root.val);

//        root = binaryTreeCoder.deserialize("1,2,3,null,null,4,5");
//        Assert.assertEquals(1,root.val);

//        root = binaryTreeCoder.deserialize("5,2,3,null,null,2,4,3,1");
//        Assert.assertEquals(5,root.val);

        root = binaryTreeCoder.deserialize("5,2,3,null,null,2,4,3,1,null,null,null,null,null,null");
        Assert.assertEquals(5,root.val);


        root = binaryTreeCoder.deserializeRecur("5,2,3,null,null,2,4,3,1,null,null,null,null,null,null");
        Assert.assertEquals(5,root.val);
    }
}
