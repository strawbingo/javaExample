package com.strawbingo.algorithm.sword.ch5;


/**
 * 题44：数字序列中某一位的数字
 * 数字以0123456789101112131415...的格式序列化到一个字符序列中。
 * 在这个序列中，第5位（从0开始计数）是5，第13位是1，第19位是4，等等。请写出一个函数，求任意第n位对应的数字
 */
public class NthDigit {

    public int findNthDigit(int nth) {
        int res = 0;

        int digits = 0;
        long currSize = 0;

        while(true){
            digits++;
            currSize += countNunSize(digits);
            System.out.println(currSize);
            if(currSize> nth) break;;
        }


        if(digits == 1) return nth ;

        long count = currSize - countNunSize(digits);
//        System.out.println("count:"+count);
        long back = nth - count;
//        System.out.println("back:"+back);
        long i1 = back / digits;
        long i2 = back % digits;
//        System.out.println("digits:"+digits+" i1:"+i1+" i2:"+i2);
        int start =  (int)Math.pow(10,digits-1);
        long findNumber = start + i1;
//        System.out.println("findNumber:"+findNumber);

        res = Integer.parseInt(String.valueOf(((findNumber)+"").charAt((int)i2)));

        return res;
    }

    public  long countNunSize(int digits) {
        if(digits == 1) return 10;

        return (long) (Math.pow(10,digits) - Math.pow(10,digits-1))*digits;
    }

    public static void main(String[] args) {
        NthDigit nthDigit = new NthDigit();
        System.out.println(nthDigit.countNunSize(1));
        System.out.println(nthDigit.countNunSize(2));
        System.out.println(nthDigit.countNunSize(3));
    }

}
