package com.imooc.reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
    /**
     * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
     * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
     * Method[] getMethods()：获取所有public的Method（包括父类）
     * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 要获取print(int, int)方法
        A a1 = new A();
        Class c = a1.getClass();
        // 2. 获取方法 名称和参数列表来决定
//        Method m = c.getMethod("print", new Class[]{int.class, int.class});
        Method m = c.getMethod("print", int.class, int.class);
        // 方法如果没有返回值返回null, 有返回值返回具体的返回值
        m.invoke(a1, 1, 2);

        // String对象:
//        String s = "Hello world";
//        // 获取String substring(int)方法，参数为int:
//        Method m = String.class.getMethod("substring", int.class);
//        // 在s对象上调用该方法并获取结果:
//        String r = (String) m.invoke(s, 6);
//        // 打印调用结果:
//        System.out.println(r);

        System.out.println("=========================");
        Method m1 = c.getMethod("print", String.class, String.class);
        m1.invoke(a1, "hello", "world");

        System.out.println("=========================");
//        Method m2 = c.getMethod("print", new Class[]{});
        Method m2 = c.getMethod("print");
        m2.invoke(a1);
    }
}

class A{

    public void print(){
        System.out.println("print");
    }

    public void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a, String b){
        System.out.println(a.toUpperCase() + "," + b.toUpperCase());
    }
}
























