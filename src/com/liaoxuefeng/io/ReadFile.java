package com.liaoxuefeng.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
       readFile();
    }

    public static void readFile() throws IOException{
        /**
         * 编译器并不会特别的为InputStream加上自动关闭,只看try(resource=...)中的对象是否实现了java.lang
         * .AutoCloseable接口，如果实现了，就自动加上finally语句并调用close()方法.
         * InputStream和OutputStream都实现了这个接口
         */
        try (InputStream input = new FileInputStream("src/readme.txt")) {
            byte[] buffer = new byte[1000]; // 定义1000个字节大小的缓冲区
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes.");
            }
        }
    }
}





































