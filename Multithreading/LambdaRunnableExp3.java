package Multithreading;

public class LambdaRunnableExp3 {
    public static void main(String[] args) {
        Runnable t1 = () -> {
            System.out.println("Run() inside Lambda expression");
        };

        Thread t2 = new Thread(t1);
        t2.start();
        Thread t3 = new Thread(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("Run() Overrided in anoynous inner class, without lambda");
            }
            
        });
        t3.start();
    }
}
