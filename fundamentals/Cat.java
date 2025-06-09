package fundamentals;

public class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    void speak(){
        System.out.printf("%s is mewoing!",this.name);
    }
}
