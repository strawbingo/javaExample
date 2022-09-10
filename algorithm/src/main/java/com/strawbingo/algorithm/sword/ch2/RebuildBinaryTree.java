package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.Arrays;

/**
 * 题7：重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class RebuildBinaryTree {

    /**
     *       3
     *   2       8
     * 9   10      4
     *
     *  int[] preOrder = {3, 2, 9, 10, 8 ,4};
     *  int[] inOrder =  {9, 2 ,10 ,3 , 8, 4};
     */

    public static TreeNode rebulid(int[] preOrder, int[] inOrder) {
        //check array
        try {
            return rebuildTreeNode(preOrder, inOrder);
        } catch (Exception e) {
            return null;
        }
    }

    private static TreeNode rebuildTreeNode(int[] preOrder, int[] inOrder) throws Exception {
        if(preOrder == null || inOrder == null){
            return null;
        }

        if(preOrder[preOrder.length-1] != inOrder[inOrder.length-1]){
            throw new Exception("invailied input");
        }
        System.out.println(Arrays.toString(preOrder)+":"+Arrays.toString(inOrder));
        //create Node
        TreeNode treeNode = new TreeNode(preOrder[0]);

        int index=0;
        for(int i=0;i <inOrder.length; i++){
            if(inOrder[i] == preOrder[0]){
                index = i;
            }
        }

        if(index == preOrder.length-1){
            return treeNode;
        }
//        if(preOrder[index]!=)

        //create leftNode
        TreeNode leftNode = rebulid(Arrays.copyOfRange(preOrder,1,index+1),
                Arrays.copyOfRange(inOrder,0,index));
        treeNode.setLeftNode(leftNode);

        //create rightNode

        TreeNode rightNode = rebulid(Arrays.copyOfRange(preOrder,index+1,preOrder.length),
                Arrays.copyOfRange(inOrder,index+1,inOrder.length));
        treeNode.setRightNode(rightNode);


        return treeNode;
    }


}
