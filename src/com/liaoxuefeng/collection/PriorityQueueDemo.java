package com.liaoxuefeng.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    /**
     * 放入PriorityQueue的元素，必须实现Comparable接口，
     * PriorityQueue会根据元素的排序顺序决定出队的优先级
     * 也可以传入一个Comparator对象来判断两个元素的顺序
     * @param args
     */
    public static void main(String[] args) {
        // PriorityQueue出队顺序与元素的优先级有关,调用
        // remove()或者poll()方法，返回的总是优先级最高的元素
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));

        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return name + "/" + number;
    }
}


class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2){
        if(u1.number.charAt(0) == u2.number.charAt(0)) {
            return u1.number.compareTo(u2.number);
        }

        if(u1.number.charAt(0) == 'V'){
            return -1;
        } else {
            return 1;
        }
    }
}










































