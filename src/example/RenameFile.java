package example;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException {
        // 文件重命名
        File oldName = new File("./runoob-test.txt");
        File newName = new File("./runoob-text-2.txt");
        // 确保新的文件名不存在
        if(newName.exists()){
            throw new java.io.IOException("file exists");
        }
        if(oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }

        // 设置文件只读
        File file = new File("C:/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}


























