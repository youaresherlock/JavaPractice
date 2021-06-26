package com.liaoxuefeng.time;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class PrintDemo {
    public static void main(String[] args) {
        int n = 123400;
        System.out.println(n);
        System.out.println(Integer.toHexString(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));

        // Java中时间戳通常是用long表示的毫秒数
        // long t = 1574208900123L;
        System.out.println(System.currentTimeMillis());
    }
}






























