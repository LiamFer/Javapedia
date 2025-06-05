package fundamentals;

public class enhancedSwitch {
    public static void main(String[] args){
        String day = "Monday";
        switch (day){
            case "Monday" -> System.out.println("Its a weekday 😒");
            default -> System.out.println("What??");
        }
    }
}
