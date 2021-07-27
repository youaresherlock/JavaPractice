/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.JavaAnnotation;

import java.lang.reflect.Field;

/**
 * ע�⴦����
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = " ˮ�����ƣ�";
        String strFruitColor = " ˮ����ɫ��";
        String strFruitProvider;

        Field[] fields = clazz.getDeclaredFields();

        for(Field field: fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            }
            else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor= field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = " ��Ӧ�̱�ţ�" + fruitProvider.id() + " ��Ӧ�����ƣ�"
                    + fruitProvider.name() + " ��Ӧ�̵�ַ��" + fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
