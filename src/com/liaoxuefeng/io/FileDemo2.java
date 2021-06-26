package com.liaoxuefeng.io;

import java.io.File;

public class FileDemo2 {
    /**
     * boolean canRead()
     * boolean canWrite()
     * boolean canExecute()
     * long length() 文件字节大小
     * @param args
     */
    public static void main(String[] args) {
        // 构造一个File对象，即使传入的文件或目录不存在，代码也不会出错
        // 因为构造一个File对象，并不会导致任何磁盘操作.
        File f1 = new File("C:\\Windows");
        File f2 = new File("C:\\Windows\\notepad.exe");
        File f3 = new File("C:\\Windows\\nothing");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.length());
        System.out.println(f3.isDirectory());
    }
}


























