package com.strawbingo.eight;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by liubin15 on 2018/6/5.
 */
public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("foo"));              // true
        System.out.println(predicate.negate().test("foo"));     // false
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(nonNull.test(null));
        System.out.println(isNull.test(null));
        System.out.println(isEmpty.test("sss"));
        System.out.println(isNotEmpty.test(""));
    }
}
