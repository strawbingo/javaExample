package com.strawbingo.algorithm.sword;

public class TreeNode {

    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parentNode;

    public TreeNode(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setLeftNode(TreeNode leffNode){
        this.leftNode = leffNode;
    }

    public TreeNode getLeftNode(){
        return this.leftNode;
    }

    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }

    public TreeNode getRightNode(){
        return this.rightNode;
    }

    public void setParentNode(TreeNode parentNode){
        this.parentNode = parentNode;
    }

    public TreeNode getParentNode(){
        return this.parentNode;
    }

}
