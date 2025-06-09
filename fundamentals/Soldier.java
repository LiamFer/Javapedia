package fundamentals;

public class Soldier extends Human{
    String weapon;

    Soldier(String name,int age,String weapon){
        super(name,age);
        this.weapon = weapon;
    }

    Soldier(String name,int age,boolean alive,String weapon){
        super(name,age,alive);
        this.weapon = weapon;
    }

    void attack(){
        System.out.println(this.name + " is swinging his " + this.weapon + "!");
    }

    @Override
    public String toString(){
        return String.format("NAME: %s\nAGE: %d\nALIVE: %b\nWEAPON: %s",this.name,this.age,this.alive,this.weapon);
    }

}
