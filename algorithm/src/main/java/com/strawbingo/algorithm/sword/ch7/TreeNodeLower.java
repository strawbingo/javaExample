package com.strawbingo.algorithm.sword.ch7;

import com.strawbingo.algorithm.sword.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 题68：树中两个节点的最低公共祖先

 */
public class TreeNodeLower {

    /**
     *  给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     *  “对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的
     *  祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> listP = new LinkedList<>();
        LinkedList<TreeNode> listQ = new LinkedList<>();

        dfs(root, p, listP);
        dfs(root, q, listQ);

        TreeNode res = null;
        while (listP.size()> 0 && listQ.size()> 0 && listP.peekFirst().val == listQ.peekFirst().val){
            res = listP.pollFirst();
            listQ.pollFirst();
        }
        return res;
    }

    private void dfs(TreeNode root, TreeNode find, LinkedList<TreeNode> list) {
        list.add(root);
        if(root.val == find.val){
            return;
        }else if(find.val < root.val){
            dfs(root.left,find,list);
        }else {
            dfs(root.right,find,list);
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode node = root;

        while (node != null){
            if (p.val < node.val && q.val< node.val){
                node = node.left;
            }
            else if(p.val> node.val && q.val > node.val){
                node = node.right;
            }
            else {
                return node;
            }
        }

        return node;
    }

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     */

    private TreeNode ans;
    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;

        dfs2(root,p,q);

        return ans;
    }

    private boolean dfs2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;

        boolean lson = dfs2(root.left,p,q);
        boolean rson = dfs2(root.right,p,q);

        if((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))){
            ans = root;
        }

        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    private Map<Integer,TreeNode> parent = new HashMap();
    private Map<Integer,TreeNode> visted = new HashMap();

    public TreeNode lowestCommonAncestor4(TreeNode root, TreeNode p, TreeNode q) {
        dfsParent(root);
        parent.put(root.val,null);
        while (p != null){
            visted.put(p.val, parent.get(p.val));
            p = parent.get(p.val);
        }

        while (q != null){
            if(visted.containsKey(q.val)){
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    private void dfsParent(TreeNode root) {
        if(root == null) return;

        if(root.left!=null){
            parent.put(root.left.val,root);
            dfsParent(root.left);
        }
        if(root.right != null){
            parent.put(root.right.val,root);
            dfsParent(root.right);
        }
    }
}
