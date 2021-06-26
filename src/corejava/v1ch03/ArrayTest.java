/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.util.Arrays;

/**
 * 创建一个数字数组时,所有元素都初始化为0
 * boolean数组的元素会初始化为false
 * 对象数组的元素则初始化为一个特殊值null
 */
public class ArrayTest {
    public static void main(String[] args) {
         int[] a = {1, 2, 3, 4};
         // 不创建新变量的情况下重新初始化一个数组
         a = new int[]{2, 3, 4, 5};
         String[] names = new String[10];
         boolean[] bool = new boolean[10];

         // for (int i = 0; i < 10; i++) {
         //     System.out.println(a[i]);
         //     System.out.println(names[i]);
         //     System.out.println(bool[i]);
         // }

        // 更简单的方法打印数组中的值,使用Arrays类的toString方法
        System.out.println(Arrays.toString(a));

        // 可以创建一个长度为0的数组(空数组)
        // new elementType[0]

        /*
        * int[] luckyNumbers = smallPrimes;
        * luckyNumbers[5] = 12; 两个变量将引用同一个数组
        *
        * 如果希望将一个数组的所有值拷贝到一个新的数组中去,使用Arrays.copyOf方法
        * int[] copiedLuckyNumbers = Arrays.copyOf(luckNumbers, luckNumbers.length);
        * 第二个参数是新数组的长度，这个方法通常用来增加数组的大小
        * int[] copiedLuckyNumbers = Arrays.copyOf(luckNumbers, 2 * luckNumbers.length);
        * */
    }
}
























































