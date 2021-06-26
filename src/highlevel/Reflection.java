package highlevel;

public class Reflection {
    public static void main(String[] args) {
        /**
         * 获取到String的Class
         * Class cls = String.class;
         * String s = "";
         * Class cls = s.getClass();
         * Class s = Class.forName("java.lang.String");
         *
         * class java.lang.Number
         * class java.lang.Object
         * null
         */
//        Class i = Integer.class;
//        Class n = i.getSuperclass();
//        System.out.println(n);
//        Class o = n.getSuperclass();
//        System.out.println(o);
//        System.out.println(o.getSuperclass());

        // 获取interface
//        Class s = Integer.class;
        Class s = Integer.class.getSuperclass();
        Class[] is = s.getInterfaces();
        for(Class i: is){
            System.out.println(i);
        }
    }
}
