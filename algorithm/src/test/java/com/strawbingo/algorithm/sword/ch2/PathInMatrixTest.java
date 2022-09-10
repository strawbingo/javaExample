package com.strawbingo.algorithm.sword.ch2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 题12：
 * 矩阵中的路径。
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符所有字符的路径。
 * 任意格开始，上下左右移动，不能重复进入。
 *
 * [['a','b','c','e'],
 *  ['s','f','c','s'],
 *  ['a','d','e','e']]
 *
 *  包含一条字符串“bfce”的路径（路径中的字母用加粗标出）
 *  不包含字符串“abfb”的路径
 */
public class PathInMatrixTest {

    char[][] source = {{'a','b','c','e'},
                        {'s','f','c','s'},
                        {'a','d','e','e'}};

    @Test
    public void testHasPath(){
        char[] des1 = {'a','c','c','f'};
        Assert.assertEquals(false, PathInMatrix.hasPath(source,des1));
        System.out.println("------------------------------------------------");
        char[] des2 = {'b','f','d','e'};
        Assert.assertEquals(true, PathInMatrix.hasPath(source,des2));
        System.out.println("------------------------------------------------");
        char[] des3 = {'b','c','c','e','e'};
        Assert.assertEquals(true, PathInMatrix.hasPath(source,des3));
    }


}
