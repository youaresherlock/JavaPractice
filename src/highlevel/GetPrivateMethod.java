package highlevel;

import java.lang.reflect.Method;

class Dog{
    String name;
    private void setName(String name){
        this.name = name;
    }
}

public class GetPrivateMethod {
    public static void main(String[] args) throws Exception {
        Dog p = new Dog();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true); // 设置允许调用,否则IllegalAccessException
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }
}



























