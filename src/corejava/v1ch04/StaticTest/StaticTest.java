/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.StaticTest;

/**
 * ������Ϊ��̬������û��this�����ķ���(��һ���Ǿ�̬�ķ���
 * ��,this������ʾ�����������ʽ����)
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
     * �Ǿ�̬�����,�ڴ��������ʱ��(new)ִ��,ÿ�δ������󶼻�ִ��һ��
     * {
     *
     * }
     * ��̬�����,��������������ʱ��ͻ����ִ��,����ִֻ��һ��
     * static {
     *
     * }
     * ��ͬ��:
     * ������JVM������ʱ���ڹ��췽��ִ��֮ǰִ��,�����ж����Զ�����
     * ��ͬ��:
     * ִ��˳���Ǿ�̬�����->�Ǿ�̬�����->���췽��
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

    // Worker����һ����̬��main�������ڵ�Ԫ����
    public static void main(String[] args) {
        Worker w = new Worker("Harry", 5000);
        System.out.println(w.getName() + " " + w.getSalary());
    }
}

































































































