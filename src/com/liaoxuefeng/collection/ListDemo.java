package com.liaoxuefeng.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    // List接口允许我们添加重复的元素
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("pear");
        list.add("apple");
        System.out.println(list.get(1));
        System.out.println(list.size());

        // 通过Iterator遍历集合永远是最高效的
        // 只要实现了Iterable接口的集合类都可以直接用for each循环来遍历
//        Iterator<String> iter = list.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        for(String  str: list){
            System.out.println(str);
        }
    }
}





















