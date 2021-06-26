/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.util.Arrays;

/**
 * 多维数组，用来显示在不同利率下投资$10000会增长多少,
 * 利息每年兑现,而且又被用于投资
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int MRATES = 6;
        final int MYEARS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[MRATES];
        for (int j = 0; j < interestRate.length; j++) {
            // 注意除法浮点数 由于STARTRATE是double,所以分母可以不是double
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[MYEARS][MRATES];

        // set initial balances to 10000
        Arrays.fill(balances[0], 10000);

        // compute interest for future years
        // balances.length balances数组的行数
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest =  oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        // print balance table
        for (double[] row: balances) {
            for (double b: row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}












































































