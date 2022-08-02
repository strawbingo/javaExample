package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

import java.util.Stack;

public class ListNodeKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> listNodes = new Stack<>();
        while(head != null){
            listNodes.push(head);
            head = head.getNext();
        }

        ListNode pop=null;
        for(int i=1; i<k+1; i++){
            System.out.println(i+"=i===node size="+listNodes.size());
            if (listNodes.isEmpty()){
                return null;
            }
            pop = listNodes.pop();

        }
        System.out.println(pop);
        return pop;
    }

    public ListNode getKthFromEndFastSlowPoint(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        while(k>0 ){
            if(fast==null){
                return null;
            }
            fast=fast.getNext();
            k--;
        }

        while(fast != null){
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return slow;
    }
}
