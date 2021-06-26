package com.liaoxuefeng.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        // 设置成特定的一个日期和时间 先清除所有字段
        Calendar c = Calendar.getInstance();
        // 清除所有
        c.clear();
        // 设置2019年
        c.set(Calendar.YEAR, 2019);
        // 设置9月
        c.set(Calendar.MONTH, 8);
        // 设置2日
        c.set(Calendar.DATE, 2);
        // 设置时间
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 22);
        c.set(Calendar.SECOND, 23);

        // Calendar.getTime()可以将一个Calendar对象转换成Date对象，然后就可以用SimpleDateFormat进行格式化了
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
    }
}




















