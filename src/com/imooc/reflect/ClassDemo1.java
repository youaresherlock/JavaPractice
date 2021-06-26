package com.imooc.reflect;

public class ClassDemo1 {
    public static void main(String[] args) throws Exception {
        /**
         * 任何一个类都是Class的实例对象，这个实例对象有三种表示方式
         * 下面三种方式获取的Class实例都是同一个实例,因为JVM对每个
         * 加载的Class只创建一个Class实例来表示它的类型
         */

        // new 创建对象是静态加载类，在编译时刻就需要加载所有的可能使用到的类
//        Foo foo1 = new Foo();
//        Class s = foo1.getClass();
//        Class s = Foo.class;
        /**
         * 下面不仅表示了类的类类型，还表示了动态加载类
         * 编译时刻加载类是静态加载类、运行时刻加载类是动态加载类
         */
        Class s = Class.forName("com.imooc.reflect.Foo");

        /*官网s表示了Foo类的类类型(class type)*/

        // 我们完全可以通过类的类类型创建该类的对象实例--->通过s创建Foo实例
        Foo foo = (Foo)s.newInstance(); // 需要有无参数的构造方法
    }
}

class Foo{}




























