package fundamentals;

import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = false;

        System.out.println("Welcome to the Java Weight Converter!");
        while (!done) {
            System.out.println("Pick an option ->\n\n1. Lbs to Kgs\n2. Kgs to Lbs");
            int option = sc.nextInt();
            if (option == 1) {
                done = true;
                System.out.print("Weight in Lbs: ");
                double lbs = sc.nextDouble();
                System.out.printf("\n%.2fLbs is %.2fKgs",lbs,lbs/2.205);
            } else if (option == 2) {
                done = true;
                System.out.print("Weight in Kgs: ");
                double kgs = sc.nextDouble();
                System.out.printf("\n%.2fKgs is %.2fLbs",kgs,kgs*2.205);
            } else {
                System.out.println("Invalid Option!");
            }
        }

        sc.close();
    }
}
