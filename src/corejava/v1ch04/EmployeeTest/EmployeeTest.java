/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.EmployeeTest;

import java.time.LocalDate;

/**
 * 在一个源文件中,只能有一个公有类,但可以有任意数目的非公有类
 * Employee类的实际使用
 * Java语言支持的变量类型有:
 * 类变量: 独立于方法之外的变量,用static修饰
 * 实例变量: 独立于方法之外的变量,不过没有static修饰
 * 局部变量: 类的方法中的变量
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
            + e.getHireDay());
        }
    }
}

class Employee {
    /**
     * 当用final修饰一个类时，表明这个类不能被继承
     * final修饰方法，子类就不能覆盖这个方法
     * private final String name;
     * 构造对象时或声明时必须初始化这样的域,必须确保在每一个构造器执行之后,
     * 这个域的值被设置,并且在后面的操作中,不能够再对它进行修改.
     * final大都应用于基本类型域或不可变类的域(如果类中的
     * 每个方法都不会改变其对象，这种类就是不可变的类)
     *
     * private final StringBuilder evaluations;
     * final 只是表示存储在evaluations变量中的对象引用不会再指示其他StringBuilder对象,
     * 不过这个对象可以更改
     */
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * 如果构造器内没有对实例变量进行初始化,则默认为null或0.0等等.
     * final的实例变量必须进行初始化
     */
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}













































