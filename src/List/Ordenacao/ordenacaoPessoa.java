package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPessoa {
    private List<pessoa> pessoaList;

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new pessoa(nome, idade, altura));
    }

   public List<pessoa> ordenarPorIdade(){
        List<pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
   }

   public List<pessoa> ordenarPorAltura(){
       List<pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
       return pessoasPorAltura;
   }

    public static void main(String[] args) {
        ordenacaoPessoa ordenacaoPessoa = new ordenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 22, 1.66);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 26, 1.86);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 29, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 90, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
