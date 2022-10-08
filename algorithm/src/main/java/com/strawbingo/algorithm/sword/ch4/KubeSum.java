package com.strawbingo.algorithm.sword.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题38-2: 8顶点
 * 输入如一个含有8个数字的数组，判断有没有可能把这8个数字分别放到正方体的8个顶点上，
 * 使得正方体上三组相对面上的四个顶点的和都相等
 * https://www.freesion.com/article/2085525772/
 */
public class KubeSum {

    public String[] sameSum(int[] nums) {
        List<String> sum = new ArrayList();
        List<Integer> visted = new ArrayList();

        backtrack(sum,visted,nums,0);

        String[] ans = new String[sum.size()];
        for (int i = 0; i < sum.size() ; i++) {
            ans[i] = sum.get(i);
        }
        return ans;
    }

    private void backtrack(List<String> sum, List<Integer> visted,int[] nums, int i) {
        //if finish judge
        if(i == nums.length){
            int a1=nums[visted.get(0)], a2=nums[visted.get(1)], a3 = nums[visted.get(2)], a4 = nums[visted.get(3)],
                    a5=nums[visted.get(4)],a6=nums[visted.get(5)],a7=nums[visted.get(6)],a8=nums[visted.get(7)];
            if( (a1+a2+a3+a4 == a5+a6+a7+a8)&& (a1+a3+a5+a7 == a2+a4+a6+a8) && (a1+a2+a5+a6 == a3+a4+a7+a8)){
               String tmp = a1+","+a2+","+a3+","+a4+","+a5+","+a6+","+a7+","+a8;
               sum.add(tmp);
            }
            return;
        }

        //backtrack
        for (int j = 0; j < nums.length; j++) {
            if(visted.contains(j)){
                continue;
            }
            visted.add(j);
            backtrack(sum,visted,nums,i+1);
            visted.remove(visted.size()-1);
        }
    }


    public List<String> isEightPoint(int[] num){
        ArrayList<String> list = new ArrayList<>();
        if (num == null)
            return null;
        Permutation(num,0,list);
        return list;
    }
    private void Permutation(int[] num,int begin,ArrayList<String> list){
        int end = num.length - 1;
        if (begin == end) {
            int a1 = num[0],a2 = num[1],a3=num[2],a4=num[3],a5 = num[4],a6 = num[5],a7 = num[6],a8 = num[7];
            if (list.contains(Arrays.toString(num))) {
                if ((a1 + a2 + a3 + a4 == a5 + a6 + a7 + a8) && (a1 + a3 + a5 + a7 == a2 + a4 + a6 + a8)
                        && (a1 + a2 + a5 + a6 == a3 + a4 + a7 + a8)) {
                    System.out.println(1);
                    list.add(Arrays.toString(num));
                }
                return;
            }
        }
        for(int i = begin;i<= end;i++){
            int temp = num[begin];
            num[begin] = num[i];
            num[i] = temp;
            Permutation(num,begin+1,list);
            temp = num[begin];
            num[begin] = num[i];
            num[i] = temp;
        }
    }

    private static ArrayList<String> res = new ArrayList<>();
    /**
     * 返回符合条件的结果集
     * @param arr
     * @return
     */
    public static ArrayList<String> isEightPoint2(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length != 8) {
            return res;
        }
        permutation(arr, 0);
        return res;
    }
    /**
     * 数字的全排列
     *
     * @param num
     * @param i
     */
    public static void permutation(int[] num, int i) {
        if (num.length == i) {
            int a1 = num[0], a2 = num[1], a3 = num[2], a4 = num[3],
                    a5 = num[4], a6 = num[5], a7 = num[6], a8 = num[7];
            //如果满足条件，则加入结果
            if ((a1 + a2 + a3 + a4 == a5 + a6 + a7 + a8)
                    && (a1 + a3 + a5 + a7 == a2 + a4 + a6 + a8)
                    && (a1 + a2 + a5 + a6 == a3 + a4 + a7 + a8)) {
                res.add(Arrays.toString(num));
            }
            return;
        }
        for (int j = i; j < num.length; j++) {
            swap(num, i, j);
            permutation(num, i + 1);
            swap(num, i, j);
        }

    }

    private static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }


}
