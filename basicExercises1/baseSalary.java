package basicExercises1;

import java.util.Scanner;

public class baseSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o salário base: ");
        double base = sc.nextDouble();
        double grat = base * 0.05;
        double tax = base * 0.07;
        double total = base+grat-tax;

        System.out.println("Você vai receber R$" + total + " no total");


    }
}
