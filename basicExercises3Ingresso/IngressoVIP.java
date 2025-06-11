package basicExercises3Ingresso;

public class IngressoVIP extends Ingresso{
    private double adicional;
    IngressoVIP(double valor,double adicional){
        super(valor);
        this.adicional = adicional;
    }

    double getAdicional(){return this.adicional;}
    void setAdicional(double adicional){this.adicional=adicional;}

    @Override
    public String toString(){
        return "O Ingresso VIP custa R$" + (getValor()+getAdicional());
    }
}
