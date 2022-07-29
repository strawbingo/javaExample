package com.strawbingo.algorithm.sword;

public class ListNode {

    int val;

    private ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val){
        this.val = val;
    }

}
