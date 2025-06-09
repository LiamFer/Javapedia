package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Contato> contatos = new ArrayList<>();

    void adicionarContato() {
        System.out.print("Que tipo de Contato deseja incluir:\n1. Pessoal\n2. Profissional\n");

        int contactType = sc.nextInt();
        sc.nextLine();

        if (contactType == 1) {
            adicionarContatoPessoal();
            System.out.println("=====CONTATO ADICIONADO=====");

        } else if (contactType == 2) {
            adicionarContatoProfissional();
            System.out.println("=====CONTATO ADICIONADO=====");
        } else {
            System.out.println("COMMAND ERROR");
        }

    }

    void removerContato(){
        System.out.print("Qual o ID do Contato: ");
        int contactIndex = sc.nextInt();
        sc.nextLine();
        if (contactIndex <= contatos.size() && contactIndex >= 0){
            String nome = contatos.get(contactIndex).getNome();
            contatos.remove(contactIndex-1);
            System.out.println(nome + " foi Removido da Agenda!");
        } else {
            System.out.println("Contato Não Encontrado - ERRO!");
        }
    }

    void visualizarContatos() {
        System.out.println("=====CONTATOS=====");
        for (int i = 0; i < this.contatos.size();i++) {
            Contato contato = this.contatos.get(i);
            System.out.println("-----  -----");
            System.out.println(i+1+". Contato");
            contato.displayInformation();
            System.out.println("-----  -----");
        }
        System.out.println("=====  FIM   =====");

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

        contatos.add(new ContatoPessoal(nome, email, telefone, endereco, dataNascimento, apelido, parentesco));
    }

    private void adicionarContatoProfissional() {
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

        contatos.add(new ContatoProfissional(nome, email, telefone, endereco, dataNascimento, empresa, cargo));

    }

    private String[] dadosBasicos() {
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
