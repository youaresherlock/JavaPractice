/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.practice;

import java.util.HashSet;
import java.util.Set;

public class ForEach {
    public static void main(String[] args) {
        Set<String> roleIds = new HashSet<>();
        roleIds.add("clarence");
        roleIds.add("xian");
        StringBuilder roleIdStr = new StringBuilder();
        roleIds.forEach(e -> roleIdStr.append(e).append("&"));
        System.out.println(roleIdStr.toString().substring(0, roleIdStr.length() - 1));
    }
}
