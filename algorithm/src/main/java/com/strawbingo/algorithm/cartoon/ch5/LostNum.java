package com.strawbingo.algorithm.cartoon.ch5;

public class LostNum {
    /**
     * 在一个无序数组里有99个不重复的正整数，范围是1~100，唯独缺少一个1~100中的整数，如果找到缺失的整数？
     * @param arr
     * @return
     */
    public static int findLost(int[] arr) {
        int nums = arr.length+1;
        int sum = (1+ nums) * (nums/2) + (1+ nums)/2* (nums%2);
        System.out.println(sum);

        int inputSum = 0;
        for(int i = 0; i<arr.length;i++){
            inputSum += arr[i];
        }

        return sum - inputSum;
    }



    /**
     * 一个无序数组里有若干个正整数，范围是1~100，其中99个整数都出现了偶数次，只有一个整数出现了奇数次，如何找到出现奇数次的整数
     */
    public static int findOddNum(int[] arr) {
         int res=0;

         for(int i:arr){
             res = res^i;
         }

         return res;
    }

    /**
     * 一个无序数组里有若干个正整数，范围是1~100，其中98个整数都出现了偶数次，
     * @param arr
     * @return
     */
    public static int[] findTowOddTimeNum(int[] arr) throws Exception {
        //check the arr agr
        if(arr.length < 2){
            throw new Exception("incorrect input");
        }

        //find separator
        int xorResult = 0;
        for(int i = 0; i< arr.length ; i++){
            xorResult ^= arr[i];
        }

        if(xorResult == 0){
            return null;
        }

        int separator = 1;
        while( 0 == (separator&xorResult)){
            separator = separator << 1;
        }

        //get the resultArr
        int[] resultArr = {0,0};

        for(int i = 0; i<arr.length; i++){
            if(0 == (arr[i]&separator)){
                resultArr[0] ^= arr[i];
            }
            else {
                resultArr[1] ^= arr[i];
            }
        }


        return resultArr;
    }
}
