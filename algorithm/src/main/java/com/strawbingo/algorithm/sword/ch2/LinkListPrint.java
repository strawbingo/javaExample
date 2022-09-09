package com.strawbingo.algorithm.sword.ch2;

import java.util.Stack;

/**
 * 题6：从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class LinkListPrint {

    public void printFromEnd(Node node) {

        if(node.next != null){
            printFromEnd(node.getNext());
        }
        System.out.println(node.value);

    }

    public void printFromEndWithStack(Node node) {
        System.out.println("in method printFromEndWithStack");
        Stack<Node> nodes = new Stack<>();
        Node  curNode = node;
        while (curNode != null){
            nodes.push(curNode);
            curNode = curNode.getNext();
        }

        while(!nodes.empty()){
            System.out.println(nodes.pop().value);
        }


    }

    private int size =0;
    int ans[] ;
    public int[] reversePrint(Node head) {

        dfs(head);

        return ans;
    }

    private void dfs(Node head) {
        if (head == null){
            ans = new int[size];
            size = 0;
            return;
        }
        size++;
        dfs(head.next);
        ans[size++] = head.value;

    }

    public static class Node{
        int value;
        Node next;

        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        public void setNext(Node node){
            this.next = node;
        }

        public Node getNext(){
            return next;
        }
    }

}
