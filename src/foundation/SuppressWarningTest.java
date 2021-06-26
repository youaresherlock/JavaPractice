package foundation;

import java.util.Date;


public class SuppressWarningTest {

    // SuppressWarnings让编译器对"它所标注的内容"的某些警告保持静默
    @SuppressWarnings(value={"deprecation"})
    public static void doSomething(){
        Date date = new Date(113, 8, 26);
        System.out.println(date);
    }

    public static void main(String[] args) {
        doSomething();
    }
}