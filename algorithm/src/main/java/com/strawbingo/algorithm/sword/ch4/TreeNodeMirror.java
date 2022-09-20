package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题27：二叉树的镜像
 * 请完成一个函数，输入一棵二叉树，该函数输出它的镜像
 */
public class TreeNodeMirror {

    /**
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {

        if(root == null){
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }


}
