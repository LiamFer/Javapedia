package basicExercises4;

public class TestaReservas {
    public static void main(String[] args) {
        Sala sala = new Sala("Sala 101",5);
        Reserva r1 = new Reserva("10/09/2025","10:00","12:00","William");
        Reserva r2 = new Reserva("10/09/2025","10:00","14:00","Maycon");


        sala.adicionarReserva(r1);
        sala.adicionarReserva(r2);
//        sala.adicionarReserva(r3);
//        sala.adicionarReserva(r4);
    }
}
