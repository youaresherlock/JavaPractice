package com.liaoxuefeng.io;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CountFilterDemo {
    public static void main(String[] args)throws IOException {
        // 装饰器模式 编写FilterInputStream 对输入的字节进行计数
        byte[] data = "hello, world!".getBytes("UTF-8");
        try(CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))){
            int n;
            while((n = input.read()) != -1){
                System.out.println((char)n);
            }

            System.out.println("Total read " + input.getBytesRead() + " bytes");
        }
    }
}

class CountInputStream extends FilterInputStream {
    private int count = 0;

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected CountInputStream(InputStream in) {
        super(in);
    }

    public int getBytesRead(){
        return this.count;
    }

    public int read() throws IOException{
        int n = in.read();
        if(n != -1){
            this.count ++;
        }

        return n;
    }

    public int read(byte[] b, int off, int len) throws IOException{
        int n = in.read(b, off, len);
        if(n != -1){
            this.count += n;
        }

        return n;
    }
}






































