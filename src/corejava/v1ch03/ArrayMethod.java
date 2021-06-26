/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.util.Arrays;

/**
 * Arrays类的方法
 * static void fill(type[] a, type v)
 * 将数组的所有数据元素值设置为v
 * static boolean equals(type[] a, type[] b)
 * 如果两个数组大小相同，并且下标相同的元素都对应相等，返回true
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.fill(a, 10);

        for (int element: a) {
            System.out.println(element);
        }

        // 打印二位数组b的所有元素，需要使用两个嵌套的循环
        int[][] b = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int[] row: b) {
            for (int value: row) {
                System.out.println(value);
            }
        }

        // 快速地打印一个二维数组的数组元素列表
        System.out.println(Arrays.deepToString(b));
    }
}
















































