package basicExercises2Banco;

public abstract class Conta {
    int numero;
    String nome;
    double saldo;
    Conta(int numero,String nome){
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }
    Conta(int numero,String nome,double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    void sacar(double valor){
        if(valor <= saldo){
            saldo-=valor;
            System.out.printf("Você sacou R$%.2f seu saldo agora é R$%.2f\n",valor,saldo);
        } else{
            System.out.println("VOCÊ NÃO PODE SACAR MAIS DO QUE POSSUI!");
        }
    }
    void depositar(double valor){
        saldo+=valor;
        System.out.printf("Você depositou R$%.2f agora seu Saldo é R$%.2f!\n",valor,saldo);
    }
    void verificarSaldo(){
        System.out.printf("Seu saldo atual é R$%.2f\n",saldo);
    }
}
