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

        List<Integer> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            TreeNode node = que.poll();
            if(node !=null) {
                arr.add(node.getVal());
                que.add(node.getLeftNode());
                que.add(node.getRightNode());
            }
        }

        int[] res = new int[arr.size()];
        int i = 0;
        for(int tmp:arr){
            res[i++] = tmp;
        }

        return res;
    }

    /**
     * 题目二：分行从上到下打印二叉树
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
     */
    public List<List<Integer>> levelOrderLineFeed(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> que = new LinkedList<>();
        Queue<TreeNode> queTmp = new LinkedList<>();
        que.add(root);
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        //que is not null
        List<Integer> inner = new ArrayList<>();
        while (!que.isEmpty()){
            TreeNode node = que.poll();
            inner.add(node.getVal());
            if(node.getLeftNode()!= null) queTmp.add(node.getLeftNode());
            if(node.getRightNode() !=null) queTmp.add(node.getRightNode());

            //que is null and tmp is not null
            if(que.isEmpty()){
                res.add(inner);
                inner = new ArrayList<>();
                while (!queTmp.isEmpty())
                    que.add(queTmp.poll());
                }
            }

        return res;

    }


    /**
     * 题目三：之字形打印二叉树
     * 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印
     */
    public List<List<Integer>> levelOrderZLineFeed(TreeNode root) {
        if(root == null) return new ArrayList<>();
        //

        Queue<TreeNode> que = new ArrayDeque();
        que.add(root);
        boolean z = true;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //if stack is not null print order
        while (!que.isEmpty()) {
            int forSize = que.size();
            //loop print
            Deque<Integer> inner = new LinkedList<>();
            for(int i=0; i<forSize; i++){
                TreeNode node = que.poll();
                if(z){
                    inner.addLast(node.getVal());
                }else {
                    inner.addFirst(node.getVal());
                }
                if(node.getLeftNode() != null) que.add(node.getLeftNode());
                if(node.getRightNode() != null)  que.add(node.getRightNode());
            }
            res.add(new ArrayList<>(inner));
            z = !z;
        }

        return res;
    }

}

