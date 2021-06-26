/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.ParamTest;

/**
 * Java�������ǲ��ð�ֵ����,���������ǰ�ֵ���ݵ�
 * ��������: ������������/��������
 * һ�������������޸�һ�������������͵Ĳ���,
 * ������������Ϊ�����Ͳ�ͬ��
 * �ܽ�:
 * һ�����������޸�һ�������������͵Ĳ���(��ֵ�ͻ򲼶���)
 * һ���������Ըı�һ�����������״̬
 * һ�����������ö����������һ���µĶ���
 *
 * hashCode������java����Ĺ��з������������д�Ļ���
 * ���ص�ʵ�����Ǹö�����jvm�Ķ��ϵ��ڴ��ַ������ͬ������ڴ��ַ�϶���ͬ
 * ���������hashCodeҲ�Ϳ϶���ͬ�ˡ������д�˵Ļ������ڲ��õ��㷨������
 * ���п��ܵ���������ͬ�����hashCode��ͬ��
 * ��������equals��ȣ������ǵ�hashcode�������,��֮��һ��
 * ��������==���,����hashcodeһ�����,��֮��һ������
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






























































