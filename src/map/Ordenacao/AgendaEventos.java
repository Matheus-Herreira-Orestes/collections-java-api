package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
         LocalDate dataAtual = LocalDate.now();
         LocalDate proximaData = null;
         Evento proximoEvento = null;
         Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
         for (Map.Entry<LocalDate, Evento> entry:eventoMap.entrySet()){
             if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                 proximaData = entry.getKey();
                 proximoEvento = entry.getValue();
                 System.out.println("O proximo evento: " +proximoEvento + " acontecerá na data " + proximaData);
                 break;
             }
         }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 28), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 12), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 4), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.DECEMBER, 3), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 6), "Evento 5", "Atracao 5");


        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
