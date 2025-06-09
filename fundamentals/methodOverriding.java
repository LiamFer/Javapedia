package fundamentals;

public class methodOverriding {
    public static void main(String[] args){
        Dog barney = new Dog("Barney");
        Cat tom = new Cat("Tom");

        tom.speak();
        barney.speak();
    }
}
