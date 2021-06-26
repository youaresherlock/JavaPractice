package advance;

import java.util.concurrent.atomic.AtomicInteger;

public class CountDemo {
    private static AtomicInteger count;

    public static class CountThread extends Thread{
        @Override
        public void run(){
            count.addAndGet(1);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new CountThread();
        Thread t2 = new CountThread();
        t1.start();
        t2.start();
    }
}
































