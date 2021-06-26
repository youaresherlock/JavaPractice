package com.liaoxuefeng.encryption;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Md5Demo {
    public static void main(String[] args)throws Exception{
        // 创建一个MessageDigest实例
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        // 反复调用update输入数据
        md.update("Hello".getBytes(StandardCharsets.UTF_8));
        md.update("World".getBytes(StandardCharsets.UTF_8));
        byte[] result = md.digest(); // 16 bytes
        System.out.println(new BigInteger(1, result).toString(16));
    }
}





























