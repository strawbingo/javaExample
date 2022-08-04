package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

public class ListNodeMerge {

    public ListNode mergeTwoLists(ListNode nodeA1, ListNode nodeB1) {
        ListNode head = null;
        ListNode curr = null;

        if(nodeA1 == null){
            return nodeB1;
        }

        while (nodeA1!=null || nodeB1 !=null){

            //all  not null
            if(nodeA1!=null && nodeB1 != null){
                System.out.println(nodeA1.getVal()+"=="+nodeB1.getVal());
                if(nodeA1.getVal() <= nodeB1.getVal()){
                    if(head == null) {
                        head = nodeA1;
                        curr = head;
                    }
                    else {
                        curr.setNext(nodeA1);
                        curr = curr.getNext();
                    }
                    nodeA1 = nodeA1.getNext();
                }
                else {
                    if(head == null) {
                        head = nodeB1;
                        curr = head;
                    }
                    else {
                        curr.setNext(nodeB1);
                        curr = curr.getNext();
                    }
                    nodeB1 = nodeB1.getNext();
                }


            }else if(nodeA1 != null){
                if(curr != null) {
                    curr.setNext(nodeA1);
                }
                else {
                    head = nodeA1;
                }
                break;
            }
            else {
                if (curr != null) {
                    curr.setNext(nodeB1);
                }
                else {
                    head = nodeB1;
                }
                break;
            }


        }

        return head;
    }

}
