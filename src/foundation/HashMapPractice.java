package foundation;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<>();
        sites.put(1, "google");
        sites.put(2, "wiki");
        sites.put(3, "baidu");
        sites.put(4, "bing");
        System.out.println(sites);
        System.out.println(sites.get(4));

        //迭代HashMap
        for(Integer i: sites.keySet()){
            System.out.println("key: " + i + " value: " + sites.get(i));
        }
        for(String value: sites.values()){
            System.out.println(value + ",");
        }
    }
}









































