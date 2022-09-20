package com.strawbingo.algorithm.sword.ch3;

/**
 * 题17：打印从1到最大的n位数
 * 输入数字n，按顺序打印出从1到最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数999
 */
public class PrintNumber {

    int[] nums;
    char[] num;
    int nine = 0;
    int len;
    int count=0;
    public int[] printNumber(int n) {
        count = 0;
        num = new char[n];
        len = n;

        nums = new int[(int)Math.pow(10,n)-1];

        dfs(n);

        return nums;
    }

    private void dfs(int n) {
        if(n==0){

            String numTmp = String.valueOf(num).substring(nine);
//            System.out.println(numTmp);
            int numInt = Integer.parseInt(numTmp);
//            System.out.println(numInt);
            if(numInt>0) nums[count++] = numInt;
            return;
        }

        for (int i = 0; i < 10; i++) {
            num[len-n] = (char)(i + '0');
            dfs(n-1);
            if(i==9){
                nine++;
            }
        }
        nine--;
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
