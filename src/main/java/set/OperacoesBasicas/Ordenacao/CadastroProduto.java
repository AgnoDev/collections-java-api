package main.java.set.OperacoesBasicas.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> setProduto;

    public CadastroProduto() {
        this.setProduto = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        setProduto.add(new Produto(codigo, nome, quantidade, preco));
    }

    public Set<Produto> exibirPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(setProduto);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(setProduto);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Produto 5", 5, 15d);
        cadastroProduto.adicionarProduto(2L, "Produto 8", 10, 20d);
        cadastroProduto.adicionarProduto(1L, "Produto 3", 2, 10d);
        cadastroProduto.adicionarProduto(9L, "Produto 9", 2, 2d);

        System.out.println(cadastroProduto.setProduto);


        System.out.println(cadastroProduto.exibirPorNome());


        System.out.println(cadastroProduto.exibirPorPreco());
    }
}

