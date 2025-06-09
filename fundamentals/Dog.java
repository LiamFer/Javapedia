package fundamentals;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void speak(){
        System.out.printf("%s is barking!",this.name);
    }
}
