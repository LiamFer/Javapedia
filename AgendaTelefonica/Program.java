package AgendaTelefonica;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean keepRunning = true;

        do {
            System.out.println("Escolha uma opção:\n1. Ver Contatos\n2. Adicionar Contato");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 -> agenda.visualizarContatos();
                case 2 -> agenda.adicionarContato();
            }

            System.out.print("Deseja continuar mexendo na Agenda (s/n): ");
            keepRunning = sc.nextLine().equalsIgnoreCase("s");
        } while(keepRunning);


    }
}
