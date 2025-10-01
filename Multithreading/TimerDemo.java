package Multithreading;

import java.util.Timer;
import java.util.TimerTask;

class TimerTest extends TimerTask{
    private String taskName;

    public TimerTest(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(taskName + " task from timer");
    }
    
}

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTest("Credit"), 2000);
        timer.scheduleAtFixedRate(new TimerTest("Transfer"), 1000 , 3000);

        try {
            Thread.sleep(11000);
        } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
        timer.cancel();
        System.out.println("Timer Cancelled!!");
    }
}
