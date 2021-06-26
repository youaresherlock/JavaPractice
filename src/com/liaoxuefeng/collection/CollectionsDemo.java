package com.liaoxuefeng.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        /**
         * Collections是JDK提供的工具类，位于java.util包中
         * 它提供了一系列静态方法，能更方便地操作各种集合
         */
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        // 排序前:
        System.out.println(list);
        Collections.sort(list);
        // 排序后:
        System.out.println(list);
        Collections.shuffle(list);
        // 打乱后
        System.out.println(list);
    }
}




















