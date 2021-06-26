package com.liaoxuefeng.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerializationDemo {
    /**
     * 一个java对象要能序列化，必须实现
     * java.io.Serializable接口
     * public interface Serializable{}
     * 是一个空接口，标记接口
     */
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
            // 写入int
            output.writeInt(12345);
            // 写入String
            output.writeUTF("Hello");
            // 写入Object
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}



































