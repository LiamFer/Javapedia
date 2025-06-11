package basicExercises2Banco;

public class TestaBanco {
    public static void main(String[] args) {
        ContaCorrente william = new ContaCorrente(1,"William",true);
        ContaPoupanca maycon = new ContaPoupanca(2,"Maycon",2000,10);

        william.sacar(10);
        william.depositar(3400);
        william.sacar(20);
        william.verificarSaldo();

        maycon.sacar(2000);
        maycon.depositar(33400);
        maycon.sacar(20);
        maycon.verificarSaldo();
    }
}
