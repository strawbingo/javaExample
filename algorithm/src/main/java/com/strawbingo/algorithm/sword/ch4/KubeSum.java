package com.strawbingo.algorithm.sword.ch4;

import java.util.ArrayList;

/**
 * 题38-2
 * 输入如一个含有8个数字的数组，判断有没有可能把这8个数字分别放到正方体的8个顶点上，使得正方体上三组相对面上的四个顶点的和都相等
 */
public class KubeSum {
    private ArrayList<String> recArr;
    boolean[] visited;

    public String[] sameSum(int[] nums) {
        int size = nums.length;

        recArr = new ArrayList<>();
        StringBuilder perm = new StringBuilder();

        visited = new boolean[nums.length];

        backtrack(0,size,perm,nums);

        ArrayList  orderList = new ArrayList<>();
        for(int i=0; i<recArr.size(); i++){
            //a1+a2+a3+a4=a5+a6+a7+a8 && a1+a2+a5+a6=a3+a4+a7+a8 && a1+a3+a7+a5= a2+a4+a6+a8
            char[] chars = recArr.get(i).toCharArray();
            if(chars[0]+chars[1]+chars[2]+chars[3] == chars[4]+chars[5]+chars[6]+chars[7]
            && chars[0]+chars[1]+chars[4]+chars[5] == chars[2]+chars[3]+chars[6]+chars[7]
            && chars[0]+chars[2]+chars[4]+chars[6] == chars[1]+chars[3]+chars[5]+chars[7]) {
                orderList.add(recArr.get(i));
            }
        }
        String[] orderNums = new String[orderList.size()];
        for(int i=0;i<orderList.size();i++){
            orderNums[i] = orderList.get(i).toString();
        }
        return orderNums;

    }

    private void backtrack(int i, int size, StringBuilder perm, int[] nums) {
        if(i == size){
            recArr.add(perm.toString());
            return;
        }

        for(int j=0; j < size; j++){
//            System.out.println(j);
            if(visited[j]){
                continue;
            }

            perm.append(nums[j]);
            visited[j] = true;
            backtrack(i+1,size,perm,nums);
            perm.deleteCharAt(perm.length()-1);
            visited[j] = false;
        }
    }

}
