/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.ParamTest;

/**
 * Java语言总是采用按值调用,对象引用是按值传递的
 * 方法参数: 基本数据类型/对象引用
 * 一个方法不可能修改一个基本数据类型的参数,
 * 而对象引用作为参数就不同了
 * 总结:
 * 一个方法不能修改一个基本数据类型的参数(数值型或布尔型)
 * 一个方法可以改变一个对象参数的状态
 * 一个方法不能让对象参数引用一个新的对象
 *
 * hashCode是所有java对象的固有方法，如果不重写的话，
 * 返回的实际上是该对象在jvm的堆上的内存地址，而不同对象的内存地址肯定不同
 * ，所以这个hashCode也就肯定不同了。如果重写了的话，由于采用的算法的问题
 * ，有可能导致两个不同对象的hashCode相同。
 * 两个对象equals相等，则它们的hashcode必须相等,反之则不一定
 * 两个对象==相等,则其hashcode一定相等,反之不一定成立
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
         * Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test 2: Methods can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary:");
        Stuff harry = new Stuff("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());

        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * Test 3: Methods can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap:");
        Stuff a = new Stuff("Alice", 70000);
        Stuff b = new Stuff("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Stuff x) {
        System.out.println(x.hashCode());
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Stuff x, Stuff y) {
        Stuff temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Stuff {
    private String name;
    private double salary;

    public Stuff(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}






























































