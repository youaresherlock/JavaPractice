package com.liaoxuefeng.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // LocalDateTime 本地日期和时间
        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);

//        LocalDateTime dt = LocalDateTime.now();
//        LocalDate d = dt.toLocalDate();
//        LocalTime t = dt.toLocalTime();
    }
}
















