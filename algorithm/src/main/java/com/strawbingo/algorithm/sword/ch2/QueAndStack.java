package com.strawbingo.algorithm.sword.ch2;

import java.util.Stack;

/**
 * 题9：用两个栈实现一个队列
 */
public class QueAndStack {

    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public QueAndStack(){
        inStack = new Stack();
        outStack = new Stack();
    }

    /**
     * 用两个栈实现一个队列。队列声明两个函数appendTail和deleteHead
     * @param item
     */
    public void appendTail(int item) {
        inStack.add(item);
    }

    public int deleteHead() {
        if(!outStack.isEmpty()){
            return outStack.pop();
        }
        else{
            if(inStack.isEmpty()){
                return -1;
            }
            while (!inStack.isEmpty()){
                outStack.add(inStack.pop());
            }

            return outStack.pop();
        }

    }

}
