/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.util.Arrays;

/**
 * Arrays��ķ���
 * static void fill(type[] a, type v)
 * ���������������Ԫ��ֵ����Ϊv
 * static boolean equals(type[] a, type[] b)
 * ������������С��ͬ�������±���ͬ��Ԫ�ض���Ӧ��ȣ�����true
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.fill(a, 10);

        for (int element: a) {
            System.out.println(element);
        }

        // ��ӡ��λ����b������Ԫ�أ���Ҫʹ������Ƕ�׵�ѭ��
        int[][] b = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int[] row: b) {
            for (int value: row) {
                System.out.println(value);
            }
        }

        // ���ٵش�ӡһ����ά���������Ԫ���б�
        System.out.println(Arrays.deepToString(b));
    }
}
















































