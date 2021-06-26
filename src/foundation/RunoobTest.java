package foundation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RunoobTest {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> sites = new ArrayList<>();
        sites.add("goods");
        sites.add("run");
        sites.add("wechat");
        sites.add("weibo");
        System.out.println(sites);
//        //访问元素
//        System.out.println(sites.get(1));
//        //修改元素
//        sites.set(2, "wiki");
//        //删除元素
//        sites.remove(3);
//        //计算大小
//        System.out.println(sites.size());
//        //字母排序
//        Collections.sort(sites);

        //四种遍历方法

        //1
        for(int i = 0; i < sites.size(); i++){
            System.out.println(sites.get(i));
        }

        //2
        for(String str: sites){
            System.out.println(str);
        }

        //3把链表变为数组相关的内容进行遍历
        String[] strArray = new String[sites.size()];
        sites.toArray(strArray);
        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        //4
        Iterator<String> iter = sites.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}






































