package com.liaoxuefeng.time;

import java.util.Arrays;
import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        // 有效的时区ID，有了时区，就可以对指定时间进行转换
        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+9:00"); // GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
        System.out.println(tzDefault.getID());
        System.out.println(tzGMT9.getID());
        System.out.println(tzNY.getID());

        // 获取系统支持的所有ID
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
    }
}























