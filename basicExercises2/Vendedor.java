package basicExercises2;

public class Vendedor extends Funcionario{
    Vendedor(int codigo,String nome){
        super(codigo,nome);
    }

    @Override
    public double getTax(){
        return 25;
    }
}
