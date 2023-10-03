package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTareda(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemove.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemove);
    }

    public int obterNumetoTotalTaredas(){
        return tarefaList.size();
    }

    public void obterDescricoesTaredas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalTaredas());

        listaTarefa.adicionarTareda("Tarefa 1");
        listaTarefa.adicionarTareda("Tarefa 1");
        listaTarefa.adicionarTareda("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalTaredas());

        listaTarefa.removerTarefa(("Tarefa 2"));
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumetoTotalTaredas());

        listaTarefa.obterDescricoesTaredas();


    }
}
