package basicExercises1;

public class Patient {
    static int patients = 0;
    static int patientsMale = 0;
    static int patients18to25 = 0;
    static int patientsAge = 0;
    static int patientWomenSpecific = 0;

    String name;
    int age;
    double height;
    double weight;
    boolean male;

    Patient(String name, int age, double height, double weight, boolean male) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.male = male;

        patients += 1;
        patients18to25 += age >= 18 && age <= 25 ? 1 : 0;
        patientsAge += male ? age : 0;
        patientsMale += male ? 1 : 0;
        if (!male && height >= 1.60 && height <= 1.70 && weight > 70){
            patientWomenSpecific+=1;
        }
    }

}
