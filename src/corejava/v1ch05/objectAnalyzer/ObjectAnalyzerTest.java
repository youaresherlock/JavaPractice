/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.objectAnalyzer;

import java.util.ArrayList;

/**
 * �ɹ�������ʹ�õ�ͨ��toString����
 * 1. ѭ�����ÿ��ܵ������޵ݹ�
 * 2. ��β鿴�����ڲ�
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










































































