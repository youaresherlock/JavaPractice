/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        /**
         * BigInteger和BigDecimal实现了任意精度的整数运算/浮点数运算
         * 需要使用大数值类的add和multiply方法来实现加减乘除,因为与
         * C++不同，Java没有提供运算符重载功能。程序员无法重定义+和*运算符
         * Java语言的设计者确实为字符串的连接重载了+运算符,但没有重载其他
         * 运算符
         */
        BigInteger a = BigInteger.valueOf(100);
        BigInteger c = a.add(BigInteger.valueOf(2));

        System.out.println(c.toString());
    }
}















































