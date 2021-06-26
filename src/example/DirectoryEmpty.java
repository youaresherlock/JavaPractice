package example;

import java.io.File;
import java.util.regex.Pattern;

public class DirectoryEmpty {
    public static void main(String[] args) {
        // 判断目录是否为空
        File file = new File("./testdir");
        if(file.isDirectory()){
            if(file.list().length > 0){
                System.out.println("目录不为空!");
            } else {
                System.out.println("目录为空!");
            }
        } else {
            System.out.println("这不是一个目录!");
        }
    }
}
