// This demonstrates the race condition

package Multithreading;

public class RaceDemo {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        // Runnable interface Object and convert to the thread class!
        // Below is the implementation of Runnable Interface only, if doubt refer to
        // LambdaRunnableExp3.java

        Thread t1 = new Thread(() -> {
            System.out.println("run() thread 1 " + count);
            for (int i = 0; i < 150000; i++) {
                count++;
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("run() thread 2 " + count);
            for (int i = 0; i < 150000; i++) {
                count++;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count Value: " + count);
    }

}
