package foundation;

import java.util.Scanner;

//public class ScannerDemo {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        // 从键盘接收数据
//
//        System.out.println("nextLine方式接收");
//        while(scan.hasNextLine()){
//            String str = scan.nextLine();
//            System.out.println("输入的数据为: " + str);
//            if(str.equals("end")){
//                break;
//            }
//        }
//        scan.close();
//
//    }
//}

class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}







































