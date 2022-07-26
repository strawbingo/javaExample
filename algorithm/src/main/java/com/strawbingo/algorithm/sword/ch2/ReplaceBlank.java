package com.strawbingo.algorithm.sword.ch2;

/**
 * 实现一个函数，把一个字符串中的空格替换成20%，或是其他字符
 */
public class ReplaceBlank {

    public static char[] replace(char[] source, char oldChar, char[] newCharArr) {

        //check param

        //calc old char count
        int countBlank = 0;
        for(char tmp :source){
            if (tmp == oldChar)
                countBlank++;
        }

        //gen new char array
        char [] result = new char[source.length + countBlank * (newCharArr.length - 1)];
//        System.out.println(result.length);

        //replace from end
        int j = result.length;
        for(int i=source.length-1; i>=0 ;i--) {
            if(source[i] == oldChar) {
                for (int z=newCharArr.length-1; z>=0; z--){
                    result[--j] = newCharArr[z];
                }
            }
            else {
                result[--j] = source[i];
            }
        }

        System.out.println(result);

        return result;
    }

    public static char[] replaceWithInOldArray(char[] source, char oldChar, char[] newCharArr, int endSize) {

        //check param


        //replace from end
        int j = source.length;
        for(int i=endSize; i>=0 ;i--) {
            if(source[i] == oldChar) {
                for (int z=newCharArr.length-1; z>=0; z--){
                    source[--j] = newCharArr[z];
                }
            }
            else {
                source[--j] = source[i];
            }
        }

        System.out.println(source);

        return source;
    }


}
