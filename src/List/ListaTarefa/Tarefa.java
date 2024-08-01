package ListaTarefa;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {  //criei um construtor alt + inserct
        this.descricao = descricao;
    }

    public String getDescricao() {  //metodo para pegar o objeto Descricao
        return descricao;
    }

    @Override
    public String toString() {
        return "ListaTarefa.Tarefa: "  +descricao;
    }
}
