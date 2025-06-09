package fundamentals;

public class Cat extends Animal implements Predator,Prey{
    Cat(String name){
        super(name);
    }

    @Override
    void speak(){
        System.out.printf("%s is mewoing!",this.name);
    }

    void sayName(){
        System.out.printf("The cat name is %s",this.name);
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
