package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadsCollection {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        CopyOnWriteArrayList<Integer> data=  new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000000; i < 2000000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Total size: " + list.size());
    }
}