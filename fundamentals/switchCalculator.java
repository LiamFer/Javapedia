package fundamentals;

import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation;
        double number1, number2, result = 0;

        System.out.print("Which operation do you want to execute: ");
        operation = sc.next();
        System.out.print("\nFirst Number: ");
        number1 = sc.nextDouble();
        System.out.print("\nSecond Number: ");
        number2 = sc.nextDouble();

        switch (operation) {
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> result = number1 / number2;
            default -> System.exit(0);
        }

        System.out.printf("\nThe result of %.2f %s %.2f is equal to %.2f", number1, operation, number2, result);
        sc.close();
    }
}
