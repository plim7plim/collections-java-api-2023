package Livro;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }  //construtor para todos os atributos passado acima


    //metodos String
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    @Override
    public String toString() {
        return "Livro: " + titulo + " - Autor: " + autor + " - Ano de Publicação: " + anoPublicacao;
    }
}