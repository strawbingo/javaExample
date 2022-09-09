package com.strawbingo.algorithm.sword.ch2;


/**
 * 题3：找出数组中重复的数字
 */
public class FindDuplicate {

    /**
     * 题目1：在一个长度为n数组里所有的数字都在0~n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
     * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 例如，输入长度为7的数组{2,3,1,0,2,5,3}，对应输出的重复数字是2或者3
     * 重排数组（下标与数值比较）
     * @param nums
     * @return
     */
    public int findDuplicateReOrder(int[] nums){
        int ans = -1;
        //reorder array with it's index;
        int i = 0;
        while ( i < nums.length) {
            if(i == nums[i]){
                i++;
                continue;
            }

            if(nums[nums[i]] == nums[i]) {
                ans = nums[i];
                break;
            }
            else {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }

        return ans;
    }


    /**
     * 扩展：不修改数组找出重复的数字
     *
     * 按照二分查找的思路，将 1~n 的数字从中间的数字 m 分为两部分，前面一半为 1~m，后面一半为 (m+1)~n。
     *
     * 如果 1~m 的数字的数目大于 m，那么这一半的区间一定包含重复的数字；否则，另一半 (m+1)~n 的区间里一定包含重复的数字。
     *
     * 我们可以继续把包含重复数字的区间继续二分，直到找到一个重复的数字。
     * @param nums
     * @return
     */
    public int findDuplicateBinarySearch(int[] nums){
        int ans = -1;
        //binary count

        int left = 1;
        int right = nums.length;
        // count number between left and right
        while (left < right){

            int mid = (left + right)/2;
//            System.out.println(left+":"+right+":"+mid);
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>=left && nums[i]<=mid){
                    count++;
                }
            }
            //if count > left+mid then right = mid
//            System.out.println(count+":"+(left+mid));
//            if(left+ count > mid +1){
            if(count > (mid - left + 1)){
                right = mid;
            }else {
                left = mid+1;
            }
        }

        if(left == right){
            ans = left;
        }
       return ans;
    }

    /**
     * 快慢指针（Fast-Slow Pointer）求解数组中的重复数字
     * https://blog.csdn.net/SoftPoeter/article/details/103153564
     * @param arraySrc
     * @return
     */
    public int findDuplicateLinkLoop(int[] arraySrc){

        int slow = 0;
        int fast = 0;

        slow = arraySrc[slow];
        fast = arraySrc[arraySrc[fast]];

        while(slow != fast){
            slow = arraySrc[slow];
            fast = arraySrc[arraySrc[fast]];
        }

        slow = 0;
        while(slow != fast){
            slow = arraySrc[slow];
            fast = arraySrc[fast];
        }

        return slow;
    }

}
