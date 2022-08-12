package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathSum {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> intList = new ArrayList<>();
        pathSumRecuration(root, target, intList,res);

        return res;
    }

    private void pathSumRecuration(TreeNode root, int target,
              List<Integer> intList, List<List<Integer>> res) {

        //check root is null
        if(root == null) {
            return;
        }
        int value = root.getValue();
        intList.add(value);
        //if == target ,add to result;

        if(value == target && root.getLeftNode() ==null && root.getRightNode() ==null){
            res.add(new ArrayList(intList));
        }
        // do rec
        pathSumRecuration(root.getLeftNode(), target-value, intList,res);
        pathSumRecuration(root.getRightNode(), target-value, intList,res);
        intList.remove(intList.size()-1);

    }

}
