package basicExercises3Relogio;

public class TestaRelogio {
    public static void main(String[] args) {
        Relogio rel = new Relogio(22,59, 59);
        System.out.println(rel);
        rel.nextSecond();
        System.out.println(rel);
        rel.nextHour();
        System.out.println(rel);
    }
}
