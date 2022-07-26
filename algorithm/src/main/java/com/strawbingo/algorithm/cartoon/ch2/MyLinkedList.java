package com.strawbingo.algorithm.cartoon.ch2;


/**
 * 链表的实现
 */
public class MyLinkedList {

    //first Node
    private Node head;

    //last Node
    private Node last;

    //list size
    private int size;

    public void link(int i) {
        Node node = getNode(size - 1);
        Node nodeBefore = getNode(i);
        node.next = nodeBefore;
    }

    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }


    public void insertNode(int data,int index){

        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("out of range");
        }

        Node insertNode = new Node(data);

        if (size == 0){
            head = insertNode;
            last = insertNode;
        }else if (index == 0){
            insertNode.next = head;
            head = insertNode;
        }else if(index == size){
            last.next = insertNode;
            last = insertNode;
        }else {
            Node preNode = getNode(index - 1);
            insertNode.next = preNode.next;
            preNode.next = insertNode;
        }

        size++;
    }

    public Node removeNode(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("remove out of range");
        }

        Node removeNode;
        if (index == 0){
            removeNode = head;
            head = head.next;
        }else if(index == size-1){
            Node preNode = getNode(index-1);
            removeNode = preNode.next;
            preNode.next = null;
            last = preNode;
        }
        else {
            Node preNode = getNode(index-1);
            removeNode = preNode.next;
            preNode.next = removeNode.next;
        }

        size--;
        return removeNode;
    }

    public Node getNode(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("out of range");
        }

        Node currNode = head;
        for (int i=0; i<index; i++){
            currNode = currNode.next;
        }

        return currNode;
    }

    public void output(){

        Node currNode = head;
        while (currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }


    public boolean isCycle(){
        boolean isCycle = false;

        Node p1 = head;
        Node p2 = head;
        while(p1.next != null && p2.next.next!= null){
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 ==p2){
                isCycle = true;
                break;
            }
        }

        return isCycle;
    }
}
