package com.liaoxuefeng.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date(); // 当前时间
//        System.out.println(date.getYear() + 1900);
//        System.out.println(date.getMonth() + 1);
//        System.out.println(date.getDate());
//        // 转为String
//        System.out.println(date.toString());
//        // 转换为GMT时区
//        System.out.println(date.toGMTString());
//        // 转换为本地时区
//        System.out.println(date.toLocaleString());

        // 自定义的格式输出
        SimpleDateFormat var = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(var.format(date));
    }
}





























