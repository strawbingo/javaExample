package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题5：替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceBlankTest {


    @Test
    public void testReplaceChar(){


        char[] source = new char[3];
        source[0] = 'a';
        source[1] = ' ';
        source[2] = 'b';
        char[] newCharArr = {'2','0','%'};
        char[] res =  {'a','2','0','%','b'};


        Assert.assertArrayEquals(res, ReplaceBlank.replace(source,' ' ,newCharArr));
    }

    @Test
    public void testReplaceCharWithInOldArray(){
        ReplaceBlank replaceBlank = new ReplaceBlank();

        Assert.assertEquals("We%20are%20happy.", replaceBlank.replaceSpace("We are happy."));
    }

}
