package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题8：
 * 二叉树的下一个节点。
 * 给定一个节点，找出中序遍历的下一个节点。树中节点除了指向左右子节点的指针，还有指向父节点的指针。
 */
public class NextNodeOfBinaryTree {

    /**
     *       3
     *   2       8
     * 7    10      4
     *    9    11
     */
    public static TreeNode getNext(TreeNode currNode) {
        TreeNode result = null;
        if(currNode ==null){
            return null;
        }

        //if have right, the next is leaf left
        if(currNode.getRightNode()!=null){
            result = currNode.getRightNode();
            while (result.getLeftNode()!=null){
                result = result.getLeftNode();
            }
        }
        //if have no right
        else {
            if(currNode.getParentNode() != null ) {
                //if curr is left node,the next is parent
                if (currNode.getParentNode().getLeftNode() == currNode) {
                    result = currNode.getParentNode();
                }
                //if curr is right node,the next is the first left node's parent
                else {
                    while (currNode.getParentNode() != null && currNode == currNode.getParentNode().getRightNode()) {
//                      System.out.println(currNode.getVal());
                        currNode = currNode.getParentNode();
//                        System.out.println("return:"+result.getVal());
                    }
                    result = currNode.getParentNode();

                }
            }
        }
        //else is root no parent
        return  result;
    }

}
