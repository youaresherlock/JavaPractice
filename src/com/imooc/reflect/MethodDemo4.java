package com.imooc.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {
    /**
     * 通过反射了解集合泛型的本质
     * 所以，Java的泛型是由编译器在编译时实行的，编译器内部永远把所有类型T
     * 视为Object处理，但是，在需要转型的时候，编译器会根据T的类型自动为
     * 我们实行安全地强制转型。
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<>();

        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);
        list1.add("hello");

        //反射的操作都是编译之后的操作
        // c1 == c2结果为true说明编译之后集合的泛型是去泛型化的
        /*
        java中集合的泛型，是防止错误输入的，只在编译阶段有效，绕过编译就无效了
        验证: 我们可以通过方法的反射来操作，绕过编译
        * */

        Method m = c2.getMethod("add", Object.class);
        m.invoke(list1, 20); //绕过编译操作就绕过了泛型
        System.out.println(list1.size());
        System.out.println(list1);
    }
}



















