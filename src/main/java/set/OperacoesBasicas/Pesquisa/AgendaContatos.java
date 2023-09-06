package main.java.set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContato;

    public AgendaContatos() {
        this.setContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        setContato.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(setContato);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : setContato){
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : setContato) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setContato(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cal", 111111);
        agendaContatos.adicionarContato("Camila Dio", 789456);
        agendaContatos.adicionarContato("Maria Silva", 111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato Atualizado:" + agendaContatos.atualizarContato("Maria Silva", 555555));
    }
}
