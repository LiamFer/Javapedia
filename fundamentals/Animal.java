package fundamentals;

public class Animal {
    public String name;

    Animal(String name){
        this.name = name;
    }

    void speak(){
        System.out.printf("%s is roaring!", this.name);
    }
}
