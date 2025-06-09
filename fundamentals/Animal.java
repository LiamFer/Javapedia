package fundamentals;

public abstract class Animal {
    public String name;

    Animal(String name){
        this.name = name;
    }

    abstract void sayName();

    void speak(){
        System.out.printf("%s is roaring!", this.name);
    }
}
