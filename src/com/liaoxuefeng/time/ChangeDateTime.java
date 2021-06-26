package com.liaoxuefeng.time;

import java.time.LocalDateTime;

public class ChangeDateTime {
    public static void main(String[] args) {
        // LocalDateTime提供了对日期和时间进行加载的非常简单的链式调用
        LocalDateTime dt = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        System.out.println(dt);
        // 加5天减3小时
        LocalDateTime dt2 = dt.plusDays(5).minusHours(3);
        System.out.println(dt2);
        // 减1月
        LocalDateTime dt3 = dt2.minusMonths(1);
        System.out.println(dt3);
    }
}


































