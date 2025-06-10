package basicExercises1;

import java.util.Scanner;

public class patients {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String oldestManName = "";
        int oldestManAge = 0;

        String smallestWomanName = "";
        Double smallestWomanHeight = Double.POSITIVE_INFINITY;
        boolean keepGoing = true;

        do{
            System.out.print("Patient name: ");
            String name = sc.nextLine();

            System.out.print("Patient age: ");
            int age = sc.nextInt();

            System.out.print("Patient height: ");
            double height = sc.nextDouble();

            System.out.print("Patient weight: ");
            double weight = sc.nextDouble();

            System.out.print("Patient Gender (m/f): ");
            boolean male = sc.next().equalsIgnoreCase("m");

            if (male && age > oldestManAge){
                oldestManName = name;
                oldestManAge = age;
            } else if (!male && height < smallestWomanHeight){
                smallestWomanName = name;
                smallestWomanHeight = height;
            }



            new Patient(name,age,height,weight, male);

            System.out.println("Keep adding more patients? (y/n) ");
            keepGoing = sc.next().equalsIgnoreCase("y");
            sc.nextLine();
        }while(keepGoing);

        System.out.println("TOTAL PATIENTS: " + Patient.patients);
        System.out.println("TOTAL PATIENTS (18-25): " + Patient.patients18to25);
        System.out.println("TOTAL MALE AGE AVERAGE: " + Patient.patientsAge/Patient.patientsMale);
        System.out.println("TOTAL SPECIFIC WOMAN: " + Patient.patientWomenSpecific);

        System.out.println("OLDEST MAN: " + oldestManName);
        System.out.println("SMALLEST WOMAN: " + smallestWomanName);



    }
}

