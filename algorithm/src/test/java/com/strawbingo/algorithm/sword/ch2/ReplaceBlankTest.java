package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

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


        char[] source = new char[5];
        source[0] = 'a';
        source[1] = ' ';
        source[2] = 'b';
        char[] newCharArr = {'2','0','%'};
        char[] res =  {'a','2','0','%','b'};


        Assert.assertArrayEquals(res, ReplaceBlank.replaceWithInOldArray(source,' ' ,newCharArr, 2));
    }

}
