package foundation;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        //File对象并且是一个目录，则调用isDirectory()方法会返回true
        // list()方法提取文件夹和文件列表
        String dirname = "C:\\Users\\x30009363\\IdeaProjects\\practice\\src\\foundation";
        File f = new File(dirname);
        if (f.isDirectory()){
            System.out.println("目录： " + dirname);
            String[] s = f.list();
            for(int i = 0; i < s.length; i++){
                File file = new File(dirname + "/" + s[i]);
                if(file.isDirectory()){
                    System.out.println(s[i] + "是一个目录");
                } else {
                    System.out.println(s[i] + "不是一个目录");
                }
            }
        } else {
            System.out.println("不是一个目录");
        }
    }

}































