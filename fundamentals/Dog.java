package fundamentals;

public class Dog extends Animal implements Prey, Predator {
    Dog(String name) {
        super(name);
    }

    void sayName() {
        System.out.printf("The dog name is %s!\n", this.name);
    }

    @Override
    public void flee() {
        System.out.println("THE DOG IS FLEEING!");
    }

    @Override
    public void hunt() {
        System.out.println("THE DOG IS HUNTING!");
    }


}
