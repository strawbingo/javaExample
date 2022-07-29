package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

public class DeleteNode {

    public ListNode deleteNode(ListNode head, int i) {
        ListNode curr = head;

        if (head == null) {
            return null;
        }

        //如果删除的是头结点
        if (head.getVal() == i) {
            return head.getNext();
        }

        while(curr != null){

            if (curr.getNext().getVal() !=i){
                curr = curr.getNext();
            }
            //if next.val is the target
            else {
                //my code
                //if next.next is not end node
//                if(curr.getNext().getNext() != null) {
////                    curr.getNext().setVal(curr.getNext().getNext().getVal());
//                    curr.setNext(curr.getNext().getNext());
//                }
//                else {
//                    curr.setNext( null);
//                }

                // no2
                if(curr.getNext() != null){
                    curr.setNext(curr.getNext().getNext());
                }

                return head;
            }

        }

        return head;
    }

}
