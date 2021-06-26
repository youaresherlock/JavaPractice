package example;

public class StringCompareEmp {
    public static void main(String[] args) {
        //字符串比较
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}







































