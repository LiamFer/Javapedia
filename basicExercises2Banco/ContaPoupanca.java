package basicExercises2Banco;

public class ContaPoupanca extends Conta{
    double rendimento;
    ContaPoupanca(int numero,String nome,double rendimento){
        super(numero, nome);
        this.rendimento = rendimento;
    }
    ContaPoupanca(int numero,String nome,double saldo,double rendimento){
        super(numero, nome, saldo);
        this.rendimento = rendimento;
    }
}
