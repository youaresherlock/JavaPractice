package com.liaoxuefeng.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ImoocMD {

    private static final String SRC = "time security md";

    public static void main(String[] args) {

    }

    public static void jdkMD5() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5Bytes = md.digest(SRC.getBytes());
//        System.out.println(Hex.encodeHexString(md5Bytes));
    }
}





























