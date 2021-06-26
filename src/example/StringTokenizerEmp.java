package example;

import java.util.StringTokenizer;

public class StringTokenizerEmp {
    public static void main(String[] args) {
        // 分割字符串
        String str = "This is String , split by StringTokenizer, created by wiki";
        // 字符串小写转大写
        String strUpper = str.toUpperCase();
        System.out.println(strUpper);
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("-----通过空格分隔-----");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }

        StringTokenizer st2 = new StringTokenizer(str, ",");
        System.out.println("-----通过逗号分隔-----");
        while(st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}






































