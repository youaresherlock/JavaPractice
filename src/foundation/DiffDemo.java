package foundation;

import java.util.Calendar;

public class DiffDemo {
    public static void main(String[] args) {
        try{
            long start = System.currentTimeMillis();
            Thread.sleep(3000);
            long end = System.currentTimeMillis();
            long diff = end - start; 
            System.out.println("Difference is: " + diff);
        } catch(Exception e){
            System.out.println("Got an exception!");
        }

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month =  c.get(Calendar.MONTH) + 1;
        int data = c.get(Calendar.DATE);
        System.out.println(year + " " + month + " " + data);
    }
}





































