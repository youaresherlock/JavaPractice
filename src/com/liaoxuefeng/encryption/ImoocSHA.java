package com.liaoxuefeng.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ImoocSHA {

    private static final String SRC = "time security sha";

    public static void main(String[] args) {

    }

    public static void jdkSHA1() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(SRC.getBytes());

//        System.out.println(Hex.encodeHexString(md.digest()));
    }
}
































