package fundamentals;

public class inheritance {
    public static void main (String[] args){

        Soldier[] hawks = new Soldier[2];
        Archer[] archSquad = new Archer[2];
        Soldier guts = new Soldier("Guts",20,"Dragonslayer");
        Soldier griffith = new Soldier("Griffith",19,"Rapier");
        Archer linus = new Archer("Linus",20,"Balestra");
        Archer legolas = new Archer("Legolas",322,"Bow");
        hawks[0] = griffith;
        hawks[1] = guts;
        archSquad[0] = linus;
        archSquad[1] = legolas;

        for(int i = 0; i < hawks.length;i++){
            hawks[i].attack();
            archSquad[i].attack();
        }

    }
}
