package basicExercises1;

import java.util.Scanner;

public class finalGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual sua media final: ");
        double grade = sc.nextDouble();

        if(grade < 7){
            System.out.println("Você precisa estudar mais");
        } else if(grade == 7){
            System.out.println("Você foi aprovado");
        } else if(grade > 7 && grade < 8){
            System.out.println("Parabéns, suas notas ficaram acima da média");
        } else if (grade >= 8 && grade < 9) {
            System.out.println("Parabéns,sua média ficou próxima da nota máxima");
        } else {
            System.out.println("Parabéns, você é um excelente aluno");
        }


    }
}
