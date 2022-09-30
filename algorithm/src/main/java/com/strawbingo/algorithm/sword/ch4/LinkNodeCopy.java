package com.strawbingo.algorithm.sword.ch4;

/**
 * 题35：复杂链表的复制
 * 请实现函数ComplexListNode*Clone（ComplexListNode*pHead），复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个m_pNext指针指向下一个节点，还有一个m_pSilbling指针指向链表中的任意节点或者nullptr
 */
public class LinkNodeCopy {

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head;
        //copy node and appen to resource;
        while (curr != null) {
//            System.out.println("a"+curr.val);
            //copy curr node
            Node newNode = new Node(curr.val);

            //link to resource node ,next is resource next
            newNode.next = curr.next;
            curr.next = newNode;

            //move to next copy node
            curr = newNode.next;
        }

        //link random link
        curr = head;
        while(curr!=null){
//            System.out.println("b"+curr.val);
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //split to 2 LinkNode
        //[[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node res = head.next;

        Node currHead = head;
        while (currHead!=null){
            Node nodeNew = currHead.next;
            currHead.next = currHead.next.next;
            nodeNew.next = nodeNew.next != null? nodeNew.next.next: null;

            currHead = currHead.next;
        }

//        curr = res;
//        while (curr!=null){
//            System.out.println(curr+"curr = "+curr.val);
//            if(curr.random!=null) System.out.println("ram="+curr.random.val);
//            curr = curr.next;
//        }
//        System.out.println(curr+"=========");
//
//        curr = head;
//        while (curr!=null){
//            System.out.println(curr+"curr = "+curr.val);
//            if(curr.random!=null) System.out.println("ram="+curr.random.val);
//            curr = curr.next;
//        }

        return res;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}