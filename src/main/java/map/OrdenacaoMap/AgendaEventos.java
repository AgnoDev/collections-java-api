package main.java.map.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> mapEventos;

    public AgendaEventos() {
        this.mapEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        mapEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapEventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapEventos);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Próximo atração: " + entry.getValue() + " Próxima data: " + entry.getKey() + "||");
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 10), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 10), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
