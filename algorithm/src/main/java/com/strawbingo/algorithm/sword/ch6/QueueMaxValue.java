package com.strawbingo.algorithm.sword.ch6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 题59：队列的最大值
 *
 */
public class QueueMaxValue {

    /**
     * 题目一：滑动窗口的最大值
     * 给定一个数组和滑动窗口的大小，请找出所有滑动窗口里的最大值。
     * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，它们的最大值分别为{4,4,6,6,6,5}
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        LinkedList<Integer> numList = new LinkedList<>();

        for (int i = 0; i < nums.length ; i++) {

//            System.out.println("be:"+numList.toString());

            while (numList.size()>0 && nums[numList.peekLast()] <= nums[i]){
                numList.removeLast();
            }

            numList.add(i);
//

            if(i - numList.peekFirst() + 1 >k){
                numList.removeFirst();
            }

//            while (numList.size()> 1 && nums[numList.peekFirst()] <= nums[numList.peekLast()] ) {
//                numList.removeFirst();
//            }

            if(i  >= k-1){

                    res[i-k+1] =  nums[numList.peekFirst()];


            }

//            System.out.println(numList.toString());
        }

//        System.out.println(Arrays.toString(res));
        return res;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        // 窗口个数
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        // 遍历数组中元素，right表示滑动窗口右边界
        for(int right = 0; right < nums.length; right++) {
            // 如果队列不为空且当前考察元素大于等于队尾元素，则将队尾元素移除。
            // 直到，队列为空或当前考察元素小于新的队尾元素
            while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            // 存储元素下标
            queue.addLast(right);

            // 计算窗口左侧边界
            int left = right - k +1;
            // 当队首元素的下标小于滑动窗口左侧边界left时
            // 表示队首元素已经不再滑动窗口内，因此将其从队首移除
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }

            // 由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时
            // 意味着窗口形成。此时，队首元素就是该窗口内的最大值
            if (right +1 >= k) {
                res[left] = nums[queue.peekFirst()];
            }

            System.out.println(queue.toString());
        }
        return res;
    }


    /**
     * 题目二：队列的最大值
     * 请定义一个队列并实现函数max得到队列里的最大值，要求函数max、push_back和pop_front的时间复杂度都是O(1)
     */

    LinkedList<Integer> numQueue = new LinkedList<>();
    LinkedList<Integer> maxQueue = new LinkedList<>();

    public int max_value() {
        if(numQueue.isEmpty()) return -1;
//        System.out.println(maxQueue.toString());
        return maxQueue.peekFirst();
    }

    public void push_back(int value) {
        numQueue.add(value);

        pushMax(value);
    }

    private void pushMax(int value) {
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value){
            maxQueue.pollLast();
        }

        maxQueue.add(value);
//        System.out.println("max:"+maxQueue);
    }

    public int pop_front() {
        if(numQueue.isEmpty()) return -1;
        if(maxQueue.peekFirst().equals(numQueue.peekFirst())){
            maxQueue.pollFirst();
        }
        return numQueue.pollFirst();
    }

}
