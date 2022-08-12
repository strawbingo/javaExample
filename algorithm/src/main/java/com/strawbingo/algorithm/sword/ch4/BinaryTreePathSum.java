package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
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

        //check left node ,if not do rec
        if(root != null){
//            Arrays.stream(intList.toArray()).forEach(t -> System.out.print(t+","));
//            System.out.println("root:"+root.getValue());
            int value = root.getValue();
            //if == target ,add to result;
            if(value == target && root.getLeftNode() ==null && root.getRightNode() ==null){

//                System.out.println("match");
                intList.add(value);
//                Arrays.stream(intList.toArray()).forEach(t -> System.out.print(t + ","));
                res.add(new ArrayList(intList));
                intList.remove(intList.size() - 1);
//                System.out.println("match end");

            }

            //if < target, do rec
            else {
                intList.add(value);
                pathSumRecuration(root.getLeftNode(), target-value, intList,res);
                pathSumRecuration(root.getRightNode(), target-value, intList,res);
                intList.remove(intList.size()-1);
            }

        }

    }

}
