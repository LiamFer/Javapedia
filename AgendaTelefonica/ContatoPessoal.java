package AgendaTelefonica;

public class ContatoPessoal extends Contato {
    String apelido;
    String parentesco;

    ContatoPessoal(String nome, String telefone,String apelido,String parentesco){
        super(nome, telefone);
        this.apelido = apelido;
        this.parentesco = parentesco;
    }
    ContatoPessoal(String nome, String email, String telefone, String endereco, int dataNascimento,String apelido,String parentesco){
        super(nome, email, telefone, endereco, dataNascimento);
        this.apelido = apelido;
        this.parentesco = parentesco;
    }

    @Override
    public String displayInformation(){

    }
}
