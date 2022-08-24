package com.strawbingo.algorithm.sword.ch5;


import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 题41：数据流中的中位数
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序后中间两个数的平均值
 */
public class MedianFinder {

    PriorityQueue priorityQueueMin;
    PriorityQueue priorityQueueMax;

    public MedianFinder(){
        priorityQueueMin = new  PriorityQueue<Integer>((a, b) -> (b - a));
        priorityQueueMax = new  PriorityQueue<Integer>((a, b) -> (a - b));
    }

    public void addNum(int i) {
        if(priorityQueueMin.size() == 0) {
            priorityQueueMin.add(i);
            return;
        }

        //add to min
        if(priorityQueueMin.size() -1 < priorityQueueMax.size()){
           if(i< Integer.valueOf(priorityQueueMax.peek().toString())){
               priorityQueueMin.add(i);
           }
           else {
               priorityQueueMin.add(priorityQueueMax.poll());
               priorityQueueMax.add(i);
           }
        }
        else {
            if(i> Integer.valueOf(priorityQueueMin.peek().toString())) {
                priorityQueueMax.add(i);
            }
            else {
                priorityQueueMax.add(priorityQueueMin.poll());
                priorityQueueMin.add(i);
            }
        }
//        System.out.println("input:"+i);
//        System.out.println(Arrays.toString(priorityQueueMin.toArray()));
//        System.out.println(Arrays.toString(priorityQueueMax.toArray()));

    }

    public Double findMedian() {
        if(priorityQueueMax.size() < priorityQueueMin.size()){
            return Double.valueOf(priorityQueueMin.peek().toString());
        }
        else if(priorityQueueMax.size() > priorityQueueMin.size()){
            return Double.valueOf(priorityQueueMax.peek().toString());
        }else {
            return  (Double.valueOf(priorityQueueMin.peek().toString())+
                    Double.valueOf(priorityQueueMax.peek().toString()))/2;
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
