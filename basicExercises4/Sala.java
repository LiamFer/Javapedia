package basicExercises4;

import java.util.ArrayList;

public class Sala {
    String nome;
    int capacidade;
    ArrayList<Reserva> reservas = new ArrayList<>();

    Sala(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    void adicionarReserva(Reserva reserva) {
        if (reservas.size() >= capacidade) {
            System.out.println("Capacidade Total de Reservas feita!");
        } else if (verificarDisponibilidade(reserva.data, reserva.horaInicio, reserva.horaFim)) {
            reservas.add(reserva);
        } else {
            System.out.println("CONFLITO DE DATAS/HORÁRIO!");
        }
    }

    boolean verificarDisponibilidade(String data, String horaInicio, String horaFim) {
        int start = Integer.parseInt(horaInicio.substring(0,2));
        int end = Integer.parseInt(horaFim.substring(0,2));
        for(Reserva r : reservas){
            int rstart = Integer.parseInt(r.horaInicio.substring(0,2));
            int rend = Integer.parseInt(r.horaFim.substring(0,2));

            if (r.data.equals(data)){
                if((start >= rstart && start < rend) || (end >= rstart && end <= rend)){
                    return false;
                } else if((rstart >= start && rstart < end) || (rend > start && rend < end)){
                    return false;
                }
            }
        }
        return true;
    }
}
