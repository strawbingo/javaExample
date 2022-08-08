package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.TreeNode;

/**
 * 题26：树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4 
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 */

public class TreeNodeSubStructure {

    public boolean isSubStructure(TreeNode parent, TreeNode sub) {
        if(parent == null) return false;
        if(sub == null) return false;

        return recur(parent, sub)||isSubStructure(parent.getLeftNode(),sub)
                ||isSubStructure(parent.getRightNode(),sub);


    }

    private boolean recur(TreeNode parent, TreeNode sub) {
        if(sub == null){
            return true;
        }

        if(parent == null){
            return false;
        }

        //compare curr with sub
        //if equals,check left and right
        if(parent.getValue() == sub.getValue()){
            return recur(parent.getLeftNode(),sub.getLeftNode())
                    && recur(parent.getRightNode(),sub.getRightNode());
        }
        //else, check left or right, no sub root
        else {
            return  false;
        }
    }

}
