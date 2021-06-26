package foundation;

/**
 * 可变参数方法的调用
 * 可变参数只能作为最后一个参数，一个函数最多只有一个可变参数
 * Java的可变参数，会被编译器转型为一个数组
 */
public class VarargsDemo {

    public static void test(String... args){
        for(String arg: args){
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        test(); // 0个参数
        test("a"); // 1个参数
        test("a", "b"); // 多个参数
        test(new String[]{"a", "b", "c"}); // 直接传递数组
    }
}

















































