package foundation;

import java.lang.String;

public class ForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for(int number: numbers){
            System.out.print(number);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"clarence", "bobby", "charles"};
        for(String name: names){
            System.out.print(name);
            System.out.print(",");
        }

        /*
        StringBuilder相比较StringBuffer不是线程安全的,但有速度优势
         */
        StringBuilder buffer = new StringBuilder("clarence");
        buffer.append("www");
        System.out.println(buffer.capacity());
    }
}















