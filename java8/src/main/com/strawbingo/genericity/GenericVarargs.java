package com.strawbingo.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liubin15 on 2018/6/19.
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args){
        List<T> result = new ArrayList<T>();
        for(T item : args){
            result.add(item);
        }
        return result;
    }
    public static void main(String[] args){
        List<String> ls = makeList("Jay", "Mike");

        ls = makeList("Jay", "Mike","dd");
    }

}
