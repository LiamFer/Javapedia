package fundamentals;
import java.util.Scanner;

public class shoppingCart {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What do you want do buy: ");
        String item = sc.nextLine();

        System.out.print("How much is this item: ");
        double price = sc.nextDouble();

        System.out.print("How many " + item + " do you want to buy: ");
        int quantity = sc.nextInt();

        System.out.print(String.format("You just bought %d %s for $ %f",quantity,item,price*quantity));
    }

}
