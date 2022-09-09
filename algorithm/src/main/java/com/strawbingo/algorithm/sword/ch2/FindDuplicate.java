package com.strawbingo.algorithm.sword.ch2;


/**
 * 题3：数组中重复数字（长度n，数字在0~n-1之间）
 * 在一个长度为n+1的数组里的所有数字都在1到n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，
 *  但不能修改输入的数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的输出是重复的数字2或者3。
 */
public class FindDuplicate {

    /**
     * 重排数组（下标与数值比较）
     * @param nums
     * @return
     */
    public int findDuplicateReOrder(int[] nums){
        int res = -1;

        for(int i=0; i<nums.length; i++){
//            System.out.println("nums[i] = "+nums[i]);
            if(nums[i]!= i){
//                System.out.println("nums[i] != "+i);
                if(nums[i] == nums[nums[i]]){
                    res =  nums[i];
                    break;
                }

                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }

            if(res > 0){
                break;
            }
        }

        return res;
    }


    /**
     * 扩展：不修改数组找出重复的数字
     * @param arraySrc
     * @return
     */
    public int findDuplicateBinarySearch(int[] arraySrc){
        int left = 1;
        int right = arraySrc.length;

        int mid = 0 ;
        int count;

        while (left < right){
            mid = (left + right)/2 ;
            count = 0 ;

            System.out.println(left+":"+mid+":"+right);

            for(int i=0; i< arraySrc.length; i++){
                if(arraySrc[i]>=left && arraySrc[i] <= mid){
                    count++;
                }
            }

            if(left+count > mid+1){
                right = mid;
            }
            else {
                left = mid+1;
            }
        }

        if (left == right){
            return left;
        }

        return -1;
    }

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
