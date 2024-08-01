package Livro;
import java.util.ArrayList;
import  java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String Titulo, String Autor, int AnoPublicacao){
        livroList.add(new Livro(Titulo, Autor, AnoPublicacao)); //para um livro ser add precisa dos tres parametros
    }

    public List<Livro> PesquisarPorAutor(String Autor){

        List<Livro>livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
         for (Livro l: livroList){
             if (l.getAutor().equalsIgnoreCase(Autor)){
                 livrosPorAutor.add(l);
             }
         }
        }
        return livrosPorAutor;
    }



    public List<Livro>pesquisarPorIntervalo(int AnoInicial, int AnoFinal){
        List<Livro>LivrosPorIntervao = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao()>= AnoInicial && l.getAnoPublicacao()<=AnoFinal)   //se esse livro estiver no começo do ano inicial ou no final do ano final ele vai ser add a este array
            LivrosPorIntervao.add(l); //esse livro "l" vai ser add ao elemento LivrosPorIntervalo
            }
        }
        return LivrosPorIntervao;
    }

    public Livro pesquisarPorTitulo(String Titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(Titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivro.PesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivro.pesquisarPorIntervalo(2020, 2022));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));  //so vai me retornar o de 2020 pois ele foi o primeiro a ser adicionado





    }



}
