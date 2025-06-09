package AgendaTelefonica;

import java.time.Year;

public class ContatoProfissional extends Contato{
    private String empresa;
    private String cargo;

    ContatoProfissional(String nome, String telefone, String empresa, String cargo) {
        super(nome, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    ContatoProfissional(String nome, String email, String telefone, String endereco, int dataNascimento, String empresa, String cargo) {
        super(nome, email, telefone, endereco, dataNascimento);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    String getEmpresa() {
        return this.empresa;
    }
    void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    String getCargo() {
        return this.cargo;
    }
    void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void displayInformation() {
        System.out.printf("Nome: %s\n" +
                "Empresa: %s\n" +
                "Cargo: %s\n" +
                "Telefone: %s\n" +
                "Email: %s\n" +
                "Endereço: %s\n" +
                "Idade: %d\n",this.getNome(),this.getEmpresa(),this.getCargo(),this.getTelefone(),this.getEmail(),this.getEndereco(), Year.now().getValue() - getDataNascimento());
    }
}
