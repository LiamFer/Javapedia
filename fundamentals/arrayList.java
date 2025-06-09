package fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> orders = new ArrayList<>();
        boolean keepOrdering = true;

        do {
            System.out.print("What do you want to add to your order: ");
            orders.add(sc.nextLine());
            System.out.print("Do you want to order something more (y/n): ");
            keepOrdering = sc.nextLine().equals("y");
        } while (keepOrdering);

        System.out.println("---- ORDERED ITEMS ----");
        for(String item : orders){
            System.out.printf("%d. %s",orders.indexOf(item)+1,item);
        }

        sc.close();
    }

}
