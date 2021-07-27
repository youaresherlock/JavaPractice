/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateMethodInvoker {
    public static void main(String[] args)
        throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1 = PrivateMethod.class;
        Constructor constructor = c1.getDeclaredConstructor();
        constructor.setAccessible(true);
        PrivateMethod privateMethod = (PrivateMethod) constructor.newInstance();
        privateMethod.sayHello();
    }
}
