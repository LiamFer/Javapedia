package fundamentals;

public class Cat extends Animal{
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
}
