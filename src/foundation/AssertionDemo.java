package foundation;

public class AssertionDemo {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        // jvm默认关闭断言指令,遇到assert语句就自动忽略，不执行 java -ea AssertionDemo.java启用断言
        assert x >= 0 : "x must >= 0";
        System.out.println(x);
    }
}
