package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }


    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }

        return numeroPorNome;
    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 389312);
        agendaContatos.adicionarContato("Camila", 334144);
        agendaContatos.adicionarContato("Camila 1", 542134);
        agendaContatos.adicionarContato("Camila Silva", 93783);
        agendaContatos.adicionarContato("Maria Silva", 872631);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();
    }


}
