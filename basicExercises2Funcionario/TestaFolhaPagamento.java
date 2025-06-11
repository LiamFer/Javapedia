package basicExercises2Funcionario;

public class TestaFolhaPagamento {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(1,"Mayco");
        Telefonista telefonista = new Telefonista(2,"Mayca");
        Gerente gerente = new Gerente(3,"Maycão");
        vendedor.imprimirFolhaPagamento();
        telefonista.imprimirFolhaPagamento();
        gerente.imprimirFolhaPagamento();
    }
}
