package basicExercises3Ingresso;

public class TestaIngresso {
    public static void main (String[] args){
        Ingresso ticket = new Ingresso(10);
        System.out.println(ticket);
        IngressoVIP ticketVIP = new IngressoVIP(10,5);
        System.out.println(ticketVIP);

    }
}
