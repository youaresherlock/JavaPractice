/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

public class PrivateMethod {
    private PrivateMethod() {
        System.out.println("constructor invoked");
    }

    public void sayHello() {
        System.out.println("say hello");
    }
}
