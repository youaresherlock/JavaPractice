package advance;

import java.util.Arrays;

public class ArraySortDemo {
    /*
    Arrays.sort(Object[]) 可以对任意数组进行排序,但待排序的元素必须实现Comparable<T>这个泛型接口
     */
    public static void main(String[] args) {
        //String本身已经实现了Comparable<String>接口
        String[] ss = new String[] {"Orange", "Apple", "Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
    }
}
























