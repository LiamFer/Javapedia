package fundamentals;

import java.time.LocalTime;

public class Clock implements Runnable{
    private LocalTime time;

    Clock(String time){
        this.time = LocalTime.parse(time);
    }

    @Override
    public void run(){
        while(LocalTime.now().isBefore(time)){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ALARM ALARM ALARM! IT'S " + time.toString());
    }
}
