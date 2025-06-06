package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class arraySizing {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Set the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        sc.nextLine();
        for (int i = 0; i < numbers.length; i++){
            System.out.print("\nInsert a number: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
