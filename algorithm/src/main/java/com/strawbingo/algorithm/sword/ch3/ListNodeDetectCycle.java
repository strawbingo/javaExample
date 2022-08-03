package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

public class ListNodeDetectCycle {

    public ListNode getEntryPoint(ListNode head) {



        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){
            if(fast.getNext() == null || fast.getNext().getNext()==null){
                return null;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();

//            System.out.println(slow.getVal());
//            System.out.println(slow.getVal()+"=="+fast.getVal());
            //相遇
            if(slow == fast){
                fast  = head;
                while (slow != fast){
                    slow=slow.getNext();
                    fast=fast.getNext();
                }
                return slow;
            }

        }

        return null;
    }

}
