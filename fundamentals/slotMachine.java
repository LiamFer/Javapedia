package fundamentals;
import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    static String[] slots = {"🍉", "🍊", "🍇"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyEarned = 0;
        boolean play = true;
        do {
            System.out.print("How much do you want to Gamble: ");
            double gambleAmount = sc.nextInt();
            sc.nextLine();
            moneyEarned += SlotMachine(gambleAmount);
            System.out.println("Your total money is $" + moneyEarned);
            System.out.print("Do you want to GAMBLE AGAIN? (y/n): ");
            play = sc.nextLine().equals("y");
        } while (play);

    }

    public static int[] runSlotMachine(){
        Random rand = new Random();
        int[] slots = new int[3];
        for (int i = 0; i < 3;i++){
            slots[i] = rand.nextInt(0,3);
        }
        return slots;
    }

    public static void buildVisor(int[] result){
        System.out.println("-----------");
        for(int value : result){
            System.out.print(slots[value] + " ");
        }
        System.out.println("\n-----------");
    }

    public static double SlotMachine(double amount){
        int[] result = runSlotMachine();
        buildVisor(result);
        if (result[0] == result[1] && result[1] == result[2]){
            System.out.println("YOU WON LET'S GAMBLE WOOHOOO!");
            return amount*2;
        }
        System.out.println("You lost!");
        return 0;
    }
}
