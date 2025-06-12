package Biblioteca;

public class Livro {
    int ISBN;
    String nome;
    int paginas;
    String autor;

    Livro(int ISBN,String nome,int paginas,String autor){
        this.ISBN = ISBN;
        this.nome = nome;
        this.paginas = paginas;
        this.autor = autor;
    }

    @Override
    public String toString(){
        return String.format("ISBN: %d\nNome: %s\nQTD Paginas: %d\nAutor: %s",ISBN,nome,paginas,autor);
    }

    public static void livroNaoEncontrado(int ISBN) throws LivroNaoEncontrado {
        throw new LivroNaoEncontrado("O livro com ISBN " + ISBN + " não foi encontrado na Biblioteca!");
    }
}
