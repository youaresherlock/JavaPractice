package com.liaoxuefeng.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TransferTimeZone {
    public static void main(String[] args) {
        // 将北京时间转换为纽约时间
        Calendar c = Calendar.getInstance();
        c.clear();
        // 设置为北京时区
        c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        // 设置年月日时分秒
        c.set(2019, 10 /* 11月 */, 20, 8, 15, 0);
        // 显示时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println(sdf.format(c.getTime()));
    }
}




























