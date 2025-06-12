package Biblioteca;

import java.util.Scanner;

public class TestaBiblioteca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Membro maycon = new Membro(1,"Maycon",20);
        boolean running = true;
        do {
            System.out.println("Bem vindo a Biblioteca escolha a operação que deseja realizar:\n" +
                    "1.Adicionar Livro\n" +
                    "2.Remover Livro\n" +
                    "3.Emprestar Livro\n" +
                    "4.Devolver Livro\n" +
                    "5.Adicionar Membro\n" +
                    "6.Listar Membros\n" +
                    "7.Listar Livros");
            int option = sc.nextInt();
            switch (option){
                case 1 -> biblioteca.adicionarLivro(Livro.novoLivro());
                case 2 -> biblioteca.removerLivro();
                case 3 -> biblioteca.emprestarLivro(Livro.novoLivro());
                case 4 -> biblioteca.adicionarLivro(Livro.novoLivro());
                case 5 -> biblioteca.adicionarLivro(Livro.novoLivro());
                case 6 -> biblioteca.adicionarLivro(Livro.novoLivro());
                case 7 -> biblioteca.adicionarLivro(Livro.novoLivro());
            }
        } while (running);
    }
}
