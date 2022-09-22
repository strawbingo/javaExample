package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.*;

/**
 * 题32：从上到下打印二叉树
 */
public class BinaryTreePrint {

    /**
     * 题目一：不分行，从上到下打印二叉树
     * 从上到下打印二叉树的每个节点，同一层的节点按照从左到右的顺序打印
     *      3
     *     / \
     *    4   5
     *   / \
     *  1   2
     */
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];

        List<Integer> ansList = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            TreeNode node = que.poll();
            if(node !=null) {
                ansList.add(node.getVal());
                que.add(node.getLeftNode());
                que.add(node.getRightNode());
            }
        }

        int[] ans = new int[ansList.size()];
        int i = 0;
        for(int tmp:ansList){
            ans[i++] = tmp;
        }

        return ans;
    }

    /**
     * 题目二：分行从上到下打印二叉树
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
     */
    public List<List<Integer>> levelOrderLineFeed(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        //loop one level
        while(!que.isEmpty()){
            //construct level value list and set next level for loop
            List<Integer> levelAns = new ArrayList();
            List<TreeNode> nextLevel = new ArrayList();
            while(!que.isEmpty()){
                TreeNode node = ((LinkedList<TreeNode>) que).pollFirst();
                levelAns.add(node.val);
                if(node.left != null) nextLevel.add(node.left);
                if(node.right != null) nextLevel.add(node.right);
            }

            que.addAll(nextLevel);
            ans.add(levelAns);
            nextLevel.clear();
        }

        return ans;

    }


    /**
     * 题目三：之字形打印二叉树
     * 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印
     */
    public List<List<Integer>> levelOrderZLineFeed(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root ==null) return ans;

        Queue<TreeNode> que = new LinkedList<>();
        boolean z = false;

        que.add(root);
        while (!que.isEmpty()){
//            System.out.println("----"+z);
            int size = que.size();
            List<Integer> level = new ArrayList();
            for (int i = 0; i < size ; i++) {
                int index = i;
                if(z) index = size-i-1;
//                System.out.println(index);
                TreeNode node = ((LinkedList<TreeNode>) que).get(index);

                level.add(node.val);
            }
            for (int i = 0; i < size ; i++) {
                TreeNode node = que.poll();
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            z = !z;
            ans.add(level);
        }


        return ans;
    }

}

