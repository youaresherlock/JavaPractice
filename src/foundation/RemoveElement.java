package foundation;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(2);
        numbers.add(23);
//        Iterator<Integer> iter = numbers.iterator();
//        while(iter.hasNext()){
//            Integer i = iter.next();
//            if(i < 10){
//                iter.remove();
//            }
//        }
        numbers.removeIf(i -> i < 10);
        System.out.println(numbers);

    }
}




































