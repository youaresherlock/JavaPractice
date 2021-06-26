package example;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.Calendar;

public class LookUpDemo {

    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(Integer.class);

        System.out.println("" + osc.getName());

        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);

        System.out.println("" + osc2.getName());
    }
}



















