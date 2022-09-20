package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题24：反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 */
public class ListNodeReverse {

    /**
     * 迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.getNext()==null){
            return head;
        }

        ListNode newHead = null;

        ListNode pre,curr=null;
        ListNode pNode = head;
        while (pNode!=null){
            pre = curr;
            curr = pNode;
            pNode = pNode.getNext();

            if(pNode == null){
                newHead = curr;
            }

            curr.setNext(pre);

        }

        return newHead;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseListRecursion(ListNode head) {

        if(head == null || head.getNext()==null){
            return head;
        }

        System.out.println(head.getVal());
        ListNode newHead = reverseListRecursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);

        return newHead;

    }
}
