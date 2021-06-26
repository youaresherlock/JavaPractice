package example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) throws IOException {
        // 数组转集合
        int n = 5;
        String[] name = new String[n];
        for(int i = 0; i < n; i++){
            name[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li: list){
            System.out.print(li + " ");
        }
    }
}



























