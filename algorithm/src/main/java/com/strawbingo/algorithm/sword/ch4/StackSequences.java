package com.strawbingo.algorithm.sword.ch4;

import java.util.Stack;

/**
 * 题31：栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的亚述顺序，请判断第二个序列是否为该栈的弹出序列
 *
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 */
public class StackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length != popped.length){
            return false;
        }
        Stack stack = new Stack();
        int j=0;

        for(int i = 0; i< pushed.length; i++){
            stack.push(pushed[i]);
//            System.out.println(pushed[i] +"="+popped[j]);
            while ( !stack.isEmpty() && (int)stack.peek() == popped[j]){
                stack.pop();
                j++;
//                System.out.println(stack.peek()+"==="+j);
            }
        }

       return stack.isEmpty();
    }

}
