package Pizzaria;

public enum Sabor {
    CALABRESA(1, 47), MISTA(2, 54), FRANGO(3, 40), LOMBO(4, 50);
    private double valor;

    Sabor(int sabor, double valor) {
        this.valor = valor;
    }

    public double PRICE() {
        return valor;
    }
}
