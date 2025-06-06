package fundamentals;

public class objectedOriented {
    public static void main(String[] args) {
        Car car = new Car();
        Student student1 = new Student("Liam",20,3.9,true);
        Student student2 = new Student("Heath",25);

        student1.study();
        student2.study();
        System.out.println("Our school have " + Student.students + " Students");
    }
}
