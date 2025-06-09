package fundamentals;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void sayName(){
        System.out.printf("The dog name is %s!\n",this.name);
    }


}
