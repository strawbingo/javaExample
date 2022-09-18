package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import com.strawbingo.algorithm.sword.ch4.LinkNodeCopy;

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
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            if(fast == null) return null;
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
