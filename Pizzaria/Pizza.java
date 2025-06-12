package Pizzaria;

public class Pizza {
    private Sabor sabor;
    private int quantidade;

    Pizza(Sabor sabor, int quantidade){
        this.sabor = sabor;
        this.quantidade = quantidade;
    }

    double getPreco(){
        return quantidade * sabor.PRICE();
    }

    @Override
    public String toString(){
        return quantidade + " Pizza(s) de " + sabor;
    }

}
