package fundamentals;

import java.util.Scanner;

public class ThreadProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DefuseThread thread = new DefuseThread();
        Thread t = new Thread(thread);
        System.out.println("You have 5 seconds to defuse the bomb (defuse): ");
        t.setDaemon(true);
        t.start();
        boolean defuse = sc.nextLine().equalsIgnoreCase("defuse");

        System.out.println("The bomb has been Defused!");
    }
}
