package com.strawbingo.algorithm.sword.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题38：字符串的排列
 */
public class StringPermutation {
    /**
     * 输入一个字符串，打印出该字符串中字符的所有排列。
     * 例如输入字符串abc，则打印出a、b、c所能排列出来不的所有字符串abc、acb、bac、bca、cab和cba
     */
    public String[] permutation(String s) {
        if (s.isEmpty()) return null;

        //init param
        StringBuilder perm = new StringBuilder();
        int size = s.length();
        List<String> arrs = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[size];
        //gen perms
        backtrack(0,size,chars,perm,arrs,visited);

        //trans to array
        String[] res = new String[arrs.size()];
        for(int i =0 ; i<res.length; i++){
            res[i] = arrs.get(i);
        }
        return res;
    }

    private void backtrack(int i, int size, char[] chars, StringBuilder perm, List<String> arrs,boolean[] visited) {
//        System.out.println(i+"====");
        if(i==size){
            arrs.add(perm.toString());
            return;
        }

        for(int j=0; j<size;j++){
//            System.out.println(i+"="+j);
            //if same as previous and previous is false, means 2nd loop will same with 1st loop, then skip
            if(visited[j] || j> 0&& visited[j-1]==false && chars[j-1] == chars[j]){
                continue;
            }
            perm.append(chars[j]);
            visited[j] = true;
            backtrack(i+1,size,chars,perm,arrs,visited);
            visited[j] = false;
            perm.deleteCharAt(perm.length()-1);
        }
    }

}
