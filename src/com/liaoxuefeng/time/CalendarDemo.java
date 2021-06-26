package com.liaoxuefeng.time;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.awt.*;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // Calendar比Date要多了一个可以做简单的日期和时间运算的功能
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = 1 + c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        // 1-7分别表示周日, 周一,...,周六
        int w = c.get(Calendar.DAY_OF_WEEK);
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);
    }
}























