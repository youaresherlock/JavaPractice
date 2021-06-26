package advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {
    public static void main(String[] args) {
        // 正则匹配
//        String content = "Work in Huawei.";
//        String pattern = ".*Huawei.*";
//        boolean isMatch = Pattern.matches(pattern, content);
//        System.out.println(isMatch); // true

        //捕获组使用
        String line = "This order was placed for QT3000! OK?";
        // \\D元字符 [^0-9]
        String pattern = "(\\D*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}













































