package com.strawbingo.algorithm.cartoon.ch5;

/**
 * 链表是否有环
 */
public class CycleLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }


    }

    public static boolean isCycle(Node head) {
        if(head == null || head.next ==null){
            return false;
        }

        boolean isCycle = false;
        Node p1 = head;
        Node p2 = head;

        while (p2 != null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;

            if(p1==p2){
                isCycle=true;
                break;
            }
        }

        return isCycle;
    }

    public static Node enterCycle(Node head){
        Node p1 = head;
        Node p2 = head;


        while (p2 != null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;

            if(p1==p2){
                break;
            }
        }

        p1 = head;

        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;

        }

        return p1;
    }
}
