package basicExercises2;

public abstract class Pessoa {
    private int codigo;
    private String nome;

    Pessoa() {
    }

    Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    int getCodigo() {
        return this.codigo;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}
