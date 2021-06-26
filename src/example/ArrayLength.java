package example;

public class ArrayLength {
    public static void main(String[] args) {
        // 获取数组长度
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);
        System.out.println("第二维数组长度: " + data[0].length);
    }
}
