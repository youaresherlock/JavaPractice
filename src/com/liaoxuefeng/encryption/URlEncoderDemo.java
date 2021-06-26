package com.liaoxuefeng.encryption;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URlEncoderDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encoded = URLEncoder.encode("中文!", String.valueOf(StandardCharsets.UTF_8));
        System.out.println(encoded);
    }
}























