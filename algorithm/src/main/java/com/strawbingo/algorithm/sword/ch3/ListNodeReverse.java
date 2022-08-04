package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

public class ListNodeReverse {

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
