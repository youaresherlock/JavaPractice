package com.liaoxuefeng.collection;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo1 {
    public static void main(String[] args) {
        // SortedMap保证遍历时以Key的顺序来进行排序。
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for(String key: map.keySet()){
            System.out.println(key);
        }
    }
}


















