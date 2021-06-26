package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMerge {
    public static void main(String[] args) {
        // 数组合并
        String[] a = {"A", "E", "I"};
        String[] b = {"O", "U"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        System.out.println(list);
    }
}



























