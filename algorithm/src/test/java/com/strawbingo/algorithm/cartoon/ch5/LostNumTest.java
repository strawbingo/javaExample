package com.strawbingo.algorithm.cartoon.ch5;

import org.junit.Assert;
import org.junit.Test;

public class LostNumTest {

    @Test
    public void testFindLost(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60
                ,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
                ,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99};

        Assert.assertEquals(88,LostNum.findLost(arr));

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        Assert.assertEquals(11,LostNum.findLost(arr2));
    }

    @Test
    public void testFindOddNum(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60
                ,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
                ,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99
                ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60
                ,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
                ,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99};

        Assert.assertEquals(88,LostNum.findOddNum(arr));

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9};

        Assert.assertEquals(10,LostNum.findOddNum(arr2));
    }

    @Test
    public void testFindTowOddTimeNum() throws Exception {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60
                ,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
                ,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99
                ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60
                ,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
                ,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98};

        Assert.assertArrayEquals(new int[] {88,99},LostNum.findTowOddTimeNum(arr));

        System.out.println(1l >>> 32);
        System.out.println(-1l >>> 32);
        System.out.println(232433344333l >>> 32);
    }

}
