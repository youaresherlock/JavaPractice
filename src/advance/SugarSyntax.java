package advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SugarSyntax {
    public static void main(String[] args) {
        /*
        匿名内部类和lambda表达式
         */
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Starting Thread!");
            }
        }).start();

        /**
         * (params)->expr
         * (params)->{statements;}
         */
        new Thread(
//                ()->System.out.println("Starting Thread!)
                ()->{System.out.println("Starting Thread!");}
        ).start();

        List<String> list = Arrays.asList("lambda", "is", "wonderful");
        list.sort((s1, s2) -> {
            // 空字符串排在最前面
            if (s1 == null) {
                return -1;
            }

            if (s2 == null) {
                return -1;
            }

            return s1.length() - s2.length();
        });
        System.out.println(list);

        //InputStream/OutputStream字节流 Reader/Writer字符流
    }
}









































