package fundamentals;

public class anonymousClasses {
    public static void main (String[] args){
        Dog dog1 = new Dog("Maylon");

        // Anonymous Class {} Brackets
        Dog barney = new Dog("Barney"){
            @Override
            void sayName(){
                System.out.println("Hello human my name is " + this.name + "!");
            }
        };

        dog1.sayName();
        barney.sayName();
    }
}
