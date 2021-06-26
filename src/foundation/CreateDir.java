package foundation;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
    //mkdir方法创建一个文件夹
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        d.mkdirs();
    }
}



























