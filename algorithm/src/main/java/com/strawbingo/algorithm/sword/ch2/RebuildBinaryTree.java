package com.strawbingo.algorithm.sword.ch2;

import com.strawbingo.algorithm.sword.TreeNode;

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
    int preIndex = 0;
    public TreeNode rebuild(int[] preOrder, int[] inOrder) {
        //check array

//        int preIndex = 0;
        return rebuild(preOrder,inOrder ,0,inOrder.length-1);

    }

    private TreeNode rebuild(int[] preOrder, int[] inOrder,  Integer inLeft,Integer inRight) {
//        System.out.println(preIndex+":"+inLeft+":"+inRight);
        if(inLeft>inRight || preIndex >= preOrder.length){
//            System.out.println("null");
            preIndex--;
            return null;
        }
        if(inLeft == inRight){
            TreeNode node = new TreeNode(preOrder[preIndex]);
//            System.out.println("new node:"+preOrder[preIndex]);
            return  node;
        }

        int rootVal = preOrder[preIndex];
        int mid = -1;
        for (int i = inLeft; i <= inRight ; i++) {
            if(inOrder[i] == rootVal){
                mid = i;
                break;
            }
        }
//        System.out.println("mid:"+mid);
        //build root
        TreeNode node = new TreeNode(rootVal);
//        System.out.println("new node:"+rootVal);
        //build left
        preIndex++;
        TreeNode left = rebuild(preOrder,inOrder,inLeft,mid-1);
        node.left = left;
        //build right
        preIndex++;
        TreeNode right = rebuild(preOrder,inOrder,mid+1,inRight);


        node.right = right;

        return node;
    }

}
