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
         * ��������ָ��������󣬶��������ò���ָ�������
         * ���������ֱ�Ӹ�ֵ���������ý�upcasting����ת�ͣ�����ǿ��ת��
         * ��ָ���������ĸ������ø����������ý�����ת��(downcasting)��Ҫǿ��ת��
         * ��Java��,������������ÿ���ת���ɳ�����������ã�������Ҫ����ǿ������ת��
         * Manager[] managers = new Manager[10];
         * Employee[] staff = managers; //OK
         */
    }
}































