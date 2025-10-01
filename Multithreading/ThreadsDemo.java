package Multithreading;

class Exp1 extends Thread
{
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Run()");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Exp1();

        System.out.println("Before Execute thread state: " + t1.getState());
        System.out.println("Before Execution thread status Alive?: " + t1.isAlive());
        System.out.println("Id: " + t1.getId() + " Name: " + t1.getName());
        t1.start();

        System.out.println("After start thread state: " + t1.getState());
        System.out.println("After start thread status Alive?: " + t1.isAlive());
        System.out.println("Id: " + t1.getId() + " Name: " + t1.getName());

        Thread.sleep(1000);
        System.out.println("In Sleep thread state: " + t1.getState());
        System.out.println("In sleep thread status Alive?: " + t1.isAlive());
        System.out.println("Id: " + t1.getId() + " Name: " + t1.getName());

        t1.join(); // only t1 will execute 

        System.out.println("After Joining thread state: " + t1.getState());
        System.out.println("After Joining thread status Alive?: " + t1.isAlive());
        System.out.println("Id: " + t1.getId() + " Name: " + t1.getName());




    }
    
}
