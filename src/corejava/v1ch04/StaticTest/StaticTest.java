/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.StaticTest;

/**
 * 可以认为静态方法是没有this参数的方法(在一个非静态的方法
 * 中,this参数表示这个方法的隐式参数)
 */
public class StaticTest {
    public static void main(String[] args) {
        Worker[] staff = new Worker[3];

        staff[0] = new Worker("Tom", 40000);
        staff[1] = new Worker("Dick", 60000);
        staff[2] = new Worker("Harry", 65000);

        // print out information about all Employee objects
        for (Worker e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                + e.getSalary());
        }

        int n = Worker.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}

class Worker {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    /**
     * 非静态代码块,在创建对象的时候(new)执行,每次创建对象都会执行一次
     * {
     *
     * }
     * 静态代码块,在虚拟机加载类的时候就会加载执行,而且只执行一次
     * static {
     *
     * }
     * 相同点:
     * 都是在JVM加载类时且在构造方法执行之前执行,在类中都可以定义多个
     * 不同点:
     * 执行顺序是静态代码块->非静态代码块->构造方法
     */

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId ++;
    }

    // Worker类有一个静态的main方法用于单元测试
    public static void main(String[] args) {
        Worker w = new Worker("Harry", 5000);
        System.out.println(w.getName() + " " + w.getSalary());
    }
}

































































































