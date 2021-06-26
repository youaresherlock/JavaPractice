package foundation;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        泛型的限制
        如下所示不能使用基本数据类型实例化泛型类型
        Pair<int, char> p;
         */
        HashSet<String> sites = new HashSet<>();
        sites.add("google");
        sites.add("wiki");
        sites.add("kiki");
        System.out.println(sites);
        //contains()判断元素是否存在
        System.out.println(sites.contains("wiki"));
        //删除元素remove()
        //删除集合中所有元素clear()
        //集合大小size()
        for(String str: sites){
            System.out.println(str);
        }
    }
}











































