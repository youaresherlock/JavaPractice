/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.util.Scanner;

/**
 * 将计算需要多长时间才能存储一定数量的退休金,假定
 * 每年存入相同数量的金额，而且利率是固定的。
 */
public class Retirement {
    public static void main(String[] args) {
        // 检测两个浮点数是否相等要格外小心 0.1无法精确地用二进制表示
        // for (double x = 0; x< 12; x += 0.1) {
        //     System.out.println(x);
        // }
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years.");
    }
}










































