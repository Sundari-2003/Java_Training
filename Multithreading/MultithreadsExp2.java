package Multithreading;

class Multithreading implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Runnable interface. The running thread is: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultithreadsExp2 {
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();

        Thread thread1 = new Thread(t1, "Thread - 1 | Rohit");
        Thread thread2 = new Thread(t1, "Thread - 2 | Mona");
        Thread thread3 = new Thread(t1, "Thread - 3 | Shruthi");
        Thread thread4 = new Thread(t1, "Thread - 4 | Anu");

        thread2.setDaemon(true);
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println(thread1.getName() + " Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());
        System.out.println(thread3.getName() + " Priority: " + thread3.getPriority());
        System.out.println(thread4.getName() + " Priority: " + thread4.getPriority());

    }
}