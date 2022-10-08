package com.strawbingo.algorithm.sword.ch4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题38：字符串的排列
 */
public class StringPermutation {

    /**
     * 输入一个字符串，打印出该字符串中字符的所有排列。
     * 例如输入字符串abc，则打印出a、b、c所能排列出来不的所有字符串abc、acb、bac、bca、cab和cba
     */
    public String[] permutation(String s) {
        if(s == null || s.isEmpty()) return null;
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder perm = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];

        backtrack(chars,visited,ans,perm);


        String[] res = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    private void backtrack(char[] chars, boolean[] visited, ArrayList<String> ans, StringBuilder perm) {

        if(perm.length() == chars.length){
//            System.out.println(perm.toString());
            ans.add(perm.toString());
            return;
        }

        for (int i = 0; i <visited.length ; i++) {
//            System.out.println(i+":"+perm.toString());
            if(visited[i] || (i>0 && !visited[i-1]  && chars[i] ==chars[i-1] )) continue;

            perm.append(chars[i]+"");
            visited[i] = true;
            backtrack(chars,visited,ans,perm);
            visited[i] = false;
//            System.out.println(i+":done:"+perm.toString());
            perm.deleteCharAt(perm.length()-1);
        }
    }


}
