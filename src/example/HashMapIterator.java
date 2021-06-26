package example;

import java.util.*;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap< String, String> hMap =
                new HashMap< String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection<String> cl = hMap.values();
        Iterator<String> itr = cl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 集合转数组
        List<String> list = new ArrayList<>();
        list.add("i");
        list.add("see");
        list.add("you");
        String[] s = list.toArray(new String[0]);

        for(int i = 0; i < s.length; i++){
            String contents = s[i];
            System.out.print(contents);
        }
    }
}























