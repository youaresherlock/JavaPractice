/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * 可供任意类使用的通用toString方法
 * 1. 循环引用可能导致无限递归
 * 2. 如何查看数组内部
 */
public class ObjectAnalyzerTest {
    public static void main(String... args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }

        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}










































































