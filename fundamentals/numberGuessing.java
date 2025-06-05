package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(1, 10 + 1);
        int guess;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();

            if(guess == number){
                System.out.printf("\nYou're right! the number is %d!",guess);
            } else {
                System.out.println("You're WRONG! Try Again!!");
            }

        }
        while (guess != number);

    }
}
