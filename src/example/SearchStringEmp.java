package example;

public class SearchStringEmp {
    public static void main(String[] args) {
        //字符串搜索
        String strOrig = "Google Runoob Taobao Runoob";
        int intIndex = strOrig.indexOf("Runoob");
        if(intIndex == - 1){
            System.out.println("没有找到字符串 Runoob");
        }else{
            System.out.println("Runoob 字符串位置 " + intIndex);
        }
    }
}
