package com.strawbingo.algorithm.sword.ch2;

import java.util.Stack;

public class QueAndStack {

    static Stack inStack = new Stack();
    static Stack outStack = new Stack();

    /**
     * 用两个栈实现一个队列。队列声明两个函数appendTail和deleteHead
     * @param item
     */
    public static void appendTail(String item) {
        inStack.push(item);
    }

    public static String deleteHead() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }

        if(outStack.isEmpty()){
            return null;
        }
        return (String) outStack.pop();
    }

}
