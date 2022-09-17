package com.strawbingo.algorithm.sword.ch3;

import java.util.ArrayList;

/**
 * 题17：打印从1到最大的n位数
 * 输入数字n，按顺序打印出从1到最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数999
 */
public class PrintNumber {


    public int[] printNumber(int n) {
//        int[] nums = {1,2,3,4,5,6,7,8,9,0};

        ArrayList<Integer> list = new ArrayList<>();
//        dfs(n,nums,list);
//        ArrayList<String> list = new ArrayList<>();




        for (int i = 0; i < 10; i++) {
            dfs(n-1,i+"",list);
        }
        int[] ans = new int[list.size()-1];
//        list.stream().forEach(item ->System.out.println(item));
        for (int i = 0; i <list.size()-1; i++) {
            ans[i] = list.get(i+1);
        }

        return ans;
    }


    private void dfs(int n,String iNum, ArrayList<Integer> list) {
        if(n==0){
//            list.add(iNum);
            list.add(Integer.parseInt(iNum));
            return;
        }

        for (int i = 0; i < 10; i++) {
            dfs(n-1,iNum+i,list);
        }


    }

//    public String printNumbers(int n) {
//        this.n = n;
//        res = new StringBuilder(); // 数字字符串集
//        num = new char[n]; // 定义长度为 n 的字符列表
//        dfs(0); // 开启全排列递归
//        res.deleteCharAt(res.length() - 1); // 删除最后多余的逗号
//
//        System.out.println(res.toString());
//        return res.toString(); // 转化为字符串并返回
//    }
//    void dfs(int x) {
//        if(x == n) { // 终止条件：已固定完所有位
//            res.append(String.valueOf(num) + ","); // 拼接 num 并添加至 res 尾部，使用逗号隔开
//            return;
//        }
//        for(char i : loop) { // 遍历 ‘0‘ - ’9‘
//            num[x] = i; // 固定第 x 位为 i
//            dfs(x + 1); // 开启固定第 x + 1 位
//        }
//    }

}
