package com.strawbingo.algorithm.sword.ch5;

import com.strawbingo.algorithm.sword.ListNode;

/**
 * 题52：两个链表的第一个公共节点
 * 输入如两个链表，找出它们的第一个公共节点
 */
public class ListNodeIntersectionNode {

    public ListNode getIntersectionNode( ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;
        ListNode currNode= headA;
        while (currNode != null){
            countA++;
            currNode = currNode.getNext();
        }

        currNode = headB;
        while (currNode != null){
            countB++;
            currNode = currNode.getNext();
        }

        int minusA = 0,minusB=0;
        if(countA > countB){
            minusA = countA - countB;
        }
        else {
            minusB = countB - countA;
        }

        while (minusA > 0){
            minusA--;
            headA = headA.getNext();
        }
        while (minusB>0){
            minusB--;
            headB = headB.getNext();
        }

        ListNode res = null;
        while (headA != null && headB != null){
            if(headA == headB){
                res = headA;
                break;
            }
            headA = headA.getNext();
            headB = headB.getNext();
        }

        return  res;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB ==null) return null;

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null? headB: pA.getNext();
            pB = pB == null? headA: pB.getNext();
        }
        return pA;
    }
}
