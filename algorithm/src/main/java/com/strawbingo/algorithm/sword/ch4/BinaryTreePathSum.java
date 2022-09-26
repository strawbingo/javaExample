package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class BinaryTreePathSum {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> pathList = new ArrayList();
        Deque<Integer> path  = new LinkedList<>();
        pathSum(pathList,path,root,target);

        return pathList;
    }

    void pathSum(List<List<Integer>> pathList,Deque<Integer> path,TreeNode root,int target){
        if(root == null) return;
        target = target - root.val;


        path.offerLast(root.val);

        // no chile
        if(root.right == null && root.left == null){
            if(target == 0) {
//                System.out.println("-------");
//                path.stream().forEach(x -> System.out.println(x));
                pathList.add(new ArrayList<>(path));
            }
        } else {

            pathSum(pathList,path,root.left,target);
            pathSum(pathList,path,root.right,target);

        }

        path.pollLast();
    }

}
