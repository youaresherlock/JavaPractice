package com.liaoxuefeng.encryption;

import java.util.Arrays;
import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        // 在java中,二进制数据就是byte[]数组.
        // Java标准库提供了Base64来对byte[]数组进行编解码
        byte[] input = new byte[]{(byte)0xe4, (byte)0xb8, (byte)0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);


        // 对base64解码
        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));
    }
}































