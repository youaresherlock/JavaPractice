/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.reflection;

import java.io.Closeable;
import java.io.IOException;

public class MyAutoClosable implements Closeable {
    /*
     * try-with-resources���ȷ�������ִ����Ϻ�ÿ����Դ����
     * �Զ��ر�
     * �κ�ʵ����java.lang.AutoCloseable�Ķ��󣬰�������ʵ����
     * java.io.Closeable�Ķ��󣬶���������һ����Դ
     * Scanner��ʵ��java.io.Closeable�ӿ�,
     * java.io.Closeableʵ����AutoCloseable�ӿ�
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










































