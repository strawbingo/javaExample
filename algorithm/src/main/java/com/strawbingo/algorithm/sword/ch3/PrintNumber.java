package com.strawbingo.algorithm.sword.ch3;

/**
 * 题17：打印从1到最大的n位数
 * 输入数字n，按顺序打印出从1到最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数999
 */
public class PrintNumber {

    StringBuilder res;

    int[] result;
    char[] num,loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int count =0,n;
    public int[] printNumber(int i) {
        count =0;
        this.n = i;
        num = new char[i];
        result = new int[(int) Math.pow(10,i)-1];

//        System.out.println(result.length);
        dfs(0);


        return result;
    }

    private void dfs(int i) {
        if(i == n) {
//            System.out.println(num);
            if(Integer.parseInt(String.valueOf(num))>0) {
                result[count++] = Integer.parseInt(String.valueOf(num));
            }
            return;
        }

        for (char tmp: loop) {
//            System.out.println(i+":"+tmp);
            num[i] = tmp;
//            result[count++] = Integer.parseInt(nums.toString());
//            System.out.println(num);
            dfs(i+1);
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
