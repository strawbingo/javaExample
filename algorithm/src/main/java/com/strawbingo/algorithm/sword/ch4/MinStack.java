package com.strawbingo.algorithm.sword.ch4;

import java.util.Stack;

public class MinStack {
    Stack stack = new Stack();
    Stack minStack = new Stack();


    public void push(int t) {
        stack.push(t);
        if( minStack.isEmpty() || t <= (Integer) minStack.peek() ){
            minStack.push(t);
        }
    }

    public void pop() {
        int pop = (int)stack.pop();
        if(pop == (int)minStack.peek()){
            minStack.pop();
        }
    }

    public int min() {
        return (int)minStack.peek();
    }

    public int top() {
        return (int)stack.peek();
    }
}
