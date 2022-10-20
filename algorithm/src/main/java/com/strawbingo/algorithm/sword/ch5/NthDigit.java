package com.strawbingo.algorithm.sword.ch5;


/**
 * 题44：数字序列中某一位的数字
 * 数字以0123456789101112131415...的格式序列化到一个字符序列中。
 * 在这个序列中，第5位（从0开始计数）是5，第13位是1，第19位是4，等等。请写出一个函数，求任意第n位对应的数字
 */
public class NthDigit {

    public int findNthDigit(int n) {
        if(n < 10) return n;

        int d = 1;
        int count = 9;
        while ( (long)d* count < n ){
            n -= d* count;
            d++;
            count *=10;
//            System.out.println("n:"+n);
        }


        int index = n - 1;
        int start =(int) Math.pow(10,d-1) ;
//        System.out.println("index:"+index);
        int divNum = index / d;
        int num = start + index / d;
        int digitalIndex = index % d;

//        System.out.println("start:"+start+",divNum:"+divNum+",digitalIndex:"+digitalIndex);
//        System.out.println("n:"+n+",final:"+num);

//        int index = digitalIndex == 0? 0:digitalIndex;
//        return Integer.valueOf(String.valueOf(num).substring(index-1,index));

        int digit = (num / (int)(Math.pow(10, d - digitalIndex - 1))) % 10;
        return  digit;

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
