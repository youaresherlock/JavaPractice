package com.liaoxuefeng.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        // getPath() 返回构造方法传入的路径
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        // File对象有个静态变量用于表示当前平台的系统分割符
        System.out.println(File.separator);
    }
}

























