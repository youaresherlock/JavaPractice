package example;

public class SearchLastString {
    public static void main(String[] args) {
        //查找字符串最后一次出现的位置
        String strOrig = "hello world, hello runoob";
        int lastIndex = strOrig.lastIndexOf("runoob");
        if(lastIndex == -1){
            System.out.println("没有找到字符串runoob");
        } else {
            System.out.println("runoob字符串最后出现的位置: " + lastIndex);
        }
    }
}




































