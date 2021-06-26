/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch04.CalendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * ��ʾ��ǰ�µ�����
 * ��ǰ������һ��*�ű��
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("   ");
        }

        // ֻ��ӡ���µ�����
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            // ��ǰ�ձ��
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            // �µ�һ�ܻ���
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}



















































