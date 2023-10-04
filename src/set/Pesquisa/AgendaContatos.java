package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contatos> contatosSet;


    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contatos(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatosSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new HashSet<>();
        for (Contatos c: contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        for (Contatos c:contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 389312);
        agendaContatos.adicionarContato("Camila", 334144);
        agendaContatos.adicionarContato("Camila 1", 542134);
        agendaContatos.adicionarContato("Camila Silva", 93783);
        agendaContatos.adicionarContato("Maria Silva", 872631);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado "+ agendaContatos.atualizarNumeroContato("Maria Silva", 111111111));

        agendaContatos.exibirContato();
    }

}
