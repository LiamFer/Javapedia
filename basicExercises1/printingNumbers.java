package basicExercises1;

import java.util.ArrayList;
import java.util.Scanner;

public class printingNumbers {
    public static void main(String[] args) {

//        for(int i = 1;i<=100;i++){
//            System.out.println(i);
//        }

//        for(int i = 100; i >= 1; i--){
//            System.out.println(i);
//        }

//        int totalOdd = 0;
//        int totalEven = 0;
//        for(int i = 250; i <= 500; i++){
//            if(i%2!=0){
//                System.out.println(i);
//                totalOdd+=i;
//            } else {
//        System.out.println(i);
//              totalEven+=i
//            }
//        }
//        System.out.println("TOTAL ODD: " + totalOdd);
//        System.out.println("TOTAL EVEN: " + totalEven);


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> positives = new ArrayList<>();
        int number = 0;
        do {
            System.out.print("Insira um número: ");
            number = sc.nextInt();
            if (number >= 0) {
                positives.add(number);
            }
        } while (number >= 0);
        positives.forEach(p -> System.out.println(p));

//
//        9. Elabore um algoritmo que entre com números enquanto forem positivos e imprimir os números positivos digitados.

    }
}
