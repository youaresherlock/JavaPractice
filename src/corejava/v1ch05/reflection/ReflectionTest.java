/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    /**
     * ��ʾ����δ�ӡһ�����ȫ����Ϣ�ķ���.���
     * ���������û�����������Ȼ������������е�
     * �����͹�������ǩ�����Լ�ȫ������
     * @param args
     */
    public static void main(String[] args) {
        // read class name from command line args or user input
        // �������û����,����Class�����������ǻ������ͻ���������
        // ��Щ����������һ������Ϊ0������
        // System.out.println(int.class.getDeclaredFields().length);
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter class name (e.g. java.util.Collections): ");
                name = in.next();
            }
        }

        try {
            // print class name and superclass name (if != Object)
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            // Object.class.getSuperclass()��null
            if (superc1 != null && superc1 != Object.class) {
                System.out.print(" extends " + superc1.getName());
            }

            System.out.print("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints all constructors of a class
     * @param c1 a class
     */
    public static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getDeclaredConstructors();

        for (Constructor c: constructors) {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param c1 a class
     */
    public static void printMethods(Class c1) {
        Method[] methods = c1.getDeclaredMethods();

        for (Method m: methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");

            // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all fields of a class
     * @param c1 a class
     */
    public static void printFields(Class c1) {
        Field[] fields = c1.getDeclaredFields();

        for (Field f: fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}







































































