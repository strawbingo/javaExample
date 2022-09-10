package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题8：二叉树的下一个节点
 * 给定一颗二叉树和其中一个节点，找出中序遍历的下一个节点。
 * 树中节点除了指向左右子节点的指针，还有指向父节点的指针
 */
public class NextNodeOfBinaryTree {

    /**
     *       3
     *   2       8
     * 7    10      4
     *    9    11
     */
    public static TreeNode getNext(TreeNode currNode) {
        TreeNode node = currNode;
        //if have left return left
         if(node.right!=null) {
            node = node.right;
            while (node.left!=null){
                node = node.left;
            }
            return node;
        }
        //if no child , return parent
        else {
            while (node.parentNode!=null && node == node.parentNode.right){
                node = node.parentNode;
            }
            return node.parentNode;
        }

    }

}
