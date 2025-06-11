package basicExercises3Retangulo;

public class Retangulo {
    private double comprimento;
    private double largura;

    Retangulo(double comprimento, double largura) {
        validaValor(comprimento);
        validaValor(largura);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    double getComprimento() {
        return comprimento;
    }
    void setComprimento(double valor) {
        validaValor(valor);
        this.comprimento = valor;
    }

    double getLargura() {
        return largura;
    }
    void setLargura(double valor) {
        validaValor(valor);
        this.largura = valor;
    }

    double area() {
        double calc = comprimento * largura;
        System.out.println("A Área desse Retangulo é " + calc);
        return calc;
    }

    double perimetro() {
        double calc = 2 * (comprimento + largura);
        System.out.println("O Perímetro do Retangulo é " + calc);
        return calc;
    }

    private void validaValor(double valor) {
        if (valor >= 20 || valor <= 0) {
            throw new InvalidMeasure("O valor deve ser maior que 0 e menor que 20!");
        }
    }

}
