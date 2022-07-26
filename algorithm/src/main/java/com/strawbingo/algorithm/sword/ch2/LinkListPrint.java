package com.strawbingo.algorithm.sword.ch2;

import java.util.Stack;

/**
 * 从尾到头打印链表
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

    public class Node{
        String value;
        Node next;

        Node(String value,Node next){
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
