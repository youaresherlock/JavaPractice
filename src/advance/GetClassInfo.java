package advance;

import java.lang.reflect.Field;

class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }
}

class Student extends Animal{
    public int score;
    private int grade;

    public Student(String name) {
        super(name);
    }
}

public class GetClassInfo {
    /*
    通过Class实例获取字段信息
    Field getField(name) 获取包括父类public的field
    Field getDeclaredField(name) 根据字段名获取当前类的某个field
    Field[] getFields() 获取包括父类所有public的field
    Field[] getDeclaredFields() 获取当前类的所有field
     */
    public static void main(String[] args) throws Exception {
//        Class stdClass = Student.class;
//        System.out.println(stdClass.getField("score"));
//        System.out.println(stdClass.getField("name"));
//        System.out.println(stdClass.getDeclaredField("grade"));

        Object p = new Animal("xiao ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true); // 可以利用反射访问private的成员变量
        f.set(p, "xiao hong"); // 利用反射设置字段的值
        Object value = f.get(p);
        System.out.println(value);
    }
}



























