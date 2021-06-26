package com.liaoxuefeng.time;

import java.time.LocalDateTime;

public class ChangeTimeDemo {
    public static void main(String[] args) {
        /**
         * 对日期和时间进行调整则使用withXxx()方法
         */
        LocalDateTime dt = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        System.out.println(dt);
        // 日期变为31日:
        LocalDateTime dt2 = dt.withDayOfMonth(31);
        System.out.println(dt2); // 2019-10-31T20:30:59
        // 月份变为9:
        LocalDateTime dt3 = dt2.withMonth(9);
        System.out.println(dt3); // 2019-09-30T20:30:59
    }
}

























