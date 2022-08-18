package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeCoder {

    private String s = "";


    public String serialize(TreeNode root) {
        if (root == null) return "[]";

        dfs(root);

        return "["+s.substring(0,s.length()-1)+"]";
    }

    private void dfs(TreeNode root) {
        if(root == null) {
            s = s+"null,";
            return;
        }

        s= s+ root.val+",";
        dfs(root.left);
        dfs(root.right);

    }

    public TreeNode deserialize(String s) {
        List split = new LinkedList(Arrays.asList(s.substring(1, s.length() - 1).split(",")));

        return  rdfs(split);

    }

    private TreeNode rdfs(List split) {
        if (split.size() == 0 ) return  null;

        if("null".equals(split.get(0) )){
            split.remove(0);
            return null;
        }

        System.out.println(split.get(0));
        TreeNode root = new TreeNode(Integer.valueOf(split.get(0).toString()));
        split.remove(0);
        root.left = rdfs(split);
        root.right = rdfs(split);

        return root;

    }


}
