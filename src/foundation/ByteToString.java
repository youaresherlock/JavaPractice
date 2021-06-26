package foundation;

public class ByteToString {
    public static void main(String[] args) {
        // byte数组转换成String字符串
        String str = "hello";
        byte[] srtbyte = str.getBytes();
        // byte[]转string
        String res = new String(srtbyte);
        System.out.println(res);
    }
}



































