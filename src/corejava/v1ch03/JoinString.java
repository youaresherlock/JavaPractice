/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

public class JoinString {
    public static void main(String[] args) {
        // 需要用许多小段的字符串构建一个字符串，可以使用StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("hello ");
        builder.append("world");
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
