package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapAgenda;

    public AgendaContatos() {
        this.mapAgenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        mapAgenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!mapAgenda.isEmpty()){
            mapAgenda.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(mapAgenda);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!mapAgenda.isEmpty()){
            numeroPorNome = mapAgenda.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nome 1", 123);
        agendaContatos.adicionarContato("Nome 1", 456);
        agendaContatos.adicionarContato("Nome 2", 789);
        agendaContatos.adicionarContato("Nome 3", 147);
        agendaContatos.adicionarContato("Nome 4", 123);
        agendaContatos.adicionarContato("Nome 1", 258);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Nome 4");

        agendaContatos.exibirContato();

        System.out.println("Pesquisa n° por nome:" + agendaContatos.pesquisarPorNome("Nome 3"));
    }
}
