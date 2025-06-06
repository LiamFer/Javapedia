package fundamentals;

public class Student {
    // Static
    static int students = 0;
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor
    Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
        students+=1;
    }

    // Constructor Overloading
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gpa = 0;
        this.isEnrolled = true;
        students+=1;
    }

    void study(){
        System.out.printf("%s is studying now!\n",this.name);
    }
}
