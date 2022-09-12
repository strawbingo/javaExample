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

    /**
     * leetCode
     */
    @Test
    public void testExist(){
        PathInMatrix pathInMatrix = new PathInMatrix();
//        String word = "accf";
//        Assert.assertEquals(false,pathInMatrix.exist(source,word));
//
//        String word2 = "bfde";
//        Assert.assertEquals(true,pathInMatrix.exist(source,word2));
//
//        String word3 = "bccee";
//        Assert.assertEquals(true,pathInMatrix.exist(source,word3));
//
//        char[][] source2 = {{'a'}};
//        String word4 = "a";
//        Assert.assertEquals(true,pathInMatrix.exist(source2,word4));

        // c a a
        // a a a
        // b c d
//         char[][] source3 = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
//        String word5 =  "AAB";
//        Assert.assertEquals(true,pathInMatrix.exist(source3,word5));

        char[][] source4 = {{'A','B','C','E'},
                            {'S','F','E','S'},
                            {'A','D','E','E'}};
        String word6 = "ABCESEEEFS";
        Assert.assertEquals(true,pathInMatrix.exist(source4,word6));
    }


}
