package com.strawbingo.algorithm.cartoon.ch5;

import java.util.Stack;

/**
 * 实现一个栈，该栈带有出栈（pop）、入栈（push）、取最小元素（getMIn）3个方法，保证这三个方法的诗句复杂度都是O(1)
 */
public class MinimumStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int i) {
        mainStack.push(i);
        if(minStack.empty() || i < minStack.peek()){
            minStack.push(i);
        }
    }

    public int getMin() {
        return minStack.peek();
    }

    public int pop() throws Exception {
        if(mainStack.isEmpty()){
            throw new Exception("Stack is empty");
        }

        int popValue = mainStack.pop();
        if(popValue == minStack.peek()){
            minStack.pop();
        }

        return popValue;
    }
}
