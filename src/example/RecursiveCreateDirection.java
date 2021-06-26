package example;

import java.io.File;

public class RecursiveCreateDirection {
    public static void main(String[] args) {
        //递归创建目录
        String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}