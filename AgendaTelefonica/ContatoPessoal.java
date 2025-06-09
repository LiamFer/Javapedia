package AgendaTelefonica;

import java.time.Year;

public class ContatoPessoal extends Contato {
    private String apelido;
    private String parentesco;

    ContatoPessoal(String nome, String telefone, String apelido, String parentesco) {
        super(nome, telefone);
        this.apelido = apelido;
        this.parentesco = parentesco;
    }

    ContatoPessoal(String nome, String email, String telefone, String endereco, int dataNascimento, String apelido, String parentesco) {
        super(nome, email, telefone, endereco, dataNascimento);
        this.apelido = apelido;
        this.parentesco = parentesco;
    }

    String getApelido() {
        return this.apelido;
    }
    void setApelido(String apelido) {
        this.apelido = apelido;
    }

    String getParentesco() {
        return this.parentesco;
    }
    void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void displayInformation() {
        System.out.printf("Nome: %s\n" +
                "Apelido: %s\n" +
                "Parentesco: %s\n" +
                "Telefone: %s\n" +
                "Email: %s\n" +
                "Endereço: %s\n" +
                "Idade: %d\n",this.getNome(),this.getApelido(),this.getParentesco(),this.getTelefone(),this.getEmail(),this.getEndereco(), Year.now().getValue() - getDataNascimento());
    }
}
