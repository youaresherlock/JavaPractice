package com.liaoxuefeng.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class SortedMapDemo2 {
    public static void main(String[] args) {
        /**
         * 使用TreeMap时，放入的Key必须实现Comparable接口。
         * String、Integer这些类已经实现了Comparable接口，
         * 因此可以直接作为Key使用。作为Value的对象则没有任何要求。
         */
//        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.name.compareTo(p2.name);
//            }
//        });
        Map<Person, Integer> map = new TreeMap<>((p1, p2) -> p1.name.compareTo(p2.name));
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        for(Person key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.get(new Person("Bob")));
    }
}

class Person{
    public String name;
    Person(String name){
        this.name = name;
    }

    public String toString(){
        return "{Person: " + name + "}";
    }
}

































