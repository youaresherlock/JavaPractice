package com.liaoxuefeng.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        /**
         * 文件如果包含中文，就会出现乱码。FileReader默认的编码与系统相关,Windows
         * 系统的默认编码可能是GBK，打开一个UTF-8编码的文本文件就会出现乱码
         * Reader reader = new FileReader("src/readme.txt", StandardCharsets.UTF_8);
         */
        Reader reader = new FileReader("./read.txt"); // 字符编码是???
        for (;;) {
            int n = reader.read(); // 反复调用read()方法，直到返回-1
            if (n == -1) {
                break;
            }
            System.out.println((char)n); // 打印char
        }
        reader.close(); // 关闭流
    }

    public void readFile() throws IOException{
        /*
        Reader本质上是一个基于InputStream的byte到char的转换器
        * InputStream input = new FileInputStream("src/readme.txt");
        * Reader reader = new InputStreamReader(input, "UTF-8");
        * */

        // 设置一个缓冲区，每次尽可能地填充缓冲区
        try(Reader reader = new FileReader("src/readme.txt")){
            char[] buffer = new char[1000];
            int n;
            while((n = reader.read(buffer)) != -1){
                System.out.println("read " + n + " chars.");
            }
        }
    }

    public void writeFile() throws IOException{
        try(Writer writer = new FileWriter("src/readme.txt")){
            // 写入单个字符 void write(int c)
            writer.write('H');
            // 写入char[] void write(char[] c)
            writer.write("Hello".toCharArray());
            // 写入String void write(String s)
            writer.write("Hello");
        }
    }
}


































