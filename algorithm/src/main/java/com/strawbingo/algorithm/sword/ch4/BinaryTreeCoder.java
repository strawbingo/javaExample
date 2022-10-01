package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.*;

public class BinaryTreeCoder {


    public String serialize(TreeNode root) {
        if(root == null) return null;

        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> que = new LinkedList();
        que.push(root);

        //level traversal
        while(!que.isEmpty()){
            TreeNode curr = que.pollFirst();
            sb.append(curr==null?"null":curr.val).append(",");
            if(curr != null){
                que.offer(curr.left);
                que.offer(curr.right);
            }
//            System.out.println("=========");
//            que.stream().forEach(node -> System.out.println(node==null?null:node.val));
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if(data == null || data.equals("")) return null;

        String[] arr = data.split(",");
        TreeNode head = new TreeNode(Integer.valueOf(arr[0]));
        Deque<TreeNode> que = new LinkedList();
        que.push(head);
        int i = 0;
        while(i< arr.length){
            System.out.println(i);
            TreeNode curr = que.pollFirst();
            if(i>=arr.length) break;
            if(curr==null) {
                i++;
                continue;
            }
            i++;
            if(i>=arr.length) break;
            TreeNode left = arr[i].equals("null")?null:new TreeNode(Integer.valueOf(arr[i]));
            i++;
            if(i>=arr.length) break;
            TreeNode right =  arr[i].equals("null")?null:new TreeNode(Integer.valueOf(arr[i]));
            if(curr!=null) {
                curr.left = left;
                curr.right = right;
                if(left!=null) que.offer(left);
                if(right!=null) que.offer(right);
            }
        }
        return head;
    }

}
