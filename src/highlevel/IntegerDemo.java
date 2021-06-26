package highlevel;

import java.lang.reflect.Method;

/**
 * 如果获取到的Method表示一个静态方法，调用静态方法时，
 * 由于无需指定实例对象，所以invoke方法传入的第一个参数
 * 永远为null。我们以Integer.parseInt(String)为例：
 */
public class IntegerDemo {
    public static void main(String[] args)throws Exception {
        // 获取Integer.parseInt(String)方法,参数为String
        Method m = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果
        Integer n = (Integer)m.invoke(null, "12345");
        // 打印调用结果
        System.out.println(n);
    }
}
