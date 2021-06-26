package highlevel;

import java.lang.reflect.Method;

/**
 * String s = "Hello world";
 * String r = s.substring(6); // "world"
 * 通过反射调用substring方法
 */
public class SubstringDemo {
    public static void main(String[] args)throws Exception {
        String s = "hello world";
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果
        String r = (String)m.invoke(s, 6);
        System.out.println(r);
    }
}
















