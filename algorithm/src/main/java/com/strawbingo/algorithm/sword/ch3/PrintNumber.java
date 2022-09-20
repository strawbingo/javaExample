package com.strawbingo.algorithm.sword.ch3;

import java.util.ArrayList;

/**
 * 题17：打印从1到最大的n位数
 * 输入数字n，按顺序打印出从1到最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数999
 */
public class PrintNumber {


    public int[] printNumber(int n) {
        ArrayList<String> listStr = new ArrayList();


//        for (int i = 0; i < n; i++) {
            dfs(listStr,"",n);
//        }

        int[] nums = new int[listStr.size()-1];
        for (int i = 0; i < listStr.size()-1 ; i++) {
            nums[i] = Integer.parseInt(listStr.get(i+1));
        }

        return nums;
    }

    private void dfs(ArrayList<String> listStr,String i,int n) {
        if(n==0){
            listStr.add(i);
            return;
        }

        for (int j = 0; j < 10 ; j++) {
            dfs(listStr,i+j,n-1);
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
