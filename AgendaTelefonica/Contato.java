package AgendaTelefonica;

public abstract class Contato implements Displayabe {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int dataNascimento;

    Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    Contato(String nome, String email, String telefone, String endereco, int dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }

    String getEmail() {
        return this.email;
    }
    void setEmail(String email) {
        this.email = email;
    }

    String getTelefone() {
        return this.telefone;
    }
    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String getEndereco() {
        return this.endereco;
    }
    void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    int getDataNascimento() {
        return this.dataNascimento;
    }
    void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
