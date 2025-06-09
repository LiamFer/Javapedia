package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Contato> contatos = new ArrayList<>();

    void adicionarContato(){
        Scanner sc = this.sc;
        System.out.print("Que tipo de Contato deseja incluir:\n1. Pessoal\n2. Profissional\n");

        int contactType = sc.nextInt();
        sc.nextLine();

        if(contactType == 1){
            adicionarContatoPessoal();
        } else if (contactType == 2){
            adicionarContatoProfissional();
        } else {
            System.out.println("COMMAND ERROR");
        }

    }

    private void adicionarContatoPessoal(){
        Scanner sc = this.sc;

    }

    private void adicionarContatoProfissional(){
        Scanner sc = this.sc;

    }

}
