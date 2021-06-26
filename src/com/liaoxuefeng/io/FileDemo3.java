package com.liaoxuefeng.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo3 {
    /**
     * File对象表示一个目录时，可以使用list()和listFiles()列出
     * 目录下的文件和子目录名
     * boolean mkdir()：创建当前File对象表示的目录；
     * boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
     * boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        File[] fs1 = f.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);

        // 仅列出.exe文件
//        File[] fs2 = f.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".exe");
//            }
//        });
        File[] fs2 = f.listFiles((dir, name) -> name.endsWith(".exe"));
        printFiles(fs2);
    }

    static void printFiles(File[] files){
        System.out.println("=================");
        if(files != null){
            for(File f: files){
                System.out.println(f);
            }
        }
        System.out.println("=================");
    }
}






































