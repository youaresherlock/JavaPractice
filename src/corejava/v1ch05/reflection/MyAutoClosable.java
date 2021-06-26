/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

import java.io.Closeable;
import java.io.IOException;

public class MyAutoClosable implements Closeable {
    /*
     * try-with-resources语句确保在语句执行完毕后，每个资源都被
     * 自动关闭
     * 任何实现了java.lang.AutoCloseable的对象，包括所有实现了
     * java.io.Closeable的对象，都可以用作一个资源
     * Scanner类实现java.io.Closeable接口,
     * java.io.Closeable实现了AutoCloseable接口
     */
    public static void main(String[] args) {
        try (MyAutoClosable close = new MyAutoClosable()) {
            close.doIt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }

    @Override
    public void close() throws IOException {
        System.out.println("MyAutoClosable closed!");
        throw new IOException();
    }
}










































