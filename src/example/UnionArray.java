package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        //数组并集
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下:");

        for(String str: result_union){
            System.out.println(str);
        }
    }

    public static String[] union(String[] arr1, String[] arr2){
        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList(arr1));

        set.addAll(Arrays.asList(arr1));

        String[] result = {};
        return set.toArray(result);
    }
}
