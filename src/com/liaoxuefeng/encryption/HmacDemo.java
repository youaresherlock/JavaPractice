package com.liaoxuefeng.encryption;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HmacDemo {
    private static final String SRC = "time security sha";

    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
        jdkHmacMD5();
    }

    public static void jdkHmacMD5() throws NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
        SecretKey secretKey = keyGenerator.generateKey(); // 产生秘钥
        byte[] key = secretKey.getEncoded(); // 获得秘钥

        SecretKey restoreSecretKey = new SecretKeySpec(key, "HmacMD5");
        Mac mac = Mac.getInstance(restoreSecretKey.getAlgorithm()); // 实例化MAC
        mac.init(restoreSecretKey);

        byte[] hmacMD5Bytes = mac.doFinal(SRC.getBytes()); // 执行摘要
//        System.out.println("jdk hmacMD5: " + Hex.encodeHexString(hmacMD5Bytes));
     }
}















































