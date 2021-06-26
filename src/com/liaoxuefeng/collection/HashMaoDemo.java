package com.liaoxuefeng.collection;

import java.util.HashMap;
import java.util.Map;

class Student{
    public String name;
    public int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class HashMaoDemo {
    public static void main(String[] args) {
        Student s = new Student("xiao ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("xiao ming", s);
        Student target = map.get("xiao ming");
        System.out.println(target == s);
        System.out.println(target.score);
        Student another = map.get("bob");
        System.out.println(another); // 未找到返回null
    }
}













