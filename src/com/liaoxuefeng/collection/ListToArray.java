package com.liaoxuefeng.collection;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("banana");

        // 1.调用toArray()方法直接返回一个Object[]数组：
//        Object[] array = list.toArray();
//        for(Object s: array){
//            System.out.println(s);
//        }

        // 2.给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中：
        String[] array = list.toArray(new String[list.size()]);
        for(String s: array) {
            System.out.println(s);
        }
    }
}



















