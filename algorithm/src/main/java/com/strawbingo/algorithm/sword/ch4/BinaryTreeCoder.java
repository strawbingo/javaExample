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

    public String serializeLeetCode1(TreeNode root) {
        if(root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList() {{ add(root); }};
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }


    public TreeNode deserialize(String data) {
        if(data == null || data.equals("")) return null;

        String[] arr = data.split(",");
        TreeNode head = new TreeNode(Integer.valueOf(arr[0]));
        Deque<TreeNode> que = new LinkedList();
        que.push(head);
        int i = 1;
        while(!que.isEmpty()){
//            System.out.println(i);
            TreeNode curr = que.pollFirst();

            if(!arr[i].equals("null")) {
                curr.left= new TreeNode(Integer.valueOf(arr[i]));
                que.offer(curr.left);
            }
            i++;

            if(!arr[i].equals("null")) {
                curr.right = arr[i].equals("null") ? null : new TreeNode(Integer.valueOf(arr[i]));
                que.offer(curr.right);
            }
            i++;
        }
        return head;
    }

    StringBuilder sb;
    /**
     *
     * @param root
     * @return
     */
    public String serializeRecur(TreeNode root) {
        if(root == null) return null;
        sb = new StringBuilder();
        sb.append(root==null?"null":root.val).append(",");
        dfs(root);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void dfs(TreeNode root) {

        sb.append(root.left==null?"null":root.left.val).append(",");
        sb.append(root.right==null?"null":root.right.val).append(",");

        if(root.left!=null) dfs(root.left);
        if(root.right!=null) dfs(root.right);
    }


    int i =0 ;
    public TreeNode deserializeRecur(String s) {
        if(s==null || s.length()==0) return  null;
        String[] split = s.split(",");
        TreeNode head = new TreeNode(Integer.parseInt(split[0]));
        i++;
        dRecur(head,split);
        return head;
    }

    private void dRecur(TreeNode curr, String[] split) {
        if(curr==null) return;

        if(!split[i].equals("null")){
            curr.left = new TreeNode(Integer.parseInt(split[i]));
        }
        i++;
        if(!split[i].equals("null")){
            curr.right = new TreeNode(Integer.parseInt(split[i]));
        }
        i++;
        dRecur(curr.left,split);
        dRecur(curr.right,split);
    }
}
