package fundamentals;
import java.util.Scanner;

public class stringMethods {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean containsAt = false;
        while(!containsAt){
            System.out.print("What's your email: ");
            String email = sc.nextLine();
            if (email.contains("@")) {
                containsAt = true;
                int atIndex = email.indexOf("@");
                String name = email.substring(0, atIndex);
                String domain = email.substring(atIndex);
                System.out.printf("\nYour email name is %s and the domain you use is %s!", name, domain);
            }
        }



        sc.close();
    }
}
