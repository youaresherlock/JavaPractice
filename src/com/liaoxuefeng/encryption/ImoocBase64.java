package com.liaoxuefeng.encryption;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class ImoocBase64 {
    private static final String SRC = "time security base64";
    public static void main(String[] args) throws IOException {
        jdkBase64();
    }

    public static void jdkBase64() throws IOException {
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(SRC.getBytes());
        System.out.println("encode: " + encode);

        BASE64Decoder decoder = new BASE64Decoder();
        System.out.println("decode: " + new String(decoder.decodeBuffer(encode)));
    }
}










































