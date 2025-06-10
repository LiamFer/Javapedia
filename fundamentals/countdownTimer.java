package fundamentals;

import java.util.Timer;
import java.util.TimerTask;

public class countdownTimer {
    public static void main (String[] args){
        Timer timer = new Timer();
        TimerTask countdown = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                System.out.println(count);
                if (count == 0){
                    this.cancel();
                    timer.cancel();
                }
                count--;
            }
        };
        timer.schedule(countdown,0,1000);
    }
}
