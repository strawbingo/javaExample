package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.Stack;

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

        if (left.getVal() == right.getVal()) {
            return isSymmetric(left.getLeftNode(),right.getRightNode()) &&
                    isSymmetric(left.getRightNode(),right.getLeftNode());
        }else {
            return false;
        }
    }

    public boolean isSymmetricLoop(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean res = true;
        Stack<TreeNode> nodeStack = new Stack();
        nodeStack.push(root.getLeftNode());
        nodeStack.push(root.getRightNode());

        while(!nodeStack.isEmpty()){

            TreeNode right= nodeStack.pop();
            TreeNode left = nodeStack.pop();

            if(right == null && left == null){
                continue;
            }
            if(left == null || right ==null){
                res =  false;
                break;
            }

            if(!isMatch(left,right)){
                res =  false;
                break;
            }

            nodeStack.push(left.getLeftNode());
            nodeStack.push(right.getRightNode());
            nodeStack.push(left.getRightNode());
            nodeStack.push(right.getLeftNode());
        }

        return res;
    }

    private boolean isMatch(TreeNode left, TreeNode right) {
        return left.getVal() == right.getVal();
    }
}
