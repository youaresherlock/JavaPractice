package com.liaoxuefeng.io;

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        StringWriter buffer = new StringWriter();
        try(PrintWriter pw = new PrintWriter(buffer)){
            pw.println("hello");
            pw.println(12345);
            pw.println(true);
        }
        System.out.println(buffer.toString());
    }
}




































