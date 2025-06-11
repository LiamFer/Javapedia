package basicExercises2Banco;

public class ContaCorrente extends Conta {
    boolean cheque;
    ContaCorrente(int numero, String nome, boolean cheque) {
        super(numero, nome);
        this.cheque = cheque;
    }
    ContaCorrente(int numero, String nome, double saldo, boolean cheque) {
        super(numero, nome, saldo);
        this.cheque = cheque;
    }
}
