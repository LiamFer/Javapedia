package fundamentals;

public class Human {
    static int humans = 0;
    String name;
    int age;
    boolean alive;

    Human(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
        humans++;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.alive = true;
        humans++;
    }


}
