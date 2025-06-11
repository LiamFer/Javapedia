package basicExercises3Ingresso;

public class Ingresso {
    private double valor;
    Ingresso(double valor){
        this.valor = valor;
    }

    double getValor(){return this.valor;}
    void setValor(double valor){this.valor = valor;}

    @Override
    public String toString(){
        return "O Ingresso custa R$"+valor;
    }
}
