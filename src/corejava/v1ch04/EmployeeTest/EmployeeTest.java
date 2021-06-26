/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.EmployeeTest;

import java.time.LocalDate;

/**
 * ��һ��Դ�ļ���,ֻ����һ��������,��������������Ŀ�ķǹ�����
 * Employee���ʵ��ʹ��
 * Java����֧�ֵı���������:
 * �����: �����ڷ���֮��ı���,��static����
 * ʵ������: �����ڷ���֮��ı���,����û��static����
 * �ֲ�����: ��ķ����еı���
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
     * ����final����һ����ʱ����������಻�ܱ��̳�
     * final���η���������Ͳ��ܸ����������
     * private final String name;
     * �������ʱ������ʱ�����ʼ����������,����ȷ����ÿһ��������ִ��֮��,
     * ������ֵ������,�����ں���Ĳ�����,���ܹ��ٶ��������޸�.
     * final��Ӧ���ڻ���������򲻿ɱ������(������е�
     * ÿ������������ı��������������ǲ��ɱ����)
     *
     * private final StringBuilder evaluations;
     * final ֻ�Ǳ�ʾ�洢��evaluations�����еĶ������ò�����ָʾ����StringBuilder����,
     * �������������Ը���
     */
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * �����������û�ж�ʵ���������г�ʼ��,��Ĭ��Ϊnull��0.0�ȵ�.
     * final��ʵ������������г�ʼ��
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













































