package fundamentals;

import java.util.Random;
import java.util.Scanner;

public class bankingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double account = rand.nextDouble(1000, 5000);
        boolean exit = false;

        do {
            int option;
            System.out.println("Welcome to the bank!\n1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            option = sc.nextInt();
            switch (option) {
                case 1 -> showBalance(account);
                case 2 -> account = depositMoney(account,askAmount(sc));
                case 3 -> account = withdrawMoney(account,askAmount(sc));
                case 4 -> {
                    System.out.println("Finishing your Session...");
                    exit = true;
                }
                default -> System.out.println("Operation Doesn't exist!");
            }

        } while (!exit);
        sc.close();
    }

    static double askAmount(Scanner sc){
        System.out.print("Type the Amount: ");
        return sc.nextDouble();
    }

    static void showBalance(double account) {
        System.out.printf("\nYou have $%.2f in your Bank Account!",account);
    }

    static double depositMoney(double account, double amount) {
        System.out.printf("\nYou deposited $%.2f to your account!",amount);
        account += amount;
        return account;
    }

    static double withdrawMoney(double account, double amount) {
        if (amount <= account) {
            account -= amount;
            System.out.printf("\nYou withdrawed $%.2f from your account!",amount);
        } else {
            System.out.print("\nOperation Unauthorized!");
        }
        return account;
    }
}

