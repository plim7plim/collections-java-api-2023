package ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>(); //sempre que eu criar um objeto ele me retorna com uma lista de Array
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }  //metodo de add

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t); //se for igual eu vou tirar ele
            }
        }  //remover uma tarefa

        tarefaList.removeAll(tarefasParaRemover);  //remova tudo q tiver dentro da lista tarefas remover
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); //metodo que retorna um array em um numero inteiro
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("ListaTarefa.Tarefa 1");
        listaTarefa.adicionarTarefa("ListaTarefa.Tarefa 2");
        listaTarefa.adicionarTarefa("ListaTarefa.Tarefa 3");
        listaTarefa.adicionarTarefa("ListaTarefa.Tarefa 4");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("ListaTarefa.Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
