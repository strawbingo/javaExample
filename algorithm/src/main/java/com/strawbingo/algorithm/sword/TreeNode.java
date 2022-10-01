package com.strawbingo.algorithm.sword;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parentNode;

    public TreeNode(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }

    public void setLeftNode(TreeNode leftNode){
        this.left = leftNode;
    }

    public TreeNode getLeftNode(){
        return this.left;
    }

    public void setRightNode(TreeNode rightNode){
        this.right = rightNode;
    }

    public TreeNode getRightNode(){
        return this.right;
    }

    public void setParentNode(TreeNode parentNode){
        this.parentNode = parentNode;
    }

    public TreeNode getParentNode(){
        return this.parentNode;
    }

}
