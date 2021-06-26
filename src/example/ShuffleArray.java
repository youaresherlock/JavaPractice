package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println("打乱前:");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}





















