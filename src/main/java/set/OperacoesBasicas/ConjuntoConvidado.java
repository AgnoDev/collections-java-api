package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidado(){
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        setConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoARemover = null;
        for(Convidado c : setConvidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoARemover = c;
                break;
            }
        }
        setConvidados.remove(convidadoARemover);
    }

    public int contarConvoidados() {
        return setConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(setConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Nº de convidados:" + conjuntoConvidado.contarConvoidados());
        conjuntoConvidado.exibirConvidados();

        conjuntoConvidado.adicionarConvidado("Convidado 1", 120);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 121);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 121);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 123);

        System.out.println("Nº de convidados:" + conjuntoConvidado.contarConvoidados());

        conjuntoConvidado.removerConvidado(120);
        System.out.println("Nº de convidados:" + conjuntoConvidado.contarConvoidados());

        conjuntoConvidado.exibirConvidados();
    }
}
