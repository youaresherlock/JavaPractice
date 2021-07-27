/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.JavaAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ˮ����Ӧ��ע��
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * ��Ӧ�̱��
     */
    int id() default -1;

    /**
     * ��Ӧ������
     */
    String name() default "";

    /**
     * ��Ӧ�̵�ַ
     */
    String address() default "";
}
