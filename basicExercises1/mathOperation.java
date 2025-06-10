package basicExercises1;

import java.util.Scanner;

public class mathOperation {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação (+,-,*,/): ");
        String operation = sc.next();

        switch (operation){
            case "+" -> System.out.printf("%.2f + %.2f = %.2f",n1,n2,n1+n2);
            case "-" -> System.out.printf("%.2f - %.2f = %.2f",n1,n2,n1-n2);
            case "*" -> System.out.printf("%.2f * %.2f = %.2f",n1,n2,n1*n2);
            case "/" -> System.out.printf("%.2f / %.2f = %.2f",n1,n2,n1/n2);
            default -> System.out.println(operation + " não é uma operação matemática válida!");
        }
    }
}
