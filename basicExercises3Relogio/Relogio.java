package basicExercises3Relogio;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    Relogio(int hora,int minuto,int segundo){
        if (hora < 0 || hora > 23){
            throw new TempoInvalido("Hora Inválida!");
        }
        checkValue(minuto);
        checkValue(segundo);
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    private void checkValue(int value){
        if(value > 59 || value < 0){
            throw new TempoInvalido("Tempo não pode ser maior que 59 ou menor que 0!");
        }
    }

    void nextHour(){
        if(hora == 23){
            hora = 0;
        } else {
            hora+=1;
        }
    }

    void nextMinute(){
        if(minuto == 59){
            minuto = 0;
            nextHour();
        } else {
            minuto+=1;
        }
    }

    void nextSecond(){
        if(segundo == 59){
            segundo = 0;
            nextMinute();
        } else {
            segundo++;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
}
