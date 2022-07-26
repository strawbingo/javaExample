package com.strawbingo.algorithm.cartoon.ch3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


/**
 * 二叉树的遍历
 */
public class BinaryTree {


    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode (int data){
           this.data = data;
        }
    }

    //构造二叉树
    public TreeNode creatBinaryTree(LinkedList<Integer> inputList){
        TreeNode treeNode = null;

        if(inputList == null || inputList.isEmpty()){
            return null;
        }
        Integer root = inputList.removeFirst();

        if(root != null) {
            treeNode = new TreeNode(root);
            treeNode.left = creatBinaryTree(inputList);
            treeNode.right = creatBinaryTree(inputList);
        }

        return treeNode;
    }

    //前续遍历
    public void preOrderTraversal(TreeNode treeNode){
        if(treeNode == null){
//            System.out.println("Null");
            return;
        }

        System.out.println(treeNode.data);
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);


    }

    //中序遍历
    public void inOrderTraversal(TreeNode treeNode){
        if(treeNode == null){
            return;
        }

        inOrderTraversal(treeNode.left);
        System.out.println(treeNode.data);
        inOrderTraversal(treeNode.right);

    }

    //后续遍历
    public void postOrderTraversal(TreeNode treeNode){
        if(treeNode == null){
            return;
        }

        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.println(treeNode.data);
    }

    /**
     * 使用栈进行遍历
     * @param root
     */
    public void preOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode node = root;
        while (node != null || !nodeStack.isEmpty()){

            while (node != null ){
                System.out.println(node.data);
                nodeStack.push(node);
                node = node.left;
            }

            if(!nodeStack.isEmpty()){
                node = nodeStack.pop().right;
            }

        }

    }

    /**
     * 层序遍历
     * @param root
     */
    public void sequenceTraversal(TreeNode root){

        if(root == null){
            return;
        }

        Queue<TreeNode> nodeList = new LinkedList<>();

        nodeList.offer(root);
        while (!nodeList.isEmpty()){
            TreeNode node = nodeList.poll();

            if(node != null) {
                System.out.println(node.data);
            }

            if(node.left != null){
                nodeList.offer(node.left);
            }

            if(node.right != null){
                nodeList.offer(node.right);
            }
        }


    }


}
