package fundamentals;

public class Soldier extends Human{
    String gun;

    Soldier(String name,int age,String gun){
        super(name,age);
        this.gun = gun;
    }

    Soldier(String name,int age,boolean alive,String gun){
        super(name,age,alive);
        this.gun = gun;
    }

    void fire(){
        System.out.println(this.name + " is shooting using a " + this.gun + "!");
    }
}
