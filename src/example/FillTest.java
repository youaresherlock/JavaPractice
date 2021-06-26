package example;

import java.util.Arrays;

public class FillTest {
    public static void main(String[] args) {
        // 数组填充
        int[] array = new int[6];
        Arrays.fill(array, 100);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println();
        // Arrays.fill(arrayname, starting index, ending index, value);
        Arrays.fill(array, 3, 6, 50);
        for(int item: array){
            System.out.println(item);
        }
    }
}





























