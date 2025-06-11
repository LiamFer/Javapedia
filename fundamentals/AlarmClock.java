package fundamentals;

import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = "";
        do {
            System.out.print("Insira um Horário (HH:mm:ss): ");
            time = sc.nextLine();
        } while (time.isBlank());
        System.out.println("ALARM SET TO " + time);
        Thread thread = new Thread(new Clock(time));
        thread.start();
    }
}
