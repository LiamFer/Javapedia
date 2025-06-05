package fundamentals;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean selected = false;

        while (!selected) {
            System.out.println("Choose an Option:\n1. Fº to Cº\n2. Cº to Fº");
            int option = sc.nextInt();
            if (option == 1 || option == 2) {
                selected = true;

                String from = option == 1 ? "Fº" : "Cº";
                System.out.printf("Insert the %s Temperature: ", from);
                double temperature = sc.nextDouble();
                double conversion = option == 1 ? (temperature-32)/1.8 : (temperature * 1.8) + 32;
                System.out.printf("\n%s to %s is equal to %.2f",from,option == 1 ? "Cº" : "Fº",conversion);

            } else {
                System.out.println("Invalid Option, please try again!");
            }
        }
        sc.close();
    }
}
