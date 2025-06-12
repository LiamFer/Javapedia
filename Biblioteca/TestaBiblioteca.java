package Biblioteca;

public class TestaBiblioteca {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Membro maycon = new Membro(1,"Maycon",20);
        biblioteca.adicionarMembro(maycon);
        biblioteca.adicionarLivro(new Livro(1,"Senhor dos Anéis",364,"Tolkien")).adicionarLivro(new Livro(2,"Hobbit",334,"Tolkien"));
        biblioteca.listarLivros();
        biblioteca.emprestarLivro(maycon,1);
        biblioteca.devolverLivro(maycon,1).listarLivros();
        biblioteca.listarMembros();
    }
}
