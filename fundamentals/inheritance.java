package fundamentals;

public class inheritance {
    public static void main (String[] args){
        Soldier guts = new Soldier("Guts",20,"Ballista");
        Soldier griffith = new Soldier("Griffith",19,"Crossbow");

        Soldier[] hawks = new Soldier[2];
        hawks[0] = griffith;
        hawks[1] = guts;

        for(Soldier soldier: hawks){
            soldier.attack();
        }
    }
}
