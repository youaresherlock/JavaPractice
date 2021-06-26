package com.liaoxuefeng.collection;

import java.util.HashMap;
import java.util.Map;

public class ForKeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);

        // 遍历 keySet()方法返回Set集合
        for(String key: map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        // 遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射：
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        for(Integer integer: map.values()){
            System.out.println(integer);
        }

    }
}
