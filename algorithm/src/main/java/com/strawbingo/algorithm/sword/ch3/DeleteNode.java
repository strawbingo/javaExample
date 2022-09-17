package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题18：删除链表的节点
 */
public class DeleteNode {

    /**
     * 在O(1)时间内删除链表节点。给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间内删除该节点
     * 4 5 1 9
     */
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val  == val) return head.next;
        ListNode pre = head;
        ListNode curr = head.next;

        while(curr != null){
            if(curr.val == val){
                pre.next = curr.next;
                break;
            }
            pre = curr;
            curr = curr.next;
        }
        return head;
    }

    /**
     * 删除链表中重复的节点。在一个排序的链表中，如何删除重复的节点？
     * @param head
     * @return
     */
    public ListNode deleteDuplicateNode(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr!= null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }

        return head;
    }
}
