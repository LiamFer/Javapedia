package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class diceRolling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int total = 0;

        System.out.print("How many times do you want to roll the dice: ");
        int times = sc.nextInt();

        if (times > 0) {
            for (int i = 0; i < times; i++) {
                int roll = rand.nextInt(1, 7);
                System.out.println("You rolled an " + roll);
                diceASCII(roll);
                total += roll;
            }
            System.out.printf("\nIn total you rolled %d !", total);
        } else {
            System.out.println("ERROR!");
        }

        sc.close();
    }

    static void diceASCII(int roll) {
        switch (roll) {
            case 1 -> {
                System.out.println("+-------+\n" +
                        "|       |\n" +
                        "|   o   |\n" +
                        "|       |\n" +
                        "+-------+");
            }case 2 -> {
                System.out.println("+-------+\n" +
                        "| o     |\n" +
                        "|       |\n" +
                        "|     o |\n" +
                        "+-------+");
            }case 3 -> {
                System.out.println("+-------+\n" +
                        "| o     |\n" +
                        "|   o   |\n" +
                        "|     o |\n" +
                        "+-------+");
            }case 4 -> {
                System.out.println("+-------+\n" +
                        "| o   o |\n" +
                        "|       |\n" +
                        "| o   o |\n" +
                        "+-------+");
            }case 5 -> {
                System.out.println("+-------+\n" +
                        "| o   o |\n" +
                        "|   o   |\n" +
                        "| o   o |\n" +
                        "+-------+");
            }case 6 -> {
                System.out.println("+-------+\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        "+-------+");
            }
        }
    }
}
