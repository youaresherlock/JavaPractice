/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 要对文件进行读取，就需要一个用File对象构造一个Scanner对象
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        // Scanner("myfile.txt")将参数作为包含10个字符的数据
        // Path实例的工厂方法
        Scanner in = new Scanner(Paths.get("C:\\Users\\x30009363\\IdeaProjects\\practice\\src\\corejava\\v1ch30\\readme.txt"), "UTF-8");

        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }

        // java虚拟机启动的相对位置
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}















































