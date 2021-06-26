package com.liaoxuefeng.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
    public static void main(String[] args) {
        // Calendar也可以对日期和时间进行简单的加减
        Calendar c = Calendar.getInstance();
        // 清除所有
        c.clear();
        c.set(2019, 10, 20, 8, 15, 0);
        // 加5天并减去2小时
        c.add(Calendar.DAY_OF_MONTH, 5);
        c.add(Calendar.HOUR_OF_DAY, -2);
        // 显示时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(c.getTime()));
    }
}



























