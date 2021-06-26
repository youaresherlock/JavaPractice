/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Clarence", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }

        /**
         * 父类引用指向子类对象，而子类引用不能指向父类对象
         * 把子类对象直接赋值个父类引用叫upcasting向上转型，不用强制转换
         * 把指向子类对象的父类引用赋给子类引用叫向下转型(downcasting)，要强制转换
         * 在Java中,子类数组的引用可以转换成超类数组的引用，而不需要采用强制类型转换
         * Manager[] managers = new Manager[10];
         * Employee[] staff = managers; //OK
         */
    }
}































