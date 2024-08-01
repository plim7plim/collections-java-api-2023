package SetInterface;

import java.util.Objects;

public class Convidados {
    private String nome;
    private int codigoConvite;

    public Convidados(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return nome +" " +codigoConvite ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidados that = (Convidados) o;
        return getCodigoConvite() == that.getCodigoConvite();
    } //comparacao atraves do codigo convite

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados Dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1237);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados Dentro do set de convidados");

        conjuntoConvidados.removerConvidadosPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados Dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();


    }

    //so tem 4 pois um fraudou e está com o mesmo codigo de outro
}
