package com.liaoxuefeng.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FilesUtilDemo {
    public static void main(String[] args) throws IOException {
        /**
         * java 7开始,提供了Files和Paths两个
         * 工具类，极大地方便我们读写文件
         */
        // 将文件的全部内容读取为一个byte[]
        byte[] data = Files.readAllBytes(Paths.get("./read.txt"));
        System.out.println(new String(data));

        // 读取文本文件，读成String
//        String content1 = Files.readString(Paths.get("./read.txt"), StandardCharsets.ISO_8859_1);
        // 按行读取并返回每行内容
        List<String> lines = Files.readAllLines(Paths.get("./read.txt"));
        for(String str: lines){
            System.out.println(str);
        }

        // 写入二进制文件
        Files.write(Paths.get("./read.txt"), data);
        // 按行写入文本
        Files.write(Paths.get("./read.txt"), lines);
    }
}








































