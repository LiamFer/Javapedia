package fundamentals;

public class Archer extends Soldier {

    Archer(String name, int age, String weapon) {
        super(name, age, weapon);
    }

    Archer(String name, int age, boolean alive, String weapon) {
        super(name, age, alive, weapon);
    }

    void attack() {
        System.out.println(this.name + " is shooting with his " + this.weapon + "!");
    }
}
