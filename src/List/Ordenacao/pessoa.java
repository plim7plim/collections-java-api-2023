package Ordenacao;

import java.util.Comparator;

public class pessoa implements Comparable<pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(pessoa p) { //comparacao com pessoa
        return Integer.compare(idade, p.getIdade()); //compara duas idades para ver se uma é maior do que a outra
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", idade= " + idade +
                ", altura= " + altura ;
    }

}
class ComparatorPorAltura implements Comparator<pessoa>{
    @Override
    public int compare(pessoa p1, pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura()); //comparacao por altura
    }

}
