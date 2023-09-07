package main.java.map.Pesquisa;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Long, Produto> mapEstoque;

    public Estoque() {
        this.mapEstoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        mapEstoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(mapEstoque);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!mapEstoque.isEmpty()) {
            for (Produto p : mapEstoque.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!mapEstoque.isEmpty()) {
            for (Produto p : mapEstoque.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.exibirProduto();


        estoque.adicionarProduto(1L, "Produto A", 10, 5.0 );
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0 );
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0 );
        estoque.adicionarProduto(4L, "Produto D", 2, 20.0 );

        estoque.exibirProduto();

        System.out.println("Valor total do estoque:" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro:" + estoque.obterProdutoMaisCaro());
    }
}
