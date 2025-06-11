package basicExercises2Funcionario;

public class Gerente extends Funcionario{
    Gerente(int codigo, String nome){
        super(codigo,nome);
    }
    public double getTax(){
        return 45;
    }
}
