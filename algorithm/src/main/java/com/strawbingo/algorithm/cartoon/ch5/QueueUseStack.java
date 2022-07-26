package com.strawbingo.algorithm.cartoon.ch5;

import java.util.Stack;

public class QueueUseStack<T> {

    Stack<T> mainStack ;
    Stack<T> popStack ;


//    private QueueUseStack queueUseStack = new QueueUseStack();
    public QueueUseStack(){
        mainStack = new Stack<>();
        popStack =new Stack<>();
    }

   /* public QueueUseStack newInstance(){

        mainStack = new Stack<>();
        popStack =new Stack<>();
        return queueUseStack;

    }*/

    public void push(T t) {
        mainStack.push(t);
    }

    public T pop() throws Exception {
        if(!popStack.empty()){
            return popStack.pop();
        }

        while (!mainStack.empty()){
            popStack.push(mainStack.pop());
        }

        if(!popStack.empty()){
            return popStack.pop();
        }
        else {
            throw new Exception("Queue is empty!");
        }

    }

}
