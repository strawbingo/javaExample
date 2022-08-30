package com.strawbingo.algorithm.sword.ch6;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题54：二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class TreeNodeKthLargest {

    int res, k;
    public int kthLargest(TreeNode root,int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if(root ==null) return ;
        dfs(root.right);
        if (k == 1) {
            k --;
            res = root.val;
            return;
        }else {
            k--;
        }
        dfs(root.left);
    }

}
