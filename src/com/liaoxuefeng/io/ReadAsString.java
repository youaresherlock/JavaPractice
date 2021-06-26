package com.liaoxuefeng.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadAsString {
    public static void main(String[] args) throws IOException {
        String s;
        try(InputStream input = new FileInputStream("C:\\Users\\x30009363\\IdeaProjects\\practice\\src\\com\\liaoxuefeng\\io\\redme.txt")){
            s = readAsString(input);
        }

        System.out.println(s);
    }

    public static String readAsString(InputStream input) throws IOException{
        int n;
        StringBuilder sb = new StringBuilder();
        while((n = input.read()) != -1){
            sb.append((char)n);
        }

        return sb.toString();
    }
}


























