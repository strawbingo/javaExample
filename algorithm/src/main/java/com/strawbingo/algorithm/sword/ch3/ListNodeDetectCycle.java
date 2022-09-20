package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题23：链表中环的入口点给定一个链表，返回链表开始入环的第一个节点。
 * 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。
 * 如果链表无环，则返回 null。如果一个链表中包含环，如何找出环的入口节点？
 */
public class ListNodeDetectCycle {

    public ListNode getEntryPoint(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;


        while (fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null) return null;
        slow = head;

        while (fast!= null && fast.next !=null){
            if(fast == slow){
                break;
            }

            fast = fast.next;
            slow = slow.next;


        }

        return slow;
    }

}
