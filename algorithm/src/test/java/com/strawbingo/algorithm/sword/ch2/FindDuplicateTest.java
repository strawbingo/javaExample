package com.strawbingo.algorithm.sword.ch2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

//数组重复数字
//在一个长度为n+1的数组里的所有数字都在1到n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，
// 但不能修改输入的数组。例如，如果输入长度为8的数组{2, 3, 5, 4, 3, 2, 6, 7}，那么对应的输出是重复的数字2或者3。

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
public class FindDuplicateTest {

    int[] arr1 = {1,2,3,4,3,5};
    int[] arr2 = {0,2,3,4,5,0};
    int[] arr3 = {1,2,3,4,5,1};
    FindDuplicate q2;


    @Before
    public void setup(){
        q2 = new FindDuplicate();
    }

    @Test
    public void TestFindDuplicateReOrder() throws InterruptedException {
       int dup =  q2.findDuplicateReOrder(arr1);
        Assert.assertEquals(3,dup);

        TimeUnit.SECONDS.sleep(10);

        Assert.assertEquals(0,q2.findDuplicateReOrder(arr2));
    }

    @Test
    public void TestFindDuplicateBinarySearch() throws InterruptedException {
        int dup =  q2.findDuplicateBinarySearch(arr1);
        Assert.assertEquals(3,dup);

//        TimeUnit.SECONDS.sleep(10);

        Assert.assertEquals(1,q2.findDuplicateBinarySearch(arr3));
    }


    @Test
    public void TestFindDuplicateLinkLoop() throws InterruptedException {
        Assert.assertEquals(3, q2.findDuplicateLinkLoop(arr1));

//        TimeUnit.SECONDS.sleep(10);

        Assert.assertEquals(1,q2.findDuplicateLinkLoop(arr3));
    }

}
