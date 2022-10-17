package com.strawbingo.algorithm.sword.ch5;


import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 题41：数据流中的中位数
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序后中间两个数的平均值
 */
public class MedianFinder {

    PriorityQueue<Integer> priorityQueueMin;
    PriorityQueue<Integer> priorityQueueMax;

    public MedianFinder(){
        priorityQueueMin = new PriorityQueue<Integer>((a, b) -> (b - a));
        priorityQueueMax = new PriorityQueue<Integer>();
    }

    public void addNum(int i) {
        if(priorityQueueMin.isEmpty()){
            priorityQueueMin.add(i);
            return;
        }

        if(priorityQueueMin.size() == priorityQueueMax.size()){
            priorityQueueMin.add(i);
        }
        else {
            priorityQueueMax.add(i);
        }

        if(priorityQueueMin.peek() > priorityQueueMax.peek()){
            int tmp = priorityQueueMin.poll();
            priorityQueueMin.add(priorityQueueMax.poll());
            priorityQueueMax.add(tmp);
        }
    }

    public double findMedian() {
        if(priorityQueueMin.size() > priorityQueueMax.size()){
            return priorityQueueMin.peek();
        }
        else {
            return (priorityQueueMin.peek()+priorityQueueMax.peek())/2.0;
        }
    }

    public static void main(String[] args) {

        PriorityQueue priorityQueueMin = new  PriorityQueue<Integer>();
        priorityQueueMin.add(8);
        priorityQueueMin.add(1);
        priorityQueueMin.add(5);
        priorityQueueMin.add(2);
        priorityQueueMin.add(4);
        System.out.println(Arrays.toString(priorityQueueMin.toArray()));

        System.out.println(priorityQueueMin.peek());
        System.out.println(priorityQueueMin.poll());
        System.out.println(priorityQueueMin.poll());
        System.out.println(priorityQueueMin.poll());
        System.out.println(priorityQueueMin.element());
    }
}
