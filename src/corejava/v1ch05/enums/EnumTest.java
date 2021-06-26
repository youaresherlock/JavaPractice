/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.enums;

import java.util.Scanner;

/**
 * ==�Ƚ�ö�����͵�ֵ
 * Size s = Enum.valueOf(size.class, "SMALL")
 * Size.SMALL.toString()�������ַ���"SMALL"
 * Size[] values = Size.values(); ����һ������ȫ��ö��ֵ������
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job-- you paid attention to the _.");
        }

        Size[] values = Size.values();
        for (Size value: values) {
            // String toString ����ö�ٳ�����
            System.out.println(value.toString());
            // int ordinal() ����ö�ٳ�����enum�����е�λ��,λ�ô�0��ʼ����
            System.out.println(value.ordinal());
        }
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}





























