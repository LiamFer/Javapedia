package basicExercises2Funcionario;

public abstract class Funcionario extends Pessoa implements CLT{
    private double salario = 2000;

    Funcionario(){}
    Funcionario(int codigo,String nome){
        super(codigo,nome);
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    public double getTax(){
        return 10;
    }

    @Override
    public void imprimirFolhaPagamento() {
        System.out.printf("%s recebe R$ %.2f no total com a taxa de %.0f%%\n",getNome(),(salario+(salario*(getTax()/100))),getTax()); ;
    }
}
