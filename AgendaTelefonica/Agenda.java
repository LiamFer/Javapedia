package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Contato> contatos = new ArrayList<>();

    void adicionarContato() {
        Scanner sc = this.sc;
        System.out.print("Que tipo de Contato deseja incluir:\n1. Pessoal\n2. Profissional\n");

        int contactType = sc.nextInt();
        sc.nextLine();

        if (contactType == 1) {
            adicionarContatoPessoal();
        } else if (contactType == 2) {
            adicionarContatoProfissional();
        } else {
            System.out.println("COMMAND ERROR");
        }

    }

    void visualizarContatos(){
        for(Contato contato: this.contatos){
            contato.displayInformation();
        }
    }

    private void adicionarContatoPessoal() {
        Scanner sc = this.sc;
        String nome, email, telefone, endereco, apelido, parentesco;
        int dataNascimento;

        String[] basicData = dadosBasicos();
        nome = basicData[0];
        email = basicData[1];
        telefone = basicData[2];
        endereco = basicData[3];

        System.out.println("Qual a Data de Nascimento: ");
        dataNascimento = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual o Apelido: ");
        apelido = sc.nextLine();

        System.out.println("Qual o Parentesco: ");
        parentesco = sc.nextLine();

        this.contatos.add(new ContatoPessoal(nome, email, telefone, endereco, dataNascimento, apelido, parentesco));
    }
    private void adicionarContatoProfissional() {
        Scanner sc = this.sc;
        String nome, email, telefone, endereco, empresa, cargo;
        int dataNascimento;

        String[] basicData = dadosBasicos();
        nome = basicData[0];
        email = basicData[1];
        telefone = basicData[2];
        endereco = basicData[3];

        System.out.println("Qual a Data de Nascimento: ");
        dataNascimento = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual a Empresa: ");
        empresa = sc.nextLine();

        System.out.println("Qual o Cargo: ");
        cargo = sc.nextLine();

        this.contatos.add(new ContatoProfissional(nome, email, telefone, endereco, dataNascimento, empresa, cargo));

    }
    private String[] dadosBasicos() {
        Scanner sc = this.sc;
        String[] infos = new String[4];

        System.out.println("Qual o nome: ");
        infos[0] = sc.nextLine();

        System.out.println("Qual o email: ");
        infos[1] = sc.nextLine();

        System.out.println("Qual o telefone: ");
        infos[2] = sc.nextLine();

        System.out.println("Qual o endereco: ");
        infos[3] = sc.nextLine();

        return infos;
    }

}
