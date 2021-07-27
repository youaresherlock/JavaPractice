/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

import corejava.v1ch05.inheritance.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.Type;


public class GetEmployeeName {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harry = new Employee("Harry Hacker", 35000, 1998, 10, 1);
        Class c1 = harry.getClass();
        Field f = c1.getDeclaredField("salary");
        // 允许访问私有域
        f.setAccessible(true);
        // name是private域,get方法可能会抛出一个IllegalAccessException异常
        // f.get(obj)将返回一个对象，其值为obj域的当前值
        // Double name = f.getDouble(harry);
        /**
         * salary是double类型,Java中数值类型不是对象
         * get 反射机制会自动将这个域值打包到相应的对象包装其中.Double
         */
        // Object name = f.get(harry);
        Double name = (Double) f.get(harry);
        System.out.println(name);
        // 将obj对象的f域设置成新值
        f.set(harry, 38000);

        Field[] fields = harry.getClass().getDeclaredFields();
        for (Field field: fields) {
            Type t = field.getType();
            System.out.println(t.getTypeName() + " " + field.getName());
            /**
             * 反射机制的默认行为受限于Java的访问控制。
             * 调用Field、Method或Constructor对象的setAccessible方法
             */
            field.setAccessible(true);
            System.out.println(field.get(harry));
        }
    }
}
















































