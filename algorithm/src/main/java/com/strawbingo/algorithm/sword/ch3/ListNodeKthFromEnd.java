package com.strawbingo.algorithm.sword.ch3;

import com.strawbingo.algorithm.sword.ListNode;
import com.strawbingo.algorithm.sword.ch4.LinkNodeCopy;

import java.util.Stack;

/**
 * 题22：链表中倒数第K个节点
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了复合大多数人的习惯，本题从1开始计数，即链表尾节点是倒数第一个节点。
 * 例1、2、3、4、5、6，倒数第3个节点为4节点
 */
public class ListNodeKthFromEnd {

    /**
     * 堆栈
     * @param head
     * @param k
     * @return
     */
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

    /**
     * 快慢指针法
     * @param head
     * @param k
     * @return
     */
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
