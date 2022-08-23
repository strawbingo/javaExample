package com.strawbingo.algorithm.sword.ch5;

import java.util.Arrays;

/**
 * 题39：数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。2出现5次，输出2
 */
public class MajorityElement {

    /**
     * 基于Partition函数的时间复杂度为O(n)的算法
     */
    public int MajorityElementByPartition(int[] nums) {
        int target = nums.length /2;

        sort(nums,target,0,nums.length-1);

        return nums[target];
    }

    private int sort(int[] nums,int target,int start, int end){

        int index = partion(nums,start,end);
        if(index< target){
            return sort(nums,target, index+1, end);
        }
        else if(index > target){
            return sort(nums,target, start, index - 1);
        }
        else {
            return index;
        }
    }

    private int partion(int[] nums,int start, int end) {
        int temp = nums[start];

        while (start < end){
            while (start<end && temp <= nums[end] ) end--;
            nums[start] = nums[end];
            while (start<end && nums[start] <= temp) start++;
            nums[end] = nums[start];
        }

        nums[start] = temp;

        return start;
    }



    /**
     * 解法二：根据数组特点找出时间复杂度为O(n)的算法
     */
    public int MajorityElement(int[] nums) {
        int res = 0;
        int times = 0;
        for(int i=0; i< nums.length; i++){
            if(times == 0){
                res = nums[i];
                times++;
            }
            else if(res == nums[i]){
                times++;
            }
            else {
                times--;
            }
        }

        return res;
    }

    /**
     * 在看剑指offer里的partition代码时，有些卡，这里注解一下。
     * https://blog.csdn.net/paoxungan5156/article/details/104566645
     * @param nums
     * @param length
     * @param start
     * @param end
     * @return
     */
    private int partionDemo(int[] nums, int length, int start, int end) {

        int small = start-1;
        for(int i = start; i < end ; i++){
            if(nums[i] < nums[end]){
                small++;
                if(small != i){
                    int tmp = nums[i];
                    nums[i] = nums[small];
                    nums[small] = tmp;
                }
            }
        }

        small++;
        int tmp = nums[small];
        nums[small] = nums[end];
        nums[end] = tmp;

        return small;
    }

    private int partitionDemo2(int[] data, int start, int end) throws Exception {
        if(data==null||data.length<=0||start<0||end>=data.length)
            throw new Exception("Invalid Parameters");

        int temp=data[start];  // 保存标准元素
        int i=start;
        int j=end;
        while(i<j){
            while(i<j&&temp<=data[j]) j--;
            while(i<j&&data[i]<=temp) i++;

            if(i<j){
                int tmp = data[j];
                data[j] = data[i];
                data[i]=tmp;
            }

        }
        data[start] = data[i];
        data[i]=temp;
        System.out.println(start+"=="+end+"=="+i+"==="+j);
        System.out.println(Arrays.toString(data));
        return i;
    }

    /**
     * https://blog.csdn.net/weixin_44386939/article/details/119278025
     * @param arr
     * @param left
     * @param right
     * @return
     * @throws Exception
     */
    private int partitionDemo3(int[] arr, int left, int right)  {
        int pivot = arr[left];
        int i=left, j=right;
        while(left<right){
            while(left<right && arr[right]>=pivot) right--;
            arr[left] = arr[right];
            while(left<right && arr[left]<=pivot) left++;
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        System.out.println("=="+i+"==="+j+"==="+left +"=="+right);
        System.out.println(Arrays.toString(arr));
        return left;

    }


    public void quickSort(int[] nums, int length, int start, int end){
        if(start == end) return;

        int index = partionDemo(nums,nums.length,start,end);
        if(index > start){
            quickSort(nums,length,start,index-1);
        }
        if(index < end){
            quickSort(nums,length,index+1,end);
        }
    }

    public void quickSort2(int[] nums, int start, int end) throws Exception {
        if(start == end) return;

        int index = partitionDemo2(nums,start,end);
        if(index > start){
            quickSort2(nums,start,index-1);
        }
        if(index < end){
            quickSort2(nums,index+1,end);
        }
    }

    public void quickSort3(int[] nums, int start, int end) throws Exception {
        if(start == end) return;

        int index = partitionDemo3(nums,start,end);
        if(index > start){
            quickSort3(nums,start,index-1);
        }
        if(index < end){
            quickSort3(nums,index+1,end);
        }
    }

    public static void main(String[] args) throws Exception {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2,1,2,3,2,2,4,5,2};
        majorityElement.quickSort(nums,nums.length,0,nums.length-1);
        System.out.println(nums);

        int[] nums2 = {4,5,6,7,1,2,3,9,8};
        majorityElement.quickSort2(nums2,0,nums2.length-1);
        System.out.println(nums2);

        int[] nums3 = {4,5,6,7,1,2,3,9,8};
        majorityElement.quickSort3(nums3,0,nums2.length-1);
        System.out.println(nums3);
    }
}
