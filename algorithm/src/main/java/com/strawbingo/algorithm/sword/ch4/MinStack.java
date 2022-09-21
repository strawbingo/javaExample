package com.strawbingo.algorithm.sword.ch4;

import java.util.Stack;

/**
 * 题30：包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数。
 * 在该栈中，调用min，push及pop的时间复杂度为O(1)。
 */
public class MinStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();


    public void push(int x) {
        stack.push(x);
        if( minStack.isEmpty() || x <= minStack.peek() ){
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();
        if(pop == minStack.peek()){
            minStack.pop();
        }
    }

    public int min() {
        return minStack.peek();
    }

    public int top() {
        return stack.peek();
    }
}
