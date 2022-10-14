package com.strawbingo.algorithm.sword.ch4;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.*;

public class BinaryTreeCoder {


    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> que = new LinkedList();
        que.add(root);

        while(!que.isEmpty()){
            TreeNode node = que.poll();
            if(node == null){
                sb.append("null,");
            }
            else {
                sb.append(node.val).append(",");
                que.add(node.left);
                que.add(node.right);

            }
        }

        sb.deleteCharAt(sb.length() - 1);
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


    public TreeNode deserialize(String s) {
        if(s.isEmpty()) return null;
        String[] split = s.split(",");
        Queue<TreeNode> que = new LinkedList();
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        que.add(root);

        List<String> temp = Arrays.asList(split);
        List<String> valueList = new ArrayList(temp);
        valueList.remove(0);
        while (!valueList.isEmpty()){
            TreeNode node = que.poll();
            if(node == null) continue;
//            System.out.println(valueList.size());
            node.left = valueList.get(0).equals("null")?null:new TreeNode(Integer.parseInt(valueList.get(0)));
            que.add(node.left);
            valueList.remove(0);

            if(!valueList.isEmpty()){
                node.right = valueList.get(0).equals("null")?null:new TreeNode(Integer.parseInt(valueList.get(0)));
                que.add(node.right);
                valueList.remove(0);
            }

        }
        return root;
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
        dfs(root);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void dfs(TreeNode root) {
        if(root == null) {
            sb.append("null,");
        }
        else {
            sb.append(root.val).append(",");
            dfs(root.left);
            dfs(root.right);
        }

    }


    int i =0 ;
    public TreeNode deserializeRecur(String s) {
        if(s==null  || s.isEmpty()) return null;
        String[] split = s.split(",");

        TreeNode root = dRecur(split);
        return root;
    }

    private TreeNode dRecur( String[] split) {
        if(i>=split.length || split[i].equals("null")) {
            i++;
            return null;
        }

        TreeNode curr = split[i].equals("null")?null:new TreeNode(Integer.valueOf(split[i]));
        i++;
        curr.left =  dRecur(split);
        curr.right =  dRecur(split);

        return curr;

    }
}
