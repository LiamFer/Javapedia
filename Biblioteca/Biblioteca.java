package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private HashMap<Integer, Livro> livros = new HashMap<>();
    private ArrayList<Membro> membros = new ArrayList<>();

    Biblioteca adicionarLivro(Livro livro) {
        this.livros.put(livro.ISBN, livro);
        return this;
    }

    Biblioteca removerLivro(int ISBN) {
        Livro removed = this.livros.remove(ISBN);
        if (removed == null) {
            Livro.livroNaoEncontrado(ISBN);
        }
        System.out.println("Livro com ISBN " + ISBN + " foi removido da Biblioteca!");
        return this;

    }

    Biblioteca emprestarLivro(Membro membro, int ISBN) {
        Livro livro = livros.get(ISBN);
        if (livro == null) {
            Livro.livroNaoEncontrado(ISBN);
        }
        livros.remove(ISBN);
        membro.pegarLivro(livro);
        return this;
    }

    Biblioteca devolverLivro(Membro membro,int ISBN){
        livros.put(ISBN,membro.retornarLivro(ISBN));
        return this;
    }

    Biblioteca adicionarMembro(Membro membro){
        this.membros.add(membro);
        return this;
    }

    void listarMembros(){
        membros.forEach(membro -> System.out.println(membro));
    }

    void listarLivros() {
        livros.forEach((ISBN, livro) -> {
            System.out.println(livro);
            System.out.println("----------");
        });
    }



}
