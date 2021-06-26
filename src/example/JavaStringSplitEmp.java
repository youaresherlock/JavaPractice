package example;

public class JavaStringSplitEmp {
    public static void main(String[] args) {
        // 字符串分割
        String str = "www-wiki-com";
        String[] temp;
        String flag = "-";
        temp = str.split(flag);
        for(String item: temp){
            System.out.println(item);
            System.out.println("");
        }
    }
}






























