package com.strawbingo.algorithm.net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static ArrayList<String> twoSumA(int[] arr, int sum) {

        Map<Integer, Integer> intHashMap = new HashMap<>();
        for(int i=0 ; i<arr.length; i++){
            intHashMap.put(arr[i],i);
        }

        ArrayList arrayList = new ArrayList<String>();
//        System.out.println(intHashMap);
        for (int i=0; i<arr.length; i++ ) {
            int find = sum - arr[i];
            if(intHashMap.containsKey(find)){
                arrayList.add(arr[i]+","+find);
                intHashMap.remove(arr[i]);
            }

        }

        System.out.println(arrayList);
        return arrayList;
    }



    public static ArrayList twoSumB(int[] arr, int sum) {
        ArrayList arrayList = new ArrayList<String>();
        Map<Integer, Integer> intHashMap = new HashMap<>();

        int i1 = arr[0];
        for (int i=0; i< arr.length; i++){
            int find = sum -arr[i];
            if(intHashMap.containsKey(find)){
                arrayList.add(find+","+arr[i]);
            }
            else {
                intHashMap.put(arr[i],i);
            }
        }
        
        return arrayList;
    }

    public static ArrayList twoSumAIndex(int[] arr, int sum) {
        Map<Integer, Integer> intHashMap = new HashMap<>();
        for(int i=0 ; i<arr.length; i++){
            intHashMap.put(arr[i],i);
        }

        ArrayList arrayList = new ArrayList<String>();
//        System.out.println(intHashMap);
        for (int i=0; i<arr.length; i++ ) {
            int find = sum - arr[i];
            if(intHashMap.containsKey(find)){
                arrayList.add(i+","+intHashMap.get(find));
                intHashMap.remove(arr[i]);
            }

        }

        System.out.println(arrayList);
        return arrayList;

    }

    public static ArrayList twoSumBIndex(int[] arr, int sum) {

        ArrayList arrayList = new ArrayList<String>();
        Map<Integer, Integer> intHashMap = new HashMap<>();

        int i1 = arr[0];
        for (int i=0; i< arr.length; i++){
            int find = sum -arr[i];
            if(intHashMap.containsKey(find)){
                arrayList.add(intHashMap.get(find)+","+i);
            }
//            else {
                intHashMap.put(arr[i],i);
//            }
        }

        System.out.println(intHashMap);
        System.out.println(arrayList);
        return arrayList;

    }
}
