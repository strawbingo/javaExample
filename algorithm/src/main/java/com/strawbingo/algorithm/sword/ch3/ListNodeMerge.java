package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题25：合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public class ListNodeMerge {

    /**
     * 迭代
     * @param nodeA1
     * @param nodeB1
     * @return
     */
    public ListNode mergeTwoLists(ListNode nodeA1, ListNode nodeB1) {
        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;

        //all  not null
        while (nodeA1!=null && nodeB1 != null){
//            System.out.println(nodeA1.getVal()+"=="+nodeB1.getVal());
            if(nodeA1.getVal() <= nodeB1.getVal()){
                curr.setNext(nodeA1);
                nodeA1 = nodeA1.getNext();
            }
            else {
                curr.setNext(nodeB1);
                nodeB1 = nodeB1.getNext();
            }
            curr = curr.getNext();
        }

        curr.setNext(nodeA1==null?nodeB1:nodeA1);

        return preHead.getNext();
    }

    /**
     * 递归
     * @param nodeA1
     * @param nodeB1
     * @return
     */
    public ListNode mergeTwoListsRecursion(ListNode nodeA1, ListNode nodeB1) {

        if(nodeA1==null){
            return nodeB1;
        }else if(nodeB1 == null){
            return nodeA1;
        }else  if(nodeA1.getVal()<=nodeB1.getVal()){
             nodeA1.setNext(mergeTwoListsRecursion(nodeA1.getNext(),nodeB1));
             return nodeA1;
        }
        else {
            nodeB1.setNext(mergeTwoListsRecursion(nodeA1,nodeB1.getNext()));
            return nodeB1;
        }

    }
}
