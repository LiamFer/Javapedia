package Biblioteca;
import java.util.HashMap;
import java.util.Map;

public class Membro {
    int matricula;
    String nome;
    int idade;
    HashMap<Integer,Livro> livros = new HashMap();

    Membro(int matricula,String nome,int idade){
        this.matricula=matricula;
        this.nome = nome;
        this.idade = idade;
    }

    void pegarLivro(Livro livro){
        livros.put(livro.ISBN,livro);
        System.out.printf("%s pegou %s emprestado!\n",nome,livro.nome);
    }

    Livro retornarLivro(Integer ISBN){
        Livro livro = livros.get(ISBN);
        if (livro == null){
            Livro.livroNaoEncontrado(ISBN);
        }
        livros.remove(ISBN);
        System.out.printf("%s devolveu o livro %s!\n",nome,livro.nome);
        return livro;
    }

    void livrosEmprestados(){
        livros.forEach((ISBN,livro) -> System.out.println(livro));
    }

    @Override
    public String toString(){
        StringBuilder member = new StringBuilder();
        member.append("--------------\n");
        member.append(nome).append("\n");
        for(Map.Entry<Integer,Livro> livroEntry : livros.entrySet()){
            Livro livro = livroEntry.getValue();
            member.append(livro.nome).append("\n");
        }
        member.append("--------------");
        return member.toString();
    }

}
