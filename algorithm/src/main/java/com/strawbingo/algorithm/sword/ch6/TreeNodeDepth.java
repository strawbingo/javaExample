package com.strawbingo.algorithm.sword.ch6;

import com.strawbingo.algorithm.sword.TreeNode;


/**
 * 题55：二叉搜索树的深度
 */
public class TreeNodeDepth {

    int maxDepth = 0;
    /**
     * 题目一：二叉树的深度
     * 输入一棵二叉树的根节点，求该树的深度。
     * 从根节点到叶节点一次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度
     */
    public int maxDepth(TreeNode root) {
//        maxDepth = 0;

        dfs(root,0);

        return maxDepth;
    }

    /**
     * 官网方法
     * @param root
     * @return
     */
    public int getMaxDepth2(TreeNode root){
        if(root == null){
            return 0;
        }
        else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth,rightDepth)+1;
        }
    }


    private void dfs(TreeNode root, int currDepth) {
        if(root == null) return;

        currDepth++;
        maxDepth = maxDepth<currDepth? currDepth: maxDepth;
        dfs(root.left,currDepth);
        dfs(root.right,currDepth);


    }

    /**
     * 题目二：平衡二叉树
     * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
     * 如果某二叉树中任意节点的左、右子树的深度相差不超过1，那么它就是一棵平衡二叉树
     */
    private boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        dfsB(root);
        return isBalanced;

    }

    private int dfsB(TreeNode root) {
        if(root == null){
            return 0;
        }
        else {
            int left = dfsB(root.left);
            int right = dfsB(root.right);
            if(Math.abs(left - right) >1 ){
                isBalanced = false;
                return 0;
            }
            return Math.max(left,right) + 1;

        }

    }

}
