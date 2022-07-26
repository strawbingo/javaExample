package com.strawbingo.algorithm.net;

import java.util.*;

public class ThreeSum {

    public static List ThreeSumA(int[] arr, int sum) {
        List res = new ArrayList();
        for(int i=0; i< arr.length; i++){
            int mid = sum - arr[i];
//            System.out.println(mid);
            Map intMap = new HashMap<Integer, Integer>();
            for (int j=0; j<arr.length&&arr[j]!= arr[i]; j++){
                int find = mid - arr[j];
                if(intMap.containsKey(find)){
                    res.add(arr[i]+","+arr[j]+","+find);
                }
                intMap.put(arr[j],j);
            }

        }
        System.out.println(res);
        return res;
    }

    public static List ThreeSumB(int[] arr, int sum) {
        Arrays.sort(arr);
        List res = new ArrayList();

        for (int i=0; i< arr.length; i++) {
           System.out.println("lopp =="+i);
           if(i == arr.length-1){
               break;
           }
           int beginIndex = i+1;
           int endIndex = arr.length-1;
           int find = sum - arr[i];

           while (beginIndex < endIndex){
               System.out.println(i+"=="+arr[beginIndex]+":"+arr[endIndex]);
               if((arr[beginIndex] + arr[endIndex]) == find){
                   res.add(arr[i]+","+arr[beginIndex]+","+arr[endIndex]);
                   System.out.println("find =="+arr[beginIndex]+":"+arr[endIndex]);
                   beginIndex++;
               }
               else if((arr[beginIndex] + arr[endIndex]) > find){
                   endIndex--;
               }
               else {
                   beginIndex++;
               }
           }

        }


        return res;
    }
}
