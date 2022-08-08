package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题28：对称的二叉树
 * 请实现一个函数，用来判断一个二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
public class TreeNodeSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.getLeftNode(),root.getRightNode());
    }

    public boolean isSymmetric(TreeNode left,TreeNode right){
        if ((left == null && right != null) || (left != null && right == null)) {
            return false;
        }

        if(left == null && right == null){
            return true;
        }

        if (left.getValue() == right.getValue()) {
            return isSymmetric(left.getLeftNode(),right.getRightNode()) &&
                    isSymmetric(left.getRightNode(),right.getLeftNode());
        }else {
            return false;
        }
    }
}
