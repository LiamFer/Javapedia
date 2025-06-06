package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean replay = true;

        do {
            System.out.println("Choose one:\n1.Rock\n2.Paper\n3.Scissors\n");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice < 1 || choice > 3) {
                System.out.println("INVALID OPTION!");
            } else {
                System.out.println(checkWinner(choice));
                System.out.print("Do you want to play again (y/n): ");
                replay = !sc.nextLine().equals("n");
            }

        } while (replay);
    }

    static String checkWinner(int choice) {
        Random rand = new Random();
        boolean win = false;
        String[] options = {"Rock", "Paper", "Scissors"};
        int computersChoice = rand.nextInt(1, 4);
        if (choice == computersChoice) {
            return "It's a Tie! " + options[choice-1] + " X " + options[computersChoice-1];
        }
        switch (choice) {
            case 1 -> {
                win = computersChoice == 3;
            }
            case 2 -> {
                win = computersChoice == 1;
            }
            case 3 -> {
                win = computersChoice == 2;
            }
        }
        if (win){
            return "YOU WON! You chose " + options[choice-1] + " and the Computer chose " + options[computersChoice-1];
        } else {
            return "YOU LOST! You chose " + options[choice-1] + " and the Computer chose " + options[computersChoice-1];
        }
    }

}
