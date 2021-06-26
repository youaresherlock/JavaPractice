/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

// 利用关键字final指示常量
public class Constants {
    // 类常量
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        // String类对象称为不可变字符串 编译器可以让字符串共享
        double paperWidth = 8.5;
        double paperHeight = 11;
        // 当将一个字符串与一个非字符串的值进行拼接时,后者被转换成字符串,任何一个
        // Java对象都可以转换成字符串
        System.out.println("Paper size is centimeters: "
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        int n = 123456789;
        float f = n;
        System.out.print(f);
        /**
         * 如果运算符得到一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换
         */
        int x = 4;
        // (int)(x+3.5)
        x += 3.5;
        System.out.println(x);
        int fourthBitFromRight = (8 & 0b1000) / 0b1000;
        // int fourthBitFromRight = (8 & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);
        System.out.println("hello".equalsIgnoreCase("hello"));
    }
}


























